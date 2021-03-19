import java.util.Arrays;

public class Memory {
    private Instruction[] memory;
    private static Memory instance = null;

    public static Memory getMemory(){
        if(instance == null) {
            instance = new Memory();
            instance.memory = new Instruction[100];
            for (int i = 0; i < instance.memory.length; i++) {
                instance.memory[i] = new Instruction("+0000");
            }
        }
        return instance;
    }

    public void inputInstruction(int position, String instruction){
        instance.memory[position] = new Instruction(instruction);
    }
    public Instruction getInstruction(int operand){
        return memory[operand];
    }

    public void showMemory(){
        System.out.print("\t");
        for(int i = 0 ; i < 10 ; i++) System.out.printf("\t%5d", i);
        System.out.println();
        int counter = 0;
        for (int i = 0; i < instance.memory.length/10; i++) {
            System.out.printf("%5d\t", counter);
            counter += 10;
            for (int j = 0; j < 10; j++)
                System.out.printf("%s\t", instance.memory[i*10+j].getInstruction());
            System.out.println();
        }
    }

    public void setInstruction(int operand, int accumulator) {
        memory[operand].setVariable(accumulator);
    }
}
