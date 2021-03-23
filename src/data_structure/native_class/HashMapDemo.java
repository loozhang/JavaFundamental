package data_structure.native_class;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);

        //访问元素
        System.out.println(Sites.get(3));

        // 输出 key 和 value
        for (Integer i : Sites.keySet()) {
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }

        // 返回所有 value 值
        for(String value: Sites.values()) {
            // 输出每一个value
            System.out.println(value + ", ");
        }

        //删除元素
        Sites.remove(4);
        System.out.println(Sites);

        //删除所有键值对
        Sites.clear();
        System.out.println(Sites);

        // 创建 HashMap 对象 Sites
        HashMap<String, String> Sites2 = new HashMap<String, String>();
        // 添加键值对
        Sites2.put("one", "Google");
        Sites2.put("two", "Runoob");
        Sites2.put("three", "Taobao");
        Sites2.put("four", "Zhihu");
        System.out.println(Sites2);

        //计算大小
        System.out.println(Sites2.size());

        //访问元素
        System.out.println(Sites2.get("two"));
    }
}
