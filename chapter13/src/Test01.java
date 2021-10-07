/*
猜数字游戏
一个类A中有一个实例变量v，从键盘接受一个正整数作为实例变量v的初始值
另外在定义一个类B，对A类的实例变量v进行猜测
    如果大了则提示大了
    小了则提示小了
    等于则提示猜测成功
*/
public class Test01 {
    public static void main(String[] args) {
        //创建A对象
        A a = new A(100);
        //创建B对象
        B b = new B(a);
        //开始猜测
        while(true) {
            java.util.Scanner s = new java.util.Scanner(System.in);
            System.out.print("请输入需要猜测的数字：");
            int caiCeNum = s.nextInt();
            b.caiCe(caiCeNum);
        }
    }
}

class A{
    private int v;

    public A() {
    }

    public A(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}

class B{
    private A a;

    public B() {
    }

    public B(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void caiCe(int caiCeNUm){
        //实际数字
        int shiJiZhi = this.getA().getV();
        //int shiJiZhi = a.getV();
        if (caiCeNUm == shiJiZhi){
            System.out.println("猜对了");
            //终止程序的执行
            //退出JVM
            System.exit(0);
        }else if (shiJiZhi >caiCeNUm){
            System.out.println("猜小了");
        }else{
            System.out.println("猜大了");
        }
    }
}