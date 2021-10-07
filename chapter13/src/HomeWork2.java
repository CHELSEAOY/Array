/*
请定义一个交通工具类（Vehicle）
    其中具有属性：
    速度（speed）
    体积（size）等等
    方法移动（move()）
    设置速度（setSpeed(int speed)）
    加速度speedUp(),
    减速speedDown()等等

    最后通过测试类Vehicle中的main()中的实例化一个交通工具对象
    并通过方法给它初始化speed，size的值并且打印出来
    另外调用加速减速的方法对速度进行改变。

 */
public class HomeWork2 {
    public static void main(String[] args) {
        //通过无参数构造方法创建对象
        Vehicle v1 = new Vehicle();
        v1.setSize(5);
        v1.setSpeed(150);
        System.out.println("车辆体积为：" + v1.getSize() + "，车辆速度为：" + v1.getSpeed());
        //通过有参数的构造方法创建对象
        Vehicle v2 = new Vehicle(160, 6);
        System.out.println("车辆体积为：" + v2.getSize() + "，车辆速度为：" + v2.getSpeed());

        //调用加速方法
        v1.speedUp(10);
        System.out.println("Speed:" + v1.getSpeed());
        //调用减速方法
        v1.speedDown(20);
        System.out.println("Speed:" + v1.getSpeed());
    }
}

class Vehicle{
//    速度（speed）
    private int speed;
//    体积（size）等等
    private int size;

    public Vehicle() {
    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    //    方法移动（move()）
    public void move(){
        System.out.println("汽车正在起步");
    }

//    加速度speedUp()
    public void speedUp(int addSpeed){
        this.setSpeed(this.getSpeed() + addSpeed);
    }
//减速speedDown()
    public void speedDown(int downSpeed){
        this.setSpeed(this.getSpeed() - downSpeed);
    }
}