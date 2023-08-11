package StringHomework0808.hw5;

import java.util.Calendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你想要查看的日期yyyy-MM-dd");
        String strDate = input.next();

        java.sql.Date date = java.sql.Date.valueOf(strDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        System.out.println("日\t一\t二\t三\t四\t五\t六\t");

        int maxDay = cal.getActualMaximum(Calendar.DATE);
        int nowDay = cal.get(Calendar.DATE);
        cal.set(Calendar.DATE,1);
        int num = cal.get(Calendar.DAY_OF_WEEK);

        int day = num-1;
        int count = 0;
        for (int i = 1; i <=day; i++) {
            System.out.println("\t");
        }

        count = count + day;
        for(int i=1;i<=maxDay;i++){
            if(i == nowDay){
                System.out.print(i+"*"+"\t");
            }else{
                System.out.print(i+"\t");
            }
            count++;
            if(count%7 == 0){//当计数器的个数是7的倍数的时候，就换行操作
                System.out.println();
            }
        }
    }
}
