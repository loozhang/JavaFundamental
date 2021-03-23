package data_structure.native_class;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加
        System.out.println(sites);

        //判断元素是否存在
        System.out.println(sites.contains("Taobao"));

        // 删除元素，删除成功返回 true，否则为 false
        sites.remove("Taobao");
        System.out.println(sites);

        //计算大小
        System.out.println(sites.size());

        //迭代元素
        for (String i : sites) {
            System.out.println(i);
        }

        //删除所有元素
        sites.clear();
        System.out.println(sites);

    }
}
