package OOP.Polymorphism;

//https://blog.csdn.net/why_still_confused/article/details/51295707#
public class PersonDemo {

    public static void main(String[] args) {
        Person p = new Person();         //对象引用本类实例
        Man m = new Man();               //编译时多态，执行Person类的toString()
        System.out.println(p.toString());
        System.out.println(m.toString()); //编译时多态，执行Man类的toString()

        Person q = new Man();
        System.out.println(q.toString());
    }
}

class Person{
    public String toString() {
        String name = "Person";
        return name;
    }
}

class Man extends Person{
    public String toString(){
        String name = "Man";
        return name;
    }
}
