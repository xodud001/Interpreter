import java.text.ParseException;
import java.util.Scanner;

public class Simpletron {
    static Memory memory = Memory.getMemory();


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputCounter = 0;
        boolean isContinue = true;
        System.out.println(Strings.getHelloMessage());

        while (isContinue){
            String instruction = InstructionScanner.instructionScan(inputCounter);

            if(instruction.equals(Strings.STOP)){
                System.out.println(Strings.getBeginMessage());
                isContinue = false;
                continue;
            }else if( instruction.equals(Strings.ERROR)){
                System.out.println(Strings.getInputErrorMessage());
                continue;
            }
            memory.inputInstruction(inputCounter, instruction);
            inputCounter++;
        }

        while(true){
            if(Resister.accumulatorChecker()) return;

            Resister.instructionRegister = memory.getInstruction(Resister.instructionCounter++);
            Resister.operationCode = Resister.instructionRegister.getOperationCode();
            Resister.operand = Resister.instructionRegister.getOperand();

            switch (Resister.operationCode){
                case OperationCode.READ:
                    System.out.print("Please, Enter Numbers : ");
                    memory.getInstruction(Resister.operand).setVariable(input.nextInt());
                    break;
                case OperationCode.WRITE:
                    System.out.println(Resister.operand + "위치의 값 : " + memory.getInstruction(Resister.operand).getVariable());
                    break;
                case OperationCode.LOAD:
                    Resister.accumulator = memory.getInstruction(Resister.operand).getVariable();
                    break;
                case OperationCode.STORE:
                    memory.setInstruction(Resister.operand, Resister.accumulator);
                    break;
                case OperationCode.ADD:
                    Resister.accumulator += memory.getInstruction(Resister.operand).getVariable();
                    break;
                case OperationCode.SUBTRACT:
                    Resister.accumulator -= memory.getInstruction(Resister.operand).getVariable();
                    break;
                case OperationCode.DIVIDE:
                    try{
                        Resister.accumulator /= memory.getInstruction(Resister.operand).getVariable();
                    }catch(ArithmeticException e) {
                        System.out.println(Strings.getDivideZeroMessage());
                        e.getStackTrace();
                        return;
                    }
                    break;
                case OperationCode.MULTIPLY:
                    Resister.accumulator *= memory.getInstruction(Resister.operand).getVariable();
                    break;
                case OperationCode.BRANCH:
                    Resister.instructionCounter = Resister.operand;
                    break;
                case OperationCode.BRANCHNEG:
                    if(Resister.accumulator < 0)
                        Resister.instructionCounter = Resister.operand;
                    break;
                case OperationCode.BRANCHZERO:
                    if(Resister.accumulator == 0)
                        Resister.instructionCounter = Resister.operand;
                    break;
                case OperationCode.HALT:
                    System.out.println(Strings.getTerminatedMessage());
                    return;
                default:
                    System.out.println(Strings.getInvalidOperatorMessage());
                    return;
            }
//            Resister.showResisters();
//            memory.showMemory();
        }
    }
}

