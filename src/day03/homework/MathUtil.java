package day03.homework;

public class MathUtil {
    // 方法1: abs(int num) 求绝对值
    public static int abs(int x){
        if (x < 0){
            return x - (2 * x);
        }
        return x;
    }
    // 方法2: floor(double num) 向下取整，
    // 无论是正数还是负数，都取最小的值 -1.5
    public static int floor(double x){
        if (x < 0){
            return (int)x - 1;
        }
        return (int)x;
    }
    // 方法3: ceil(double num) 向上取整，
    // 无论是正数还是负数，都取最大的值
    public static int ceil(double x){
        if (x > 0){
            return (int)x + 1;
        }
        return (int)x;
    }
    // 方法4: round(double num) 四舍五入
    public static int round(double x){
        return floor(x + 0.5);
    }
}
