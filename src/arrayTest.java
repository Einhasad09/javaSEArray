import java.util.Arrays;
import java.util.Scanner;
/**
 * @author JiangZhiHuan(KangJiHwan)
 * @date 2023.07.31
 * */
public class arrayTest {
    /*数组存取getSet()*/
    /*数组求最值getMaxt()*/
    /*数组查询问题findIndext()*/
    /*数组添加插入问题：1.没有空余空间 2.有空余空间addNum01()addNum02()*/
    /*数组删除问题deleteNum()*/
    public static void main(String[] args) {
        //getSet();
        //getMext();
        //findIndext();
        //addNum02();
        //addNum01();
        //deleteNum();
    }
    public static void getSet(){
        Scanner input = new Scanner(System.in);
        int[] score=new int[5];
        for(int i=0;i<score.length;i++){
            System.out.println("请输入数据：");
            score[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(score));
    }
    public static void getMext(){
        int[] arr={2,88,66,33,1004,6565};
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("最大值是："+max);
    }
    public static void findIndext(){
        int[] arr={2,88,66,33,1004,6565};
        System.out.println("请输入你要查询的值：");
        Scanner input =new Scanner(System.in);
        int search=input.nextInt();
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println("存在，下标是：" + i);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("该数不存在");
        }
    }
    public static void addNum02(){
        int[] arr={2,88,66,33,1004,6565};
        Scanner input=new Scanner(System.in);
        System.out.println("请输入你要添加的元素");
        int num=input.nextInt();
        System.out.println("请输入你要插入元素的位置");
        int index=input.nextInt();
        int[] arr1=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        for(int i=arr1.length-2;i>=index;i--){
            arr1[i+1]=arr1[i];
        }
        arr1[index]=num;
        System.out.println("arr1:"+Arrays.toString(arr1));


    }
    public static void addNum01(){
        int[] arr={2,88,66,33,1004,6565};
        System.out.println("origin arr:"+Arrays.toString(arr));
        Scanner input=new Scanner(System.in);
        System.out.println("请输入你要添加的元素");
        int num=input.nextInt();
        System.out.println("请输入你要插入元素的位置");
        int index=input.nextInt();
        for(int i=arr.length-2;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=num;
        System.out.println("now arr:"+Arrays.toString(arr));
    }
    public static void deleteNum(){
        int[] arr={2,88,66,33,1004,6565};
        Scanner input=new Scanner(System.in);
        System.out.println("请输入你要删除的元素");
        int num=input.nextInt();
        int index=-1;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr==null){
                System.out.println("数组为空");
                break;
            }
            if(arr[i]==num){
                index = i;
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(num + " 查无此数");
        }else{
            for(int i=index;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;
        }
        System.out.println("Delete: "+Arrays.toString(arr));
    }
}
