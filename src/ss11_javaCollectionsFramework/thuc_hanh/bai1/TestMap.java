package ss11_javaCollectionsFramework.thuc_hanh.bai1;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("An",15);
        hashMap.put("Dn",19);
        hashMap.put("Cn",14);
        hashMap.put("Bn",21);
        System.out.println("Display Entries in HashMap");
        System.out.println(hashMap +"\n");

        TreeMap<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display Entries in TreeMap");
        System.out.println(treeMap);
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println("------------------- set");
        Set<String> set = new TreeSet<>();
        set.add("Cong");
        set.add("Hoang");
        set.add("An");

        System.out.println(set);
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(5);
        set1.add(null);
        set1.add(3);
        set1.add(null);



        System.out.println(set1);
    }
}
