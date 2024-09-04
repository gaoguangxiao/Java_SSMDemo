package Java_1.循环控制;

public class sushu {
    public static void main(String[] args) {

        // 1、计算一个数
        // boolean isResult = isSushu(8);
        // if (isResult) {
        // System.out.println("素数");
        // } else {
        // System.out.println("非素数");
        // }
        // 2、计算0~100直接的素数

        int count = 100;
        for (int i = 0; i < count; i++) {
            boolean isResult = isSushu(i);
            if (isResult) {
                System.out.println(i + "素数");
            } else {
                // System.out.println("非素数");
            }
        }

    }

    static boolean isSushu(int num) {
        boolean isR = false;
        int i = num;
        // 打印当前值是否是素数【素数除以1 自身整除,】
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                isR = false;
                break;
            } else {
                isR = true;
            }
        }
        return isR;
    }
}
