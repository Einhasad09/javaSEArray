package info;

public class Professional {
    /**
     * 1、请使用面向对象的思想， 描述专业信息和学生信息
     * 2、分析专业和学生的属性和方法，设计专业类和学生类
     * 3、在学员类中通过属性描述所学习的专业
     * 4、设置属性的私有访问权限，通过公有的get，set方法实现对属 性的访问
     * 5、编写测试类，测试专业类和学生类的对象及相关方法（测试数 据信息自定）
     * 6、 创建包info---存放专业类和学生类，创建包test---存放测试类
     *
     * 参考思路分析：
     * 专业类：
     * 属性：专业编号，专业名称 、学习该专业的人数
     * 方法：介绍情况的方法，描述专业信息。描述内容包括专业名称以及学习该专业的人数
     *
     * 学生类：
     * 属性：学号，姓名，年龄(大于18岁)，所学习的专业
     * 方法：学习的方法，描述学习状态。描述内容包括姓名、学号、年龄、所学习的专业信息
     * */

    private String professionalId;//专业编号
    private String professionalName;//专业名称
    private static int studyProfessionalNum = 0;//学习该专业的人数



    public Professional(String professionalId, String professionalName) {
        this.professionalId = professionalId;
        this.professionalName = professionalName;
    }


    public String getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(String professionalId) {
        this.professionalId = professionalId;
    }

    public String getProfessionalName() {
        return professionalName;
    }

    public void setProfessionalName(String professionalName) {
        this.professionalName = professionalName;
    }

    public static int getStudyProfessionalNum(){
        return studyProfessionalNum;
    }

    public void setStudyProfessionalNum(int studyProfessionalNum) {
        this.studyProfessionalNum = studyProfessionalNum;
    }

    public void login(){
        studyProfessionalNum++;
    }
    public void showInfo(){
        System.out.println(getProfessionalName()+"目前有"+getStudyProfessionalNum()+"名学生");
    }
}
