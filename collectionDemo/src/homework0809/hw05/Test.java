package homework0809.hw05;

import java.util.Arrays;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        /**5.假如有以下email数据“aa@sohu.com,bb@163.com,cc@sina.com,..”
         * 现需要把email中的用户部分和邮件地址部分分离，分离后以键值对应的方式放入HashMap？
         * */
        String email01 = "aa@sohu.com,bb@163.com,cc@sina.com";
        String[] email02 = email01.split(",");
        HashMap<String,String> hashMap = new HashMap<>();
        for(String email03:email02){
            String[] email04 = email03.split("@");
            if(email04.length==2){
                String user = email04[0];
                String address = email04[1];
                hashMap.put(user,address);
            }
        }
        for(String user:hashMap.keySet()){
            String address = hashMap.get(user);
            System.out.println("用户："+user+"地址："+address);
        }

    }
}
