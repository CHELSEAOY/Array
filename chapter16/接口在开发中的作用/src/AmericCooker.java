//厨师是接口的实现者，实现菜单上的菜
//西餐厨师
public class AmericCooker implements FoodMenu{
    @Override
    public void shiZiChaoJiDan() {
        System.out.println("西餐师傅做的西红柿炒鸡蛋");
    }

    @Override
    public void yuXiangRouSi() {
        System.out.println("西餐师傅做的鱼香肉丝");
    }
}
