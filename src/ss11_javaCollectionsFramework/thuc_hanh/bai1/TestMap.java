package ss11_javaCollectionsFramework.thuc_hanh.bai1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

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
    }
}
