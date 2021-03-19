import java.text.ParseException;

public class Simpletron {
    static Memory memory = Memory.getMemory();

    public static void main(String[] args) {
        int inputCounter = 0;
        boolean isContinue = true;
        System.out.println(Strings.getHelloMessage());

        while (isContinue){
            String input = InstructionScanner.instructionScan(inputCounter);

            if(input.equals(Strings.STOP)){
                System.out.println(Strings.getBeginMessage());
                isContinue = false;
                continue;
            }else if( input.equals(Strings.ERROR)){
                System.out.println(Strings.getInputErrorMessage());
                continue;
            }
            memory.inputInstruction(inputCounter, input);
            inputCounter++;
        }
        memory.showMemory();
    }
}

// READ 10
// WRITE 11
// LOAD 20
// STORE 21
// ADD 30
// SUBTRACT 31
// DIVIDE 32
// MULTIPLY 33 곱셈
// BRANCH 40 브랜치
// BRANCHNEG 41 누산기가 음수면 브랜치
// BRANCHZERO 42 누산기가 0이면 브랜치
// HALT 43 종료