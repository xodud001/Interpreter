import java.util.Arrays;

public class Memory {
    private Instruction[][] memory;
    private static Memory instance = null;

    public static Memory getMemory(){
        if(instance == null) {
            instance = new Memory();
            instance.memory = new Instruction[10][10];
            for (int i = 0; i < instance.memory.length; i++) {
                for (int j = 0; j < instance.memory[i].length; j++) {
                    instance.memory[i][j] = new Instruction("+0000");
                }
            }
        }
        return instance;
    }

    public void inputInstruction(int position, String instruction){
        instance.memory[position/10][position%10] = new Instruction(instruction);
    }
    public void showMemory(){
        System.out.print("\t");
        for(int i = 0 ; i < 10 ; i++) System.out.printf("\t%5d", i);
        System.out.println();
        int counter = 0;
        for (int i = 0; i < instance.memory.length; i++) {
            System.out.printf("%5d\t", counter);
            counter += 10;
            for (int j = 0; j < instance.memory[i].length; j++) System.out.printf("%s\t", instance.memory[i][j].getInstruction());
            System.out.println();
        }
    }
}
