package day02;

public class Demo02 {
    public static void main(String[] args) {
        int sum = sumN(9);
        System.out.println("和为: " + sum);
    }

    public static int sumN(int n) {
        int sum = 9;
        for (int i = 1; i < n + 1; i++) {
            sum += i;
        }
        return sum;
    }
}
