public class ConstantsExample {
    public static final int SUCCESS = 0;
    public static final int WRONG_ARGUMENT = 1;
    public static final int INVALID_PARAMS = 2;
    public static final int NOT_FOUND = 3;

    public static void main(String[] args) {
        int requestResult = 3;
        if(requestResult == SUCCESS) {

        } else if(requestResult == WRONG_ARGUMENT) {

        } else if(requestResult == INVALID_PARAMS) {

        } else if(requestResult == NOT_FOUND) {

        }
    }
}
