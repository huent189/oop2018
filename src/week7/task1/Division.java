package week7.task1;

public class Division extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public int evaluate() throws ArithmeticException {
        if(right.evaluate() == 0){
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        return left.evaluate() / right.evaluate();
    }

    @Override
    public String toString() {
        return (left.toString() + " / " + right.toString());
    }
}
