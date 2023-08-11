package homework0809.hw02;

import java.util.*;

public class Test {
    /**
     *
     *          * 功能3：说明Comparable接口的作用，并通过分数来对学生进行排序。
     * */
    public static void main(String[] args) {
        //ListToMap();
        //mapToList();
    }
    //功能1：
    public static void ListToMap(){
        /**
         * 功能1：定义方法public void listToMap( )将List中Student元素封装到Map中
         * 1)使用构造方法Student(int id,String name,int age,String sex )创建多个学生信息并加入List
         * 2)遍历List，输出每个Student信息
         * 3)将List中数据放入Map，使用Student的id属性作为key，使用Student对象信息作为value
         * 4)遍历Map，输出每个Entry的key和value
         * */
        Student stu1 = new Student(1,"Einhasad",23,"男");
        Student stu2 = new Student(2,"Silian",20,"男");
        Student stu3 = new Student(3,"Paagrio",22,"男");
        List<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for(Student stu:list){
            System.out.println(stu);
        }
        Map<Integer,Student> map = new HashMap<>();
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student stu = it.next();
            map.put(stu.getId(),stu);
        }
        Set<Map.Entry<Integer,Student>> entrySet = map.entrySet();
        for(Map.Entry<Integer,Student> entry:entrySet){
            System.out.println(entry.getKey()+"___"+entry.getValue());
        }
    }
    //功能2：
    public static void mapToList(){
        /**
         *功能2：定义方法public void mapToList( )将Map中Value值Student信息封装到	List
         *1)创建实体类StudentEntry，可以存储Map中每个Entry的信息
         *2)使用构造方法Student(int id,String name,int age,String sex )创建多个学生信息，
         * 并使用Student的id属性作为key，存入Map
         *3)创建List对象，每个元素类型是StudentEntry
         *4)将Map中每个Entry信息放入List对象
         * */
        Student stu1 = new Student(1,"Einhasad",23,"男");
        Student stu2 = new Student(2,"Silian",20,"男");
        Student stu3 = new Student(3,"Paagrio",22,"男");
        Map<Integer,Student> map = new HashMap<>();
        map.put(stu1.getId(),stu1);
        map.put(stu2.getId(),stu2);
        map.put(stu3.getId(),stu3);
        List<StudentEntry> list = new ArrayList<>();
        for(Map.Entry<Integer,Student> entry : map.entrySet()){
            StudentEntry studentEntry = new StudentEntry();
            studentEntry.setKey(entry.getKey());
            studentEntry.setStu(entry.getValue());
            list.add(studentEntry);
        }
        for(StudentEntry se:list){
            System.out.println(se.getKey()+"__"+se.getStu());
        }
    }

}
