//模拟去饭馆点菜
public class Test {
    public static void main(String[] args) {
        //创建厨师对象
        FoodMenu cooker1  = new ChinaCooker(); //多态
        FoodMenu cooker2 = new AmericCooker();
        //创建顾客对象
        Customer customer1 = new Customer(cooker1);
        Customer customer2 = new Customer(cooker2);
        //点菜
        customer1.order();
        customer2.order();
    }
}
