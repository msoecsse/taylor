package wk1;

import wk2.LinkedList;

import java.util.Collection;
import java.util.Iterator;

public class Driver {
    public static void main(String[] args) {
        Collection<String> collection = new LinkedList<>();
        collection.add("two");
        collection.add("to");
        collection.add("too");
        {
            for (String word : collection) {
                System.out.println(word);
            }
        }
//        {
//            Iterator<String> itr = collection.iterator();
//            while(itr.hasNext()) {
//                String word = itr.next();
//                System.out.println(word);
//            }
//        }
    }
}
