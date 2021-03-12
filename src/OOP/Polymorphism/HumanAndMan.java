package OOP.Polymorphism;

//定义超类superA
class superA {
    int i = 100;
    void fun(int j) {
        j = i;
        System.out.println("This is superA");
    }
}
// 定义superA的子类subB
class subB extends superA {
    int m = 1;
    void fun(int aa) {
        System.out.println("This is subB");
    }
}
// 定义superA的子类subC
class subC extends superA {
    int n = 1;
    void fun(int cc) {
        System.out.println("This is subC");
    }
}
class HumanAndMan {
    public static void main(String[] args) {
        superA a = new superA();
        subB b = new subB();
        subC c = new subC();
        a = b;
        a.fun(100);
        a = c;
        a.fun(200);
    }
}