package ss11_javaCollectionsFramework.thuc_hanh.bai1;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","Two");
        map.put("d","Five");
        map.put("c","Three");
        map.put("b","Four");
        map.put("z","Six");
        //map.remove("d");
        System.out.println(map.get("d"));
        System.out.println(map.containsKey("z"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.size());
        System.out.println(map.equals("32"));
        System.out.println(map);
        for (String key:map.keySet()){
            System.out.println(key+ " " + map.get(key));
        }
        for (String value: map.values()){
            System.out.println(value);
        }
        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
        Map map2 = new HashMap();
        map2.put(1,"Two");
        map2.put(3,"Five");
        map2.put(2,"Three");
        map2.put(5,"Four");
        map2.put("sh","Six");
        for (Object key:map2.keySet()){
            System.out.println(key+ " " + map2.get(key));
        }

    }
}
