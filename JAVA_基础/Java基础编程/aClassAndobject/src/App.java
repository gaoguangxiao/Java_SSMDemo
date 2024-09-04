public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        testThis();
        // int[] arr = {1,2,3,4,5,6};
        // testparam(arr);
        // testparam(1,4,5,6);
        // testMethod01();
    }


    //this关键字
    static void testThis(){
        Person p = new Person("张三",10);

        // Person
        Person p1 = new Person("李四", 20);

        System.out.println(p);

        System.out.println(p1);
    }

//可变参数 int ... nums
static void testparam(int ... nums){
    for (int i = 0; i < nums.length; i++) {
        System.out.println("nums = " + nums[i]);
    }
}

    //重载 方法名和形参列表区分

    // 类和对象-方法
    static void testMethod01() {
        // Person p = new Person();
        // p.name = "张三";
        // p.age = 100;
        // p.speak();
    }
}
