package day01;

public class Demo06 {
    public static void main(String[] args) {
        // 逻辑运算符
        //& 逻辑与    理解为并且  多个条件中有一个是false，结果就是false
        System.out.println(true & true);//true
        System.out.println(true & false);//false
        System.out.println(false & true);//false
        System.out.println(false & false);//false
        System.out.println("============================================");

        // | 逻辑或    理解为或者  多个条件中有一个是true, 结果就是true
        System.out.println(true | true);//true
        System.out.println(true | false);//true
        System.out.println(false | true);//true
        System.out.println(false | false);//false
        System.out.println("============================================");

        //! 逻辑非    取反
        System.out.println(!true);//false
        System.out.println(!false);//true


        //短路逻辑与&&    同&,但是一旦表达式有false,右边不再执行
        int a = 10;
        System.out.println(2 < 1 && a++ > 2);
        System.out.println(a);//10

        //短路逻辑或||    同|,但是一旦表达式有true,右边不再执行
        int b = 10;
        System.out.println(2 > 1 || b++ > 2);
        System.out.println(b);//10
    }
}
