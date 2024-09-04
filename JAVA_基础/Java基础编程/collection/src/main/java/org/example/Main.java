package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List arrayList = new ArrayList();
        arrayList.add(1); //添加对象
        arrayList.add(2);

//        arrayList.remove(0); 根据索引删除对象
//        arrayList.contains() 查询对象是否存在
//        arrayList.size() 查询元素个数
//        arrayList.clear();
        System.out.println(arrayList);

        ArrayList arrayList1 = new ArrayList<>();
        arrayList1.addAll(arrayList);
        arrayList1.add(2);
        System.out.println(arrayList1);
        arrayList1.removeAll(arrayList);//按集合删除

        System.out.println("arrayList :" + arrayList);
        System.out.println("arrayList1 :"+ arrayList1);

        HashMap hashMap = new HashMap<>();

        hashMap.put("A","北京");
    }
}