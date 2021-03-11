package basic_data_types;

public class IntegerDemo {
    public static void main(String[] args) {

        //https://www.i3geek.com/archives/990
        Integer i = 100;
        Integer j = 100;
        Integer m = 200;
        Integer n = 200;
        System.out.println(i == j);
        System.out.println(m == n);

        //https://www.cnblogs.com/tartis/p/9288020.html
        Integer x = new Integer(100);
        Integer y = new Integer(100);
        System.out.println(x == y); //false
        System.out.println();
    }
}
