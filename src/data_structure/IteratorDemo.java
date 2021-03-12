package data_structure;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        // 创建集合
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");

        // 获取迭代器
        Iterator<String> it = sites.iterator();

        // 输出集合中的第一个元素
        System.out.println(it.next());

        // 创建集合
        ArrayList<String> sites2 = new ArrayList<String>();
        sites2.add("Google");
        sites2.add("Runoob");
        sites2.add("Taobao");
        sites2.add("Zhihu");

        // 获取迭代器
        Iterator<String> it2 = sites.iterator();

        // 输出集合中的所有元素
        while(it2.hasNext()) {
            System.out.println(it2.next());
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it3 = numbers.iterator();
        while(it3.hasNext()) {
            Integer i = it3.next();
            if(i < 10) {
                it3.remove();  // 删除小于 10 的元素
            }
        }
        System.out.println(numbers);
    }
}
