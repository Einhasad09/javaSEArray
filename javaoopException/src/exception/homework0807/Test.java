package exception.homework0807;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws ScoreException {
        Student student = new Student();
        student.setScore(1);
        /*System.out.println(Math.abs(-5));
        Random random = new Random();
        System.out.println(random.toString());

        Random random1 = new Random(10);
        System.out.println(random1.nextDouble()*10);
        System.out.println(random1.nextInt(10));*/
        Random random = new Random(System.currentTimeMillis());
        System.out.println(random.nextInt());
        System.out.println(random.nextDouble());
        System.out.println(random.nextDouble());

        String t= "55";
        method02();

    }
    public static void method02(){
        String str = new String("qwertyui");
        System.out.println(str.length());
        System.out.println(str.charAt(3));//获得下标为3的字符元素
        String str02 = new String("qasdfgh");
        /**
         * 逐一比较两个字符串的字符，直到遇到第一个不相等的字符，通过字符作差获得比较结果
         * 如果已有字符都相等，长度不同，那么通过长度作差获得比较结果
         * 如果已有字符相同，长度也相同，那就比较结果就是0，表示两个字符串相同
         * */
        System.out.println(str.compareTo(str02));//0表示两个字符串相等；小于0；大于0
        System.out.println(str.concat(str02));//新生成的结果存储在匿名变量里，新结果不影响str和str02
        System.out.println(str02.contains("asd"));//判断str02是否存在asd
        //String str03 = null;
        String str04 = new String();
        String str05 = "";

        System.out.println("stro2:"+str02.isEmpty());//判断是否为空
        //System.out.println(str03.isEmpty());//判断是否为空  空指针异常
        System.out.println("stro4:"+str04.isEmpty());//判断是否为空
        System.out.println("stro5:"+str05.isEmpty());//字符串有地址没元素的时候判断为空

        /**
         * String类重写了Object类中的一个方法equals()方法
         * 由原来的比较地址改为比较 元素/字符 内容
         * 首先判断两个字符串地址是否相同 相同就返回真
         * 再判断两个对象是否都是String类型
         * 其次比较 两个字符串的长度是否相同
         *     如果类型相同，逐一比较字符值是否相等
         *     直到遇到第一个不等的字符，直接返回假
         *     如果所有的字符值都相等，就是相同字符串
         * */
        String str06 = "qwe";
        String str07 = new String("qwe");
        System.out.println("stro6==str07:"+(str06==str07));
        System.out.println("stro6.equals(str07):"+str06.equals(str07));

        String strId = "200417010210123456";
        System.out.println(strId.substring(8,11+1));//左闭右开区间
        System.out.println(strId.substring(8));//从参数下标开始一直到字符串结束

        System.out.println(strId.replace("2","7"));//将strId中所有2换成7
        String[] ss = strId.split("2");//拆分方法、根据输入的参数内容进行拆分 成字符串数组！
        System.out.println(Arrays.toString(ss));

        String str09 = "qwerty";
        System.out.println("str09.toUpperCase():"+str09.toUpperCase());//全换成大写字母
        System.out.println("str09.toLowerCase():"+str09.toLowerCase());//全换成小写字母
        System.out.println("str09.equalsIgnoreCase(str09.toUpperCase()):"+str09.equalsIgnoreCase(str09.toUpperCase()));//忽略大小写比较
        System.out.println("str09.equals(str09.toUpperCase()):"+str09.equals(str09.toUpperCase()));//区分大小写比较

        String str10  ="qw er ";
        System.out.println(str10.trim());//去掉字符串前后空格
        System.out.println("strId.indexOf:"+strId.indexOf("00"));
        System.out.println("strId.lastIndexOf:"+strId.lastIndexOf("00"));
    }

    public static void ss(){
        /**
         * 编译器进行优化，会将多个固定字符串 优化成一个完整的字符串！
         * */
        String str1 = "a"+"b"+"c"+"d";
        String str2 = "ab"+"c"+"d";
        String str3 = "abc"+"d";
        String str4 = "abcd";
        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str3==str4);

    }
}
