import java.util.Scanner;

public class Ttest {
    public static void main(String[] args) {
        System.out.println("你好");

// 数值类型 整型 浮点型 布尔型
        // 字符型
        int a = 10;
        double b = 10;
        char ch = 'b';
        Double c = (double) 100;
        String str = "ggx";
        System.out.println(a);
        System.out.println(str);
        System.out.println(b);
        System.out.println(c);
        System.out.println(ch);
        eat();

        java.util.Scanner s = new java.util.Scanner(System.in);
        int ui = s.nextInt();

        System.out.println("您输入了:ui" + ui);

        justAge(ui);
    }

    static void eat() {
        System.out.println("lalala");
    }

    static void justAge(int age){
        if (age < 10) {
            System.out.println("小鱼10");
        } else {
            
        }
    }
}


// 2、如果为public，那么类名必须和文件名一样
// 可以定义很多class文件
/**
 * TtestG
 */
class TtestG {

    public static void main(String[] args) {
        System.out.println("G");
    }

}

/**
 * TtestA
 */
class TtestA {

}

class TtestF {

    public static void main(String[] args) {
        System.out.println("F");
    }

}