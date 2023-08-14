package StringHomework0808.hw5;

import java.util.Calendar;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请按yyyy-MM-dd的方式输入日期：");
        String strDate = input.next();

        java.sql.Date date = java.sql.Date.valueOf(strDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int nowDay = calendar.get(Calendar.DATE);
        calendar.set(Calendar.DATE,1);

        System.out.println("日\t一\t二\t三\t四\t五\t六\t");
        int num = calendar.get(Calendar.DAY_OF_WEEK);
        int nullDay = num - 1;
        int count = 0;
        for (int i = 1; i <= nullDay; i++) {
            System.out.print("\t");
        }
        count+=nullDay;
        for(int i = 1;i < maxDay;i++){
            if(i == nowDay){
                System.out.print(i+"*"+"\t");
            }else{
                System.out.print(i+"\t");
            }
            count++;
            if(count % 7 == 0){
                System.out.println();
            }
        }
    }
}
