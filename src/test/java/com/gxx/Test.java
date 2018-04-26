package com.gxx;


import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gaoxx on 2018/4/4  0004.
 */
public class Test {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("beijing");
//        list.add("shanghai");
//        list.add("shanghai");
//        list.add("guangzhou");
//        list.add("shenzhen");
//        list.add("hangzhou");
//        remove11(list, "shanghai");
//        remove12(list, "shanghai");
//        System.out.println(String.format("USER_PO:BASE:%d", 8888));
//        String a = String.valueOf(System.currentTimeMillis()/1000);
//        System.out.println(a);
//        int a = (int) (Math.random() * 5000);
//        System.out.println(a);
//        String a1 = "hello";
//        System.out.println(a1+"\nworld");
        Map map = new HashMap();
        map.put("video","Fnu73oze6oiJ9RFyokKlhfMYsKOK.mp4");
        System.out.println(JSON.toJSONString(map));
        String a = JSON.toJSONString(map);
        System.out.println(a);

    }

    /*
     * 正确
     */
    public static void remove11(List<String> list, String target) {
        for (int i = list.size() - 1; i >= 0; i--) {
            String item = list.get(i);
            if (target.equals(item)) {
                list.remove(item);
            }
        }
        print(list);
    }

    private static void print(List<String> list) {
        for (String item : list) {
            System.out.println("元素值：" + item);
        }
    }

    /*
     * 错误
     */
    public static void remove12(List<String> list, String target) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String item = list.get(i);
            if (target.equals(item)) {
                list.remove(i);
            }
        }
        print(list);
    }


}
