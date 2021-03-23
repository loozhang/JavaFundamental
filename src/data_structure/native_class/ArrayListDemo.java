package data_structure.native_class;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        //添加元素
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);

        //访问元素
        System.out.println(sites.get(1));  // 访问第二个元素

        //修改元素
        sites.set(2, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
        System.out.println(sites);

        //删除元素
        sites.remove(3); // 删除第四个元素
        System.out.println(sites);

        //计算大小
        System.out.println(sites.size());

        //迭代数组元素
        for (int i = 0; i < sites.size(); i++) {
            System.out.println(sites.get(i));
        }

        //迭代数组元素
        for (String i : sites) {
            System.out.println(i);
        }

        //其他引用类型
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }

        //排序
        ArrayList<String> sites2 = new ArrayList<String>();
        sites2.add("Taobao");
        sites2.add("Wiki");
        sites2.add("Runoob");
        sites2.add("Weibo");
        sites2.add("Google");
        Collections.sort(sites2);  // 字母排序
        for (String i : sites2) {
            System.out.println(i);
        }

        //排序
        ArrayList<Integer> myNumbers2 = new ArrayList<Integer>();
        myNumbers2.add(33);
        myNumbers2.add(15);
        myNumbers2.add(20);
        myNumbers2.add(34);
        myNumbers2.add(8);
        myNumbers2.add(12);

        Collections.sort(myNumbers2);  // 数字排序

        for (int i : myNumbers2) {
            System.out.println(i);
        }
    }
}
