package homework0802;

public class IT {
    /**
     * 1、以面向对象的思想，编写自定义类描述IT从业者。
     * 2、设置属性的私有访问权限，通过公有的get，set方法实现对属性的访问
     * 3、限定IT从业人员必须年满15岁，无效信息需提示，并设置默认年龄为15
     * 4、限定“技术方向”是只读属性
     * 5、设计构造函数实现对属性赋值
     * 6、工作方法通过输入参数，接收工作单位和职务，输出个人工作信息
     * 7、 编写测试类，测试IT从业者类的对象及相关方法（测试数据信息自定）
     *
     * 参考分析思路：
     * IT从业者类：
     * 属性包括：姓名，年龄，技术方向，工作年限；
     * 方法包括：工作。
     * */
    private  String name;
    private int age;
    private  final String technology;//技术
    private int workYear;

    public IT(String name, int age, String technology, int workYear) {
        this.name = name;
        ageCheck(age);
        this.technology = technology;
        this.workYear = workYear;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void ageCheck(int age){
        if(age>15){
            this.age = age;
        }else {
            System.out.println("年龄信息无效！已修改默认年龄为15！");
            this.age = 15;
        }
    }

    public String getTechnology() {
        return technology;
    }

    public int getWorkYear() {
        return workYear;
    }

    public void showInfo(String workPlace,String work){
        //ageCheck();
        System.out.println("姓名："+getName());
        System.out.println("年龄："+getAge());
        System.out.println("技术方向："+getTechnology());
        System.out.println("工作年限："+getWorkYear());
        System.out.println("目前就职于："+workPlace);
        System.out.println("职务是："+work);

    }
}
