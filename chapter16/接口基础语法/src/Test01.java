/*
    接口：
        1、接口也是一种引用数据类型。编译后也是一个class字节码文件
        2、接口是完全抽象的。（抽象类是半抽象的） 或者也可以说接口是特殊的抽象类。
        3、接口怎么定义，语法是什么？
            [修饰符列表] interface 接口名{
            }

            对比，
            定义一个类语法：
            [修饰符列表] class 类名{
            }
            定义一个抽象类语法
            [修饰符列表] abstract class 类名{
            }

         4、接口支持多继承，一个接口可以继承多个接口。
         5、接口中只包含两部分内容，一部分是：常量， 一部分是：抽象方法。接口没有其他内容了
            只有以上两部分。
         6、接口中所有的元素都是public修饰的。（都是公开的）
         7、接口中的抽象方法定义时，public abstract修饰符可以省略
         8、接口中的方法都是抽象方法，所以接口中的方法不能有方法体。
         9、类和类之间叫做继承，类和接口之间叫做实现（仍然可以看作继承）
                继承使用extends关键字完成
                实现使用implements关键字完成
         10、当一个非抽象的类实现接口的话，必须将接口中所有的抽象方法全部实现（覆盖、重写）

*/


public class Test01 {
    public static void main(String[] args) {
        //访问接口常量
        System.out.println(myMath.PI);

        //Cannot assign a value to final variable 'PI'
        //myMath.PI = 15;  //错误

        //接口能使用多态吗？可以
        //父类型的引用指向子类型的对象
        myMath mm = new MyMathImp1();
        //调用接口里的方法(面向接口编程)
        System.out.println(mm.sum(5, 8));
        System.out.println(mm.sub(10, 6));
        System.out.println("-----");
        System.out.println(-5&6);
    }
}


//定义接口
/*interface A{

}*/

//特殊的抽象类，完全抽象的，叫做接口，接口无法创建对象
interface myMath{

    //常量
    //public static final double PI = 3.1415926;
    double PI = 3.1415926;

    //抽象方法
    //public abstract int sum(int a ,int b);
    int sum(int a ,int b);
    int sub(int a, int b);
}

//编写一个类（这个类是一个“非抽象”的类）
//Error:(61, 1) java: MyMathImp1不是抽象的, 并且未覆盖myMath中的抽象方法sum(int,int)
/*abstract class MyMathImp1 implements myMath{

}*/

class MyMathImp1 implements myMath{


    //重写/覆盖/实现 接口中的方法 （通常叫做实现）
    @Override
    public int sum(int a, int b) {
        return  a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}