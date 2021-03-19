public class Strings {

    public static final String STOP = "STOP";
    public static final String ERROR = "ERROR";
    public static String getHelloMessage(){
        return "*** Welcome to Simpletron! ***\n" +
                "*** Please enter your program one instruction ***\n" +
                "*** (or data word) at a time. I will type the ***\n" +
                "*** location number and a question mark (?) ***\n" +
                "*** You then type the word for that location. ***\n" +
                "*** Type the sentinel -99999 to stop entering ***\n" +
                "*** your program ****";
    }

    public static String getBeginMessage() {
        return "*** Program loading completed ***\n" +
                "*** Program execution begins ***";
    }

    public static String getInputErrorMessage(){
        return "*** The entered instruction is invalid ***\n" +
                "*** Please, Retry enter a instruction to right format ***";
    }

    public static String getTerminatedMessage() {
        return "*** Simpletron execution terminated ***";
    }

    public static String getDivideZeroMessage(){
        return "*** Attempt to divide by zero ***\n"
                + getExceptionTerminatedMessage();
    }

    public static String getInvalidOperatorMessage() {
        return "*** This operation is invalid ***\n"
                + getExceptionTerminatedMessage();
    }

    public static String getExceptionTerminatedMessage(){
        return "*** Simpletron execution anomally terminated ***";
    }

    public static String getAccumulatorOverflowMeaage() {
        return  "*** Overflow occurs in accumulator ***\n"
                + getExceptionTerminatedMessage();
    }

    public static String getAccumulatorUnderflowMessage() {
        return  "*** Underflow occurs in accumulator ***\n"
                + getExceptionTerminatedMessage();
    }
}
