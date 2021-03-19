public class Resister {
    public static int accumulator = 0;
    public static int instructionCounter = 0;
    public static Instruction instructionRegister = new Instruction("+0000");
    public static int operationCode = 0;
    public static int operand = 0;

    public static void showResisters(){
        System.out.println("REGISTERS : ");
        System.out.printf("accumulator\t\t\t\t%c%04d\n", accumulator < 0 ? '-' : '+', Math.abs(accumulator));
        System.out.printf("instructionCounter\t\t%02d\n", instructionCounter);
        System.out.printf("instructionRegister\t\t%s\n", instructionRegister.getInstruction());
        System.out.printf("operationCode\t\t\t%02d\n", operationCode);
        System.out.printf("operand\t\t\t\t\t%02d\n", operand);
    }

    public static boolean accumulatorChecker(){
        if(accumulator > 9999){ // Overflow
            System.out.println(Strings.getAccumulatorOverflowMeaage());
            return true;
        }else if(accumulator < -9999){
            System.out.println(Strings.getAccumulatorUnderflowMessage());
            return true;
        }else
            return false;

    }
}
