/*
    接口支持多继承，一个接口可以继承多个接口。
    接口和接口之间支持多继承，那么一个类可以同时实现多个接口吗？

    重点：一个类可以同时实现多个接口
    这种机制你不了Java中的哪个缺陷？
        java中类和类只支持单继承。实际上单继承是为了简单而实现的，现实世界中存在多继承，
        java中的接口弥补了单继承带来的缺陷。

    接口A和接口B虽然没有继承关系，但是写代码的时候，可以互转。
    编译器没意见。但是运行时可能出现ClassCastException。

    之前有一个结论：
        无论向上转型还是向下转型，两种类型之间必须要有继承关系，
        没有继承关系编译器就会报错。（这句话不使用在接口方面）
        最终实际上和之前一样，需要加：instanceof运算符进行判断
        向下转型养成好习惯。转型之前先 if + instanceof进行判断
*/


public class Test02 {
    public static void main(String[] args) {
        M m = new E();
        //编译没问题，运行有问题
        //经过测试：接口和接口之间在进行强制类型转换的时候，没有继承关系，也可以强转
        //但是一定要注意，运行时可能会出现ClassCastException异常
        if(m instanceof K) {
            K k = (K) m;  //class E cannot be cast to class K "ClassCastException"
        }
        //--------------------------------------------
        A a = new D();
        B b = new D();
        C c = new D();

        //调用其他接口中的方法，你需要转型（接口转型）
        B b2 = (B) a;
        //直接转成子类
        D d = (D)a;
        d.m2();
        if(a instanceof B){
            b2.m2();
        }

    }
}

interface K{

}

interface M{

}

class E implements M{

}


/*interface X{

}
interface Y{

}
interface Z extends X,Y{  //接口和接口之间支持多继承

}*/

interface A{
    void m1();
}

interface B{
    void m2();
}

interface C{
    void m3();
}

//D<---A D<---B  D<----C

//实现多个接口，其实就类似于多继承
class D implements A,B,C{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {
        System.out.println("m2.....");
    }

    @Override
    public void m3() {

    }
}