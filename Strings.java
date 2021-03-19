public class Strings {

    public static final String STOP = "STOP";
    public static final String ERROR = "ERROR";
    public static String getHelloMessage(){
        return "*** Welcome to Simpletron! ***\n" +
                "*** Please enter your program one instruction ***\n" +
                "*** (or data word) at a time. I will type the ***\n" +
                "*** location number and a question mark (?) ***\n" +
                "*** You then type the word for that location. ***\n" +
                "*** Type the sectinel -99999 to stop entering ***\n" +
                "*** your program ****";
    }

    public static String getBeginMessage() {
        return "*** Program loading completed ***\n" +
                "*** Program execution begins ***";
    }

    public static String getInputErrorMessage(){
        return "!!! The instruction inputed is invaild !!!\n" +
                "!!! Please, Retry input a instruction to right format !!!";
    }

}
