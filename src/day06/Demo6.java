package day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo6 {
    public static void main(String[] args) {
        // alt + ctrl + T  ==> 抓异常   alt + enter
        try {
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[100]);
            //文件输入流对象  编译时会报错  只利用它演示编译时异常  后期详细学习
            FileInputStream fileInputStream = new FileInputStream("a.txt");

        } catch (ArrayIndexOutOfBoundsException e) {
            // 根据代码出现的具体异常 做具体的处理
            System.out.println("数组越界");

        } catch (FileNotFoundException e) {
            // 根据代码出现的具体异常 做具体的处理
            System.out.println("文件不存在");

        } catch (Exception e) {
            //  处理所有类型的异常
            System.out.println("出现异常");

        }
    }
}
