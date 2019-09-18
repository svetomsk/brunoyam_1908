package multithreading;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MatrixMultiplier {
    public static void main(String[] args) throws InterruptedException {
        int n = 1200;
        int [][] A = randomMatrix(n);
        int [][] B = randomMatrix(n);

        long firstTime = timeWrap(new Runnable() {
            @Override
            public void run() {
//                multiply(A, B, n);
            }
        });

        long secondTime = timeWrap(new Runnable() {
            @Override
            public void run() {
                try {
                    multiplyParallel(A, B, n);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("First: " + firstTime);
        System.out.println("Second: " + secondTime);
        System.out.println("Ratio: " + Math.floor((1.0 - (double)secondTime / (double)firstTime) * 100.0));
//        printMatrix(multiply(A, B, n));
//        printMatrix(multiplyParallel(A, B, n));

    }

    public static long timeWrap(Runnable task) {
        long start = System.currentTimeMillis();
        task.run();
//        System.out.println("Time spent: " + (System.currentTimeMillis() - start));
        return System.currentTimeMillis() - start;
    }

    public static int [][] multiplyParallel(int [][] a, int [][] b, int n) throws InterruptedException {
        int [][] c = new int[n][n];

        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        int poolSize = 4 ;
        ThreadPoolExecutor executor = new ThreadPoolExecutor(poolSize, poolSize, 1, TimeUnit.SECONDS, queue);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int finalI = i;
                int finalJ = j;
                Runnable task = new Runnable() {
                    @Override
                    public void run() {
                        for (int k = 0; k < n; k++) {
                            c[finalI][finalJ] += a[finalI][k] * b[k][finalJ];
                        }
                    }
                };
                executor.execute(task);
            }
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);

        return c;
    }

    // последовательный вариант перемножения матриц
    public static int [][] multiply(int [][] a, int [][] b, int n) {
        int [][] c = new int[n][n];
        for (int i = 0; i < n; i++) { // перебираем индексы строк
            for (int j = 0; j < n; j++) { // перебираем индексы столбцов
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static int [][] randomMatrix(int n) {
        Random random = new Random();
        int [][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = random.nextInt(10);
            }
        }
        return result;
    }

    public static void printMatrix(int [][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
