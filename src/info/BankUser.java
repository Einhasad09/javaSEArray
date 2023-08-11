package info;

import java.util.Scanner;

public class BankUser {
    /**
     * 1、请使用面向对象的思想，设计银 行的储户信息
     * 2、分析储户的属性和方法，设计储户类
     * 3、设置属性的私有访问权限，通过公有的get，set方法实现对属 性的访问
     * 4、编写测试类，测试储户类的对象及相关方法（测试数据 信息自定）
     * 5、 创建包info---存放储户类，创建包test---存放测试类
     *
     * 参考思路分析：
     * 储户类：
     * 属性: 用户姓名、密码、身份证号、账号、帐户余额
     * 方法：
     * 1、存款：验证账号是否有效，存款金额是否有效，如果有 效修改账户余额
     * 2、 取款：验证账号是否有效，取款金额是否有效，余额是 否够用，如果有效修改余额
     * */
    private String userName;
    private String userPassword;
    private String userIdNum;
    private double accountBalance;
    private final String userBankId = "179708064356";
    private final String userBankPassword = "12345";

    public BankUser(String userName, String userPassword, String userIdNum, double accountBalance) {
        setUserName(userName);
        setUserPassword(userPassword);
        setUserIdNum(userIdNum);
        setAccountBalance(accountBalance);
    }

    public BankUser() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserIdNum() {
        return userIdNum;
    }

    public void setUserIdNum(String userIdNum) {
        this.userIdNum = userIdNum;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void Deposit(){
        /**
         * 存款：验证账号是否有效，存款金额是否有效，如果有 效修改账户余额
         * 取款：验证账号是否有效，取款金额是否有效，余额是 否够用，如果有效修改余额
         * */
        Scanner input = new Scanner(System.in);
        System.out.println("请输入账号：");
        String userBankId = input.next();
        System.out.println("请输入存款金额:");
        double balance = 0;
        int flag=0;//未存钱成功
        if(getUserIdNum().equals(userBankId) && getUserPassword().equals(userBankPassword)){
            balance = input.nextDouble();
            if(balance!=0){
                accountBalance+=balance;
                System.out.println("存款成功！");
                flag=1;//存取成功
            }else{
                System.out.println("存款失败！");
                flag=0;
            }
            if(flag==1){
                showInfo();
            }
        }
    }
    public void DrawMoney(){
        /**
         * 存款：验证账号是否有效，存款金额是否有效，如果有 效修改账户余额
         * 取款：验证账号是否有效，取款金额是否有效，余额是 否够用，如果有效修改余额
         * */
        Scanner input = new Scanner(System.in);
        double drawbalance=0;
        if(getUserIdNum().equals(userBankId) && getUserPassword().equals(userBankPassword)){
            System.out.println("请输入取款金额：");
            drawbalance=input.nextDouble();
            if(accountBalance>=drawbalance){
                accountBalance-=drawbalance;
                System.out.println("取款成功");
            }else{
                System.out.println("当前账号余额不足");
            }
        }
    }
    public void showInfo(){
        System.out.println("储户姓名："+getUserName());
        System.out.println("账号："+getUserIdNum());
        System.out.println("可用金额："+getAccountBalance());
    }
}
