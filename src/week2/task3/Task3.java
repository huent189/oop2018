package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class Student{
    private String name;
    private double gpa;
    private int totalCredits;
    private static final int MAX_CREDIT = 160;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public String Rank(){
        if(gpa >= 3.6){
            return "Xuat sac";
        }
        if(gpa >= 3.2){
            return "Gioi";
        }
        if(gpa >= 2.5){
            return "Kha";
        }
        if(gpa >= 2.0){
            return "Trung binh";
        }
        return "Yeu";
    }

    public void displayInfo(){
        System.out.println("Ten: " + name);
        System.out.println("Diem trung binh: " + gpa);
        System.out.println("Tong so tin chi: " + totalCredits);
    }

    public boolean canGraduate(){
        return (totalCredits >= MAX_CREDIT && gpa > 2.0);
    }
}
class Car{
    private double speed;
    private int petro;
    private String brand;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getPetro() {
        return petro;
    }

    public void setPetro(int petro) {
        this.petro = petro;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isRunning(){
        return (speed > 0);
    }

    public boolean isOutOfGas(){
        return (petro < 0);
    }

    public boolean isSameBrand(Car other){
        return (brand.equals(other.brand));
    }
}

class BankAccount{
    private String owner;
    private String accountNumber;
    private int balance;
    private String password;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void transferMoney(BankAccount other, int money, String code){
        if(code.equals(password)){
            balance -= money;
            other.balance += money;
        } else {
            System.out.println("Khong the thuc hien giao dich");
        }
    }

    public void withdrawMoney(int money){
        if(balance >= money){
            balance -= money;
        } else {
            System.out.println("Khong du tien de rut");
        }
    }

    public void getAccountInfo(){
        System.out.println("Ten: " + owner);
        System.out.println("So tai khoan: " + accountNumber);
        System.out.println("So du: " + balance);
    }
}