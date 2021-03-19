public class OperationCode {
    public static final int READ = 10;
    public static final int WRITE = 11;
    public static final int LOAD = 20;
    public static final int STORE = 21;
    public static final int ADD = 30;
    public static final int SUBTRACT = 31;
    public static final int DIVIDE = 32;
    public static final int MULTIPLY = 33;
    public static final int BRANCH = 40;
    public static final int BRANCHNEG = 41;
    public static final int BRANCHZERO = 42;
    public static final int HALT = 43;
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