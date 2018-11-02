package week7.task1;

public class ExpressionTest {
    public static void main(String[] args){
        Expression test1 = new Square(new Addition(new Addition(new Square(new Numeral(10)), new Numeral(-1)),
                                                  new Numeral(2 * 3)));
        System.out.println(test1.evaluate());

        Expression test2 = new Square(new Addition(new Addition(new Square(new Numeral(10)), new Numeral(-1)),
                new Multiplication(new Numeral(2), new Numeral(3))));
        try {
            Expression divisionTest = new Division(new Numeral(3), new Numeral(0));
            divisionTest.evaluate();
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
