//顾客
public class Customer {
    //顾客手里有一个菜单
    //Customer has a FoodMenu
    //记住：以后凡是能够使用has a 来描述的，统一以属性方式存在
    //实例变量，属性
    private FoodMenu foodMenu;  //属性封装

    //构造方法
    public Customer() {
    }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    //getter and setter
    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    //定义点菜函数
    public void order(){
        //先拿到菜单才能点菜
        //调用get方法拿菜单
        FoodMenu fm = this.getFoodMenu();
        fm.shiZiChaoJiDan();
        fm.yuXiangRouSi();

        //也可以不调用get方法，因为在本类中私有的属性是可以访问的
/*      foodMenu.yuXiangRouSi();
        foodMenu.shiZiChaoJiDan();*/
    }
}

/*
cat is a Animal,但凡满足is a的表示都可以设置成为继承
Customer has a FoodMenu，但凡能够使用has a 来描述的，都以属性方式存在
 */