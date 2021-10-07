//厨师是接口的实现者，实现菜单上的菜
//中餐厨师
public class ChinaCooker implements FoodMenu{
    @Override
    public void shiZiChaoJiDan() {
        System.out.println("中餐师傅做的西红柿炒鸡蛋");
    }

    @Override
    public void yuXiangRouSi() {
        System.out.println("中餐师傅做的鱼香肉丝");
    }
}
