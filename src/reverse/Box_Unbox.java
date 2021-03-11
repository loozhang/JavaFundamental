package reverse;

public class Box_Unbox {
    public static void main(String[] args) {
        //声明一个Integer对象
        Integer num = 9;

        //以上的声明就是用到了自动的装箱：解析为:Integer num = new Integer(9);

        //进行计算时隐含的有自动拆箱
        System.out.print(num--);

        //https://www.i3geek.com/archives/990
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;

        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
        System.out.println(g.equals(a+h));

        Double i1 = 100.0;
        Double i2 = 100.0;
        Double i3 = 200.0;
        Double i4 = 200.0;

        //https://www.cnblogs.com/dolphin0520/p/3780005.html
        System.out.println(i1==i2);
        System.out.println(i3==i4);
    }
}
