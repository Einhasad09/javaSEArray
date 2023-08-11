import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author JiangZhiHuan(KangJiHwan)
 * @date 2023/07/31
 * */

public class Test {
    public static void main(String[] args) {
        deleteNum();
    }
    /*数组存取*/
    public static void getSet() {
        Scanner input = new Scanner(System.in);
        int[] score = new int[5];
        for (int i = 0;i < score.length;i++) {
            System.out.println("请输入第"+(i+1)+"学生成绩");
            score[i] = input.nextInt();
        }
        for (int j = 0; j < score.length; j++) {
            System.out.println(score[j]);
        }
    }
    /*数组求最值*/
    public static void getMaxt() {
        int[] num = {55,8,66,9,7777,5,33,4,1004};
        int max = num[0];
        int maxPointer = 0;
        for (int i = 1; i < num.length; i++) {
            if(num[i] > max){
                max = num[i];
                maxPointer = i;
            }
        }
        System.out.println("num数组中最大值是：" + max);
        System.out.println("num数组中最大值的下标是是：" + maxPointer);
    }
    /*数组查询问题*/
    public static void findIndext() {
        int[] nums = {55,8,66,9,7777,5,33,4,1004};
        System.out.println("请输入一个整数：");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean flag = false;
        for (int i = 0;i < nums.length;i++) {
            if (num == nums[i]) {
                System.out.println("存在，下标是："+i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("不存在");
        }
    }
    /*数组添加插入问题：1.没有空余空间 2.有空余空间*/
    public static void addNum01() {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        nums[0] = 23;
        nums[1] = 86;
        nums[2] = 76;
        nums[3] = 50;
        /*接收控制台输入的一个数，同时再接收插入的下标位置*/
        System.out.println("请输入一个数字：");
        int num = input.nextInt();
        System.out.println("请输入要添加的位置(0-4)");
        int index = input.nextInt();

        for (int i = nums.length - 2; i >= index ; i--) {
            nums[i + 1] = nums[i];
        }
        nums[index] = num;
        /*借助工具栏向外打印输出数组中所有元素*/
        System.out.println(Arrays.toString(nums));
    }
    public static void addNum02() {
        Scanner input = new Scanner(System.in);
        int[] nums = {12,34,7,90,5};
        int[] newNums = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }
        /*接收控制台输入的一个数，同时再接收插入的下标位置*/
        System.out.println("请输入一个数字：");
        int num = input.nextInt();
        System.out.println("请输入要添加的位置(0-4)");
        int index = input.nextInt();

        for (int i = newNums.length - 2; i >= index ; i--) {
            newNums[i + 1] = newNums[i];
        }
        nums[index] = num;
        /*借助工具栏向外打印输出数组中所有元素*/
        System.out.println(Arrays.toString(nums));
    }
    /*数组删除问题 */
    public static void deleteNum() {
        int[] nums = {12,45,89,44,90};
        System.out.println("删除元素前：" + Arrays.toString(nums));
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个要删除的数字：");
        int num = input.nextInt();
        int index = -1;
        boolean boo = false;
        for (int i = 0;i < nums.length;i++) {
            if (num == nums[i]) {
                boo=true;
                index = i;
                break;
            }
        }
        if (!boo) {
            System.out.println("数字不存在，无法删除！");
        }else {
            for (int i = index ; i < nums.length-1; i++) {
                nums[i] = nums[i+1];
            }
            nums[nums.length-1] = 0;/*数组中最后一个元素设置为默认值*/
            System.out.println("删除成功!");
            System.out.println("删除元素后：" + Arrays.toString(nums));
        }

    }
}
