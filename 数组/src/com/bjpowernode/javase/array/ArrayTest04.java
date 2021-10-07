package com.bjpowernode.javase.array;

public class ArrayTest04 {
    public static void main(String[] args) {
    Animal a1 = new Animal();
    Animal a2 = new Animal();
    Animal[] animals = {a1, a2};
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

    Animal[] ans = new Animal[2];
    ans[0] = new Animal();
    ans[1] = new Cat();

    System.out.println("-----------");
    Animal[] anim = {new Cat(), new Bird()};
        for (int i = 0; i < anim.length; i++) {
            //这个取出来的可能是Cat,也可能是Bird,不过肯定是一个Anima
            //如果调用的方法是父类中存在的方法不需要向下转型，直接使用父类型引用调用即可
            anim[i].move();
            //但如果调用子类特有方法得向下转型
            if(anim[i] instanceof Cat){
                Cat cat = (Cat)anim[i];
                cat.catMouse();
            }else {
                Bird bird = (Bird)anim[i];
                bird.birdSing();
            }
        }

    }
}

class Animal{
    public void move(){
        System.out.println("Animal move...");
    }
}

class product{

}

class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("Cat move...");
    }

    public void catMouse(){
        System.out.println("猫抓老鼠");
    }

}

class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("Bird Fly...");
    }

    public void birdSing(){
        System.out.println("小鸟唱歌");
    }
}
