package homework0809.hw04;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        /**
         * 4.用代码写出遍历map的方式。
         * */
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(1,666);
        hashMap.put(2,888);
        hashMap.put(2,888);
        hashMap.put(3,999);
        hashMap.put(6,989);
        hashMap.put(5,9);

        for(Integer i : hashMap.keySet()){
            System.out.println(hashMap.get(i));
        }
        for(Integer i : hashMap.values()){
            System.out.println(i);
        }
        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getValue());
        }

    }
}
