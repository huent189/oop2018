package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(a < 0){
            a = -a;
        }
        if(b < 0){
            b = -b;
        }
        while (a % b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int cur = 1, pre = 0;
        for (int i = 2; i <= n; i++){
            int temp = cur;
            cur = cur + pre;
            pre = temp;
        }
        return cur;
    }
}
