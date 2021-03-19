public class Instruction {
    private char sign;
    private int data;

    public Instruction(String instruction) {
        this.sign = instruction.charAt(0);
        this.data = Integer.parseInt(instruction.substring(1,5));
    }

    public int getVariable(){
        return Integer.parseInt(getInstruction());
    }
    public String getInstruction(){
        if(data < 0) return String.format("%05d", data);
        return sign + String.format("%04d", data);
    }

    public int getOperationCode() {
        return Integer.parseInt(getInstruction().substring(1,3));
    }

    public int getOperand() {
        return Integer.parseInt(getInstruction().substring(3,5));
    }

    public void setVariable(int data) {
        this.data = data;
    }
}
