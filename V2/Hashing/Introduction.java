package V2.Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Introduction {
    public static void main(String args[]) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("gfg");
        hs.add("cources");
        hs.add("ide");
        System.out.println("size" + hs.size());
        System.out.println(hs.contains("gfg"));
        Iterator<String> it = hs.iterator();
        // while (it.hasNext()) {
        // System.out.print(it.next() + "");
        // }
        for (String temp : hs) {
            System.out.println(temp);
        }
    }
}
