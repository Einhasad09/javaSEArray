package homework0803.emp;

public class Test {
    public static void main(String[] args) {
        Staff staff01=new Staff("张晓彤","男",36,"人事部","经理");
        staff01.introduce();
        System.out.println("====================================");
        Staff staff02=new Staff("李大宝","男",24,"人事部","助理");
        staff02.introduce();
    }
}
