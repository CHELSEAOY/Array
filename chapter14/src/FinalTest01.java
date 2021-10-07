/*
final
    1、final是java语言中的一个关键字
    2、final表示最终的，不可变的
    3、final可以修饰变量以及方法，还有类等。
    4、final修饰的变量？
        final修饰的局部变量，一旦赋值就不能重新赋值。
        即：final修饰的变量，只能赋一次值。

        final修饰的实例变量，系统不管赋默认值，要求程序员必须手动赋值。
        这个手动赋值，在变量后面赋值可以，在构造方法中赋值也可以

        final修饰的实例变量一般添加static修饰变为静态变量，存储在方法区
        static final 联合修饰的变量称为“常量”
        常量名建议全部大写，每个单词之间采用下划线衔接。

        常量：实际上常量和静态变量一样，区别在于：常量的值不能变
        常量和静态变量都是存储在方法区，并且都是类加载是初始化

        final修饰的方法？
        final修饰的方法无法被覆盖（override）
    6、final修饰的类？
        final修饰的类无法继承
    7、final修饰的引用
        该引用只能指向一个对象，并且它只能永远指向该对象。无法再指向其他对象。
        并且在该方法执行过程中，该引用指向对象后，该对象不会被垃圾回收器回收。
        直到当前方法结束，才会释放空间。
    8、final控制不了能不能调用的问题，final管啥?
        final修饰的表示最后的，不能变的，不能改的。
 */


public class FinalTest01 {
    public static void main(String[] args) {

    }
}

class A{
    private int i;
    public void doSome(){
        System.out.println("A's doSome!!!");
    }
}

class B extends A{
    public void doSome(){
        System.out.println("B's doSome!!!");
    }
}