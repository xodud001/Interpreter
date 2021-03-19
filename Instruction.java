public class Instruction {
    private boolean sign; // true : +, false = -
    private int operandCode;
    private int operand;

    public Instruction(String instruction) {
        this.sign = instruction.charAt(0) == '+';
        this.operandCode = Integer.parseInt(instruction.substring(1, 3));
        this.operand = Integer.parseInt(instruction.substring(3, 5));
    }

    public String getInstruction(){
        return (sign ? '+' : '-') + String.format("%02d", operandCode) + String.format("%02d", operand);
    }

    public boolean isSign() {
        return sign;
    }

    public void setSign(boolean sign) {
        this.sign = sign;
    }

    public int getOperandCode() {
        return operandCode;
    }

    public void setOperandCode(int operandCode) {
        this.operandCode = operandCode;
    }

    public int getOperand() {
        return operand;
    }

    public void setOperand(int operand) {
        this.operand = operand;
    }
}
