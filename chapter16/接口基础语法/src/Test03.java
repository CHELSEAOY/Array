/*
继承和实现都存在的话，代码应该怎么写？
    extends 关键字在前
    implements 关键字在后
 */
public class Test03 {
    public static void main(String[] args) {
        Flyable f = new Cat();
        f.fly();

        //同一个接口
        Flyable f2 = new Pig();
        //调用同一个fly()方法，最后的执行效果不同
        f2.fly();
    }
}

//动物类 父类
class Animal{

}

//可飞翔的接口（是一对翅膀）
//能插拔的就是接口
//接口通常提取的是行为动作
interface Flyable{
    void fly();
}

//动物类子类：猫类
//Flyable是一个接口，是一对翅膀的接口，通过接口插到猫身上，可以让猫飞翔
class Cat extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞猫起飞");
    }

}

//蛇类
class Snake extends Animal{

}

class Pig extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("我是会飞的猪");
    }

}