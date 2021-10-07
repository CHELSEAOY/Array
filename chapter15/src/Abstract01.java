/*
    类到对象是实例化。对象到类是抽象。
    抽象类：
        1、什么是抽象类？
            类和类之间具有共同特征，将这些共同特征提取出来，形成的就是抽象类。
            类本身是不存在的，所以抽象类无法创建对象，即无法实例化。
        2、抽象类属于什么类型？
            抽象类也属于引用数据类型。
        3、抽象类怎么定义？
            语法：
            [修饰符列表] abstract class 类名{
                类体；
            }
        4、抽象类是无法实例化的，无法创建对象，所以抽象类是用来被子类继承的。
        5、final和abstract不能同时出现，是相互对立的。
        6、抽象类的子类也可以是抽象类，也可以是非抽象类。
        7、抽象类虽然无法实例化，但是抽象类有构造方法，这个构造方法是供子类使用的。
        8、抽象类关联到一个概念：抽象方法。什么是抽象方法呢？
            抽象方法表示没有实现的方法，没有方法体的方法。例如：
            public abstract void doSome();
            抽象方法的特点是：
                特点1：没有方法体，以分号结尾.
                特点2：前面修饰符列表中有abstract关键字。
        9、抽象类中不一定有抽象方法，但是抽象方法必须出现在抽象类中。

        重要结论：
            一个非抽象的类继承抽象类，必须将抽象类中的抽象方法实现了。
            这是java语法上规定，必须的，不然编译器就会报错

            这里的覆盖或者说重写，也可以叫做实现。（对抽象的实现）

 */

public class Abstract01 {
    public static void main(String[] args) {
        /*Error:(19, 22) java: Account是抽象的; 无法实例化*/
        /*Account a  = new Account();*/

        //使用多态，父类型引用指向子类型对象
        Account a = new CreditAccount();    //这就是面向抽象编程  （向上转型）
        /*面向抽象编程，不要面向具体编程，降低程序的耦合度，提高程序的扩展力，
        * 这种逼着你咸亨思想符合OCP原则*/

        a.doSome();
        a.withdraw();

    }
}

//银行账户类
abstract class Account{
    /*public Account(String s) {
    }*/
    //实例方法
    public void doSome(){
        System.out.println("doSome ...");
    }


    //如果把类中的abstract关键字去点，则出现以下问题：
    /*Error:(38, 1) java: Account不是抽象的, 并且未覆盖Account中的抽象方法withdrew()*/
    public abstract void withdraw();
}

//子类继承抽象类，子类可以实例化对象
class CreditAccount extends Account{
    @Override
    public void withdraw() {
        System.out.println("取款。。。。");
    }
/*    public CreditAccount(String s) {
        super(s);
    }*/
    /*Error:(34, 10) java: 无法将类 Account中的构造器 Account应用到给定类型;
  需要: java.lang.String
  找到:    没有参数
  原因: 实际参数列表和形式参数列表长度不同*/

    //如果子类未定义成抽象的，则会出现以下错误：
    /*Error:(51, 1) java: CreditAccount不是抽象的, 并且未覆盖Account中的抽象方法withdraw()*/
}

