import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author JiangZhiHuan(KangJiHwan)
 * @date 2023.07.31
 * 主界面 欢迎XXX
 * 1查看全部图书信息(书名、状态、借出时间、还书时间)
 * 2我要借书 3我要还书 4我要捐书 5 下架图书 6退出系统
 * */
public class bookRentalTest {
    //存图书名
    static String[] names = new String[50];
    //状态 借出1、未借出0
    static int[] states = new int[50];
    //借书时间
    static String[] dates = new String[50];
    public static void main(String[] args) {
        init();
        mainMenu();
    }
    /*初始化*/
    public static void init(){
        names[0] = "西游记";
        states[0] = 1;
        dates[0] = "2023-7-6";

        names[1] = "居里夫人";
        states[1] = 0;

        names[2] = "三国演义";
        states[2] = 0;

        names[3] = "一千零一夜";
        states[3] = 1;
        dates[3] = "2023-7-26";

        names[4] = "红楼梦";
        states[4] = 0;
    }
    /*主菜单*/
    public static void mainMenu(){
        System.out.println("---欢迎使用本图书租赁系统！---");
        System.out.println("1.查看全部图书信息");
        System.out.println("2.我要借书");
        System.out.println("3.我要还书");
        System.out.println("4.我要捐书");
        System.out.println("5.下架图书");
        System.out.println("6.我要退出");
        System.out.println("请输入：");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch (num){
            case 1:
                menu01();
                break;
            case 2:
                menu02();
                break;
            case 3:
                menu03();
                break;
            case 4:
                menu04();
                break;
            case 5:
                menu05();
                break;
            case 6:
                System.out.println("感谢使用！");
                return;
    }
}
    /*子菜单1.查看全部图书信息*/
    public static void menu01(){
        System.out.println("图书名\t图书状态\t借书时间");
        for (int i=0;i<names.length;i++){
            if(names[i]!=null){
                System.out.println(names[i]+"\t"+(states[i]==0 ? "未借出" : "已借出")+"\t"+dates[i]);
            }
        }
        mainMenu();
    }
    /*子菜单2.我要借书*/
    public static void menu02(){
        Scanner input= new Scanner(System.in);
        System.out.println("请输入你要借的书的名字：");
        String name=input.next();
        for(int i=0;i<names.length;i++){
            if(names[i]!=null){
                if(name.equals(names[i]) && states[i]==0){
                    states[i]=1;
                    dates[i]=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                    System.out.println("图书：《"+name+"》出借成功");
                    break;
                }else if(name.equals(names[i]) && states[i]==1){
                    System.out.println("无法出借，本书已被出借");
                    break;
                }
            }else{
                System.out.println("无法出借，没有这本书");
                break;
            }
        }
        mainMenu();
    }
    /*子菜单3.我要还书*/
    public static void menu03(){
        System.out.println("请输入你要还的书的名称");
        Scanner input=new Scanner(System.in);
        String name=input.next();
        for(int i=0;i<names.length;i++){
            if(names[i]!=null){
                if(name.equals(names[i]) && states[i]==1){
                    states[i]=0;
                    double price=returnBook(dates[i]);
                    dates[i]=null;
                    //dates[i]=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                    System.out.println("归还图书《" + names[i] + "》成功，应付金额" + price);
                    break;
                }else if(name.equals(names[i]) && states[i]==0){
                    System.out.println("无法归还，此书未被借出");
                    break;
                }
            }
        }
        mainMenu();
    }
    public static double returnBook(String date1){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        double price=0.0;
        try {
            Date jie=sdf.parse(date1);
            Date huan=new Date();
            double dou=((huan.getTime()-jie.getTime()) / 1000*60*60*24);
            return dou*2.5;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return price;
    }
    /*子菜单4.我要捐书*/
    public static void menu04(){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入你要捐献的书名：");
        String bookName=input.next();
        int n=0;
        for(int i=0;i<names.length;i++){
            if(names[i]!=null){
                n++;
            }
        }
        names[n]=bookName;
        states[n]=0;
        System.out.println("你要捐献的书《"+bookName+"》成功捐献！");
        mainMenu();
    }
    /*子菜单5.下架图书*/
    public static void menu05(){
        Scanner input= new Scanner(System.in);
        System.out.println("请输入要下架的图书的名称：");
        String bookName=input.next();
        int index=-1;
        int flag=0;
        for(int i=0;i<names.length;i++){
            if(bookName.equals(names[i])){
                index = i;
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("查无此书");
        }else {
            for(int i=index;i<names.length-1;i++){
                names[i]=names[i+1];
            }
            System.out.println("删除《"+bookName+"》此书成功");
        }
        mainMenu();
    }
}
