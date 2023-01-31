package ss11_javaCollectionsFramework.thuc_hanh.bai1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<LangKey, String> langMap = new HashMap<LangKey, String>();
        langMap.put(new LangKey(1, "EN"), "English");
        langMap.put(new LangKey(2, "VI"), "Vietnamese");
        langMap.put(new LangKey(3, "ES"), "Spainish");
        langMap.put(new LangKey(4, "JP"), "Jaspanese");
        //langMap.put(null, "Jaspanese");

        System.out.println("Size cua langMap la: " + langMap.size());
        System.out.print("Cac phan tu cua langMap: ");
        Iterator<LangKey> itr = langMap.keySet().iterator();
        while (itr.hasNext()) {
            System.out.print(langMap.get(itr.next()) + " ");
        }
        System.out.println("\nSize cua langMap la: " + langMap.size());
    }

}

/**
 * Các đối tượng của lớp Key được sử dụng
 * như các key của HashMap
 */
class LangKey {
    int index;
    String name;

    LangKey(int index, String Name) {
        this.index = index;
        this.name = Name;
    }

    /**
     *  Ghi đè phương thức hashCode()
     *  Phương thức này luôn trả về: 5
     */
    @Override
    public int hashCode() {
        return 5;
    }



    /**
     *  Ghi đè phương thức equals()
     *  Phương thức này luôn trả về: true
     */

        @Override
    public boolean equals(Object obj) {
        return true;

    }
}
