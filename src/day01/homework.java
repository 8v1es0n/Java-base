package day01;

public class homework {
    public static void main(String[] args) {
    //  简答题
    // 简述Java中自动类型转换和强制类型转换的规则，并说明强制类型转换的风险
    /* 答: 自动类型转换是由范围小的类型向范围大的类型转换, Java1能自动帮我们处理
       强制类型转换需要在需要转的变量前加(目标类型)实现, 当原数据大于目标类型的范围时,
       就会出现精度损失和数据丢失 */
    // 简述while循环、for循环二者的区别和适用场景
    /* 答: while适合只知道开始和结束条件时,并不清楚会循环多少次
       for适合已知循环的范围 */



        // 1. 计算 1~100 的偶数和
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("1~100 的偶数和为: " + sum);
        System.out.println("=======================");
        // 2. if-else-if分支结构判断学生成绩
        int scores = 70;
        if(scores <= 100 && scores >= 90){
            System.out.println("成绩为优秀~");
        } else if (scores >= 80){
            System.out.println("成绩为良好~");
        } else if (scores >= 60){
            System.out.println("成绩为及格~");
        } else {
            System.out.println("分数输入错误");
        }
        System.out.println("=======================");
         /* 3. 使用for循环打印1~50之间的所有数字，
         遇到3的倍数跳过不打印，遇到40直接结束循环，
         熟练运用continue、break关键字 */
        for (int j = 1; j < 51; j++) {
            if (j % 3 == 0){
                continue;
            }
            if (j == 40){
                break;
            }
            System.out.println(j);
        }
    }
}
