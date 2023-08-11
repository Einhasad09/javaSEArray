package StringHomework0808.hww01;

import java.util.Scanner;

public class Hw01 {
    /**
     * 验证键盘输入的用户名不能为空，长度大于6，不能有数字。
     * 提示：使用字符串String类的相关方法完成
     * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = input.nextLine();
        int flag=0;
        if((name.length()) < (name.trim().length())){
            if(name.length()>6){
                for (int i = 0; i < name.length(); i++) {
                    if((name.charAt(i)>=48) && (name.charAt(i)<=57)){
                        System.out.println("输入的用户名有数字！");
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    System.out.println("输入的用户名正常！");
                }
            }
        }else{
            System.out.println("输入有空格");
        }
    }
}
