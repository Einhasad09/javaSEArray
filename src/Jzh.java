import java.util.Scanner;

/**
 * @author JiangZhiHuan(KangJiHwan)
 * @date 2023.08.01
 * 数据显示
 * */
public class Jzh {
    static String[] names = new String[50];
    static int[] states = new int[50];//借出为1，没借出为0
    static String[] dates = new String[50];
    public static void main(String[] args) {
        init();
        mainMenu();
    }
    public static void init() {
        names[0] = "三国演义";
        states[0] = 1;
        dates[0] = "2022-08-08";

        names[1] = "西游记";
        states[1] = 0;

        names[2] = "水浒传";
        states[2] = 1;
        dates[2] = "2023-03-14";

        names[3] = "红楼梦";
        states[3] = 0;

    }
    public static void mainMenu() {
        System.out.println("显示信息请按1");
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的选择：");
        int num = input.nextInt();
        switch (num){
            case 1:
                showInfo();
                break;
        }

    }
    public static void showInfo() {
        System.out.println("图书名称\t借出状态\t借出时间");
        for (int i = 0;i < names.length;i++) {
            //System.out.println(names[i]);
            if (names[i] != null) {
                System.out.println(names[i]+"\t"+(states[i] == 0 ? "未借出" : "已借出")+"\t"+dates[i]);
            }
        }
        mainMenu();
    }

    /**
     * @author KangJiHwan
     * @version 1004
     * 移动零
     * */
    public static class Zero {
        public static void main(String[] args) {
            /*给定一个数组 num，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。*/
            /*找到第一个零元素，找到第一个零元素后面的第一个非零元素，交换*/
            /*指针：变量，存储地址，初始化*/
            /*zero:零元素的地址 notZero:非零元素的地址*/
            int[] num={5,5,4,0,0,0,0,8,9,0};
            //int[] num={5,5,4,8,9,0,0,0,0};
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i]+"\t");
            }
            System.out.println();

        }

        public static void moveZero(int[] num){
            if(num==null||num.length<=1){
                return;
            }
            int zero=0,notZero=0;
            while(zero<num.length && notZero<num.length){
                while( num[zero]!=0){
                    zero++;
                }
                System.out.println("zero"+zero);
                notZero=zero;
                while( zero<num.length&&num[notZero]==0){
                    notZero++;
                }
                System.out.println("notZero"+notZero);
                if(zero<num.length && notZero<num.length){
                    num[zero]=num[notZero];
                    num[notZero]=0;
                }
            }
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i]+"\t");
            }
        }
    }
}
