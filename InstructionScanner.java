import java.util.Scanner;

public class InstructionScanner {
    private static Scanner scanner = new Scanner(System.in);

    public static String instructionScan(int counter){
        String input;
        System.out.printf("%02d ? ", counter);
        input = scanner.next();

        return checker(input);
    }

    private static String checker(String input) {
        if(input.equals("-99999")) return Strings.STOP;
        if(input.length() != 5 || !(input.charAt(0) == '+' || input.charAt(0) == '-')) // 길이 및 부호가 잘못 되었을 경우
            return Strings.ERROR;
        if(!isValid(input.substring(1, 5))) return Strings.ERROR; // 숫자 부분에 다른 문자가 섞였을 경우
        return input;
    }

    private static boolean isValid(String substring) {
        for(int i = 0 ; i < substring.length() ; i++)
            if( !(substring.charAt(i) >= '0' && substring.charAt(i) <= '9') )
                return false;
        return true;
    }
}
