package OOP.Polymorphism;

//父类
class Father1{
    //父类有一个打孩子方法
    public void hitChild(){
    }
}
//子类1
class Son1 extends Father1{
    //重写父类打孩子方法
    public void hitChild(){
        System.out.println("为什么打我？我做错什么了！");
    }
}
//子类2
class Son2 extends Father1{
    //重写父类打孩子方法
    public void hitChild(){
        System.out.println("我知道错了，别打了！");
    }
}
//子类3
class Son3 extends Father1{
    //重写父类打孩子方法
    public void hitChild(){
        System.out.println("我跑，你打不着！");
    }
}
//测试类
class FatherAndSon{
    public static void main(String args[]){
        Father1 father;
        father = new Son1();
        father.hitChild();
        father = new Son2();
        father.hitChild();
        father = new Son3();
        father.hitChild();
    }
}
