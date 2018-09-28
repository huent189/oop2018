package week2.task2;

import week2.task1.Task1;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numberator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numberator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(numberator * other.denominator + denominator * other.numberator,
                            denominator * other.denominator);
        result.reduce();
        return result;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(numberator * other.denominator - denominator * other.numberator,
                denominator * other.denominator);
        result.reduce();
        return result;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(numberator * other.numberator, denominator * other.denominator);
        result.reduce();
        return result;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(numberator * other.denominator, denominator * other.numberator);
        result.reduce();
        return result;
    }

    public boolean equals(Object obj){
        if(obj instanceof Fraction){
            Fraction other = (Fraction) obj;
            return (numberator * other.denominator == denominator * other.numberator);
        }
        return false;
    }

    private void reduce(){
        int ucln = Task1.gcd(numberator, denominator);
        numberator = numberator / ucln;
        denominator = denominator / ucln;
    }
    public void print(){
        System.out.println(numberator + "/" + denominator);
    }

}
