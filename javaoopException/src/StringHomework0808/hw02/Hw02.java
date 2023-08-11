package StringHomework0808.hw02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Hw02 {
    public static void main(String[] args) throws ParseException {
        /**
         * 2.接收从键盘输入的
         * 字符串格式的年龄，分数和入学时间，转换为整数、浮点数、日期类型，并在控制台输出。
         * 提示：使用包装类Integer、Double和日期转换类DateFormat实现
         * */
        Scanner input = new Scanner(System.in);
        System.out.println("请输入：年龄");
        String age = input.next();
        System.out.println("请输入：分数");
        String score = input.next();
        System.out.println("请输入：入学时间(格式yyyy-MM-dd)");
        String time = input.next();

        Integer age1 = Integer.parseInt(age);
        Double score1 = Double.parseDouble(score);

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(time);

        System.out.println("年龄："+age1);
        System.out.println("分数："+score1);
        System.out.println("入学时间："+date);

    }
}
