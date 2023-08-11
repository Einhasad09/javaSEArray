package StringHomework0808.hw03;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Hw03 {
    public static void main(String[] args) {
        /**
         * 将1990年3月3日通过Calendar来表示，
         * 并得出这天是该年的第几天?将该日期增加35天，是哪一天?使用代码来说明。
         * */
        Calendar calendar = new GregorianCalendar();
        calendar.set(1990,2,3);//实际月份=输入月份+1
        System.out.println("这天是这年的第"+calendar.get(Calendar.DAY_OF_YEAR)+"天");
        calendar.add(Calendar.DAY_OF_YEAR,35);
        System.out.println("加35天后这天是这年的第"+calendar.get(Calendar.DAY_OF_YEAR)+"天");


    }
}
