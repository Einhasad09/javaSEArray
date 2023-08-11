package homework0809.hw03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        /**
         * 3.用代码写出遍历Set的两种方式。
         * */
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new TreeSet<>();

        set.add(555);
        set.add(666);
        set.add(777);

        set1.add(999);
        set1.add(111);
        set1.add(222);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("_________________________________________");
        for(Integer i : set1){
            System.out.println(i);
        }
    }
}
