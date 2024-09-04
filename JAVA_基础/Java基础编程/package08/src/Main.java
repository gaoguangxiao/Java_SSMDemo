import com.hspedu.Animal;
import com.hspedu.Cat;
import com.hspedu.Dog;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Animal a = new Animal();

        Animal cat = new Cat();

        Animal cat1 = new Cat();
String name;
int a = 10;
int b  =10;

Integer c = 20;
//        System.out.println("cat == cat1:" + (cat == cat1));
//        System.out.println("cat.equals(cat1):" + (cat.equals(cat1)));
//        System.out.println(cat instanceof Cat);//判断左边对象是否是右边类的实例

        System.out.println("cat.toString():" + cat.toString());

        System.out.println("cat.name" + cat.name);//B
        cat.run();//B

        Animal an = cat;
        //打印了父类，an父类的指针，jvm内存布局 加载了父类和子类的信息，都初始化
        //
        System.out.println("an.name" + an.name);
        an.run();


//        Animal dog = new Dog("狗");
//        dog.run();
        //多态 父类引用指向子类对象

//        Dog dog = new Dog();
//
//        System.out.println(dog);
//
//        com.xiaoqiang.Dog dq = new com.xiaoqiang.Dog();
//        System.out.println(dq);
    }
}