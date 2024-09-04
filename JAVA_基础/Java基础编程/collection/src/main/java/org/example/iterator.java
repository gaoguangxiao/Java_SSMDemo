package org.example;

import java.util.*;

public class iterator {
    public static void main(String[] args) {

        List arrayList = new ArrayList();
        arrayList.add(1); //添加对象
        arrayList.add(2);

//        arrayList.get()
        Iterator iterator = arrayList.iterator();
        //循环遍历
        while (iterator.hasNext()){
           System.out.println("arrayList :" + iterator.next());
        }

//        重置迭代器
        iterator = arrayList.iterator();//iterator.re
        while (iterator.hasNext()){
            System.out.println("arrayListRepeat :" + iterator.next());
        }

//       快捷键 itit
//        while (iterator.hasNext()) {
//            Object next =  iterator.next();
//        }

//        快捷键I
        for (Object obj:arrayList) {
            System.out.println(obj);
        }

        HashSet hashSet = new HashSet<>();

        HashMap hashMap = new HashMap<>();
//        hashMap.put()
    }
}