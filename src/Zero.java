import java.util.Arrays;
/**
 * @author JiangZhiHuan(KangJiHwan)
 * @version 1004
 * @date 2023/08/03
 * */
public class Zero {
    public static void main(String[] args) {
        /**
         * 移动零：给定一个数组 num，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
         * 解1：
         * 找零元素————找零元素后面的第一个非零元素————交换
         * 双指针
         * 指针：存放地址的变量，需要初始化
         * zero:指向0元素       notZero:指向非0元素
         *解2：
         * 设置第二个数组，把第一个数组里的非零元素转移到新设置的数组里，然后在后面补零
         * */
        int[] num={5,5,4,0,0,0,0,7,9,0};
        //int[] num={5,5,4,7,9,0,0,0,0};
        /*System.out.println("排序前"+Arrays.toString(num));
        moveZero(num);
        moveZero2(num);*/

    }

    public static void moveZero(int[] num){
        if(num.length<=1 || num!=null){
            return;
        }
        int zero = 0,notZero = 0;
        while(zero<num.length && notZero<num.length){
            while(zero<num.length && num[zero]!=0){
                zero++;
            }
            notZero=zero;
            while(notZero<num.length && num[zero]==0){
                notZero++;
            }
            if(zero<num.length && notZero<num.length){
                num[zero]=num[notZero];
                num[notZero]=0;
            }
        }
        System.out.println("moveZero排序后"+Arrays.toString(num));
    }

    public static void moveZero2(int[] num){
        if(num.length <= 1 || num == null){
            return;
        }
        int j = 0;
        int[] num2 = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            if(num[i]!=0){
                num2[j]=num[i];
                j++;
            }
        }
        for (int i = j+1; i < num.length; i++) {
            num2[i]=0;
        }
        System.out.println("moveZero2排序后"+Arrays.toString(num2));

    }
}
