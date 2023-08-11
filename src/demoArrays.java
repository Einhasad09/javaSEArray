import java.util.Arrays;
import java.util.Scanner;

public class demoArrays {
    public static void main(String[] args) {
        scoreAdd();
    }
    /*控制台接收三个班级，每个班级5名学生的成绩，求每个班级的成绩总和*/
    public static void scoreAdd() {
        Scanner input = new Scanner(System.in);
        int[][] scores = new int[3][5];
        for (int i=0;i<scores.length;i++){
            System.out.println("请输入第"+(i+1)+"个班的学生成绩");
            int sum=0;
            for (int j=0;j<scores[i].length;j++){
                System.out.println("\t请输入第"+(j+1)+"个学生成绩");
                scores[i][j]=input.nextInt();
                sum+=scores[i][j];
            }
            System.out.println("第"+(i+1)+"个班的成绩总和是"+sum);
        }
    }
    /*二维数组声明*/
    public static void test07() {
        int[][] arr;//声明二维数组
        arr=new int[3][];//为二维数组分配空间，第一个方括号里要有值
        int[][] arr1 = new int[3][];
        /*赋值*/
        arr[0] = new int[]{67,28,98,50};
        int[] nums={1,5,8,77,66,546};
        arr[1]=nums;
        arr[2]=new int[]{44,55,66};
        System.out.println("arr: "+Arrays.toString(arr));
        /*声明&&分配空间&&赋值*/
        int[][] arr03 = {{11,88,66},{22,7,13},{4679,33,454}};
        /*使用二维数组*/
        for (int i = 0; i < arr03.length; i++) {
            for (int j = 0; j < arr03[i].length; j++) {
                System.out.println(arr03[i][j]+"\t");
            }
            System.out.println();
        }

    }
    /*数组的填充*/
    public static void test06() {
        int[] nums=new int[5];
        Arrays.fill(nums,6);
        System.out.println(Arrays.toString(nums));
    }
    public static void test05() {
        /*去年：张三(160cm)和李四(160cm)是同学
        * 今年张三长高5CM，李四没变
        * 问：两人多高*/
        int zhang=160;
        int li=zhang;
        System.out.println("去年：张三高"+zhang+"李四高"+li);
        zhang+=5;
        System.out.println("今年：张三高"+zhang+"李四高"+li);
        /*
        * 去年：张三高160，重60，李四和张三一样
        * 今年：张三高5cm，体重增加5，李四没变
        * 问：输出两个人两年各自的信息*/
        int[] zs={160,60};
        //int[] ls=new int[2];
         int[] ls=Arrays.copyOf(zs,2);
        System.out.println("去年：张三高"+zs[0]+"重"+zs[1]+"李四高"+ls[0]+"重"+ls[1]);
        zs[0]+=5;
        zs[1]+=5;
        System.out.println("今年：张三高"+zs[0]+"重"+zs[1]+"李四高"+ls[0]+"重"+ls[1]);
        /*
        * 引用数据类型在赋值或传值的时候，是将地址进行复制传递
        * 基本数据类型在赋值或传值的时候，是将值内容进行复制传递
        * */
    }
    /*区间复制数组*/
    public static void test04() {
        int[] nums = {12,55,88,66,40,8};
        int[] nums1 = {12,55,88,66,40,8};
        int[] nums2 = nums;
        /*基本类型在赋值的时候，是把变量内容复制一份赋值走
        引用数据类型在赋值的时候，是把地址复制一份赋值走
        Object类是所有类的顶级父类：
        这个父类里有的东西，Java所有类都有
        这些东西如果没有手动更改，那就还是原样的
        */
        System.out.println(nums == nums1);
        System.out.println(nums == nums2);
        System.out.println(nums.equals(nums1));
        System.out.println(Arrays.equals(nums,nums2));
    }
    /*复制数组*/
    public static void test03(){
        int[] nums={12,34,22,88,10,8};
        int[] newNums=Arrays.copyOf(nums,3);
        System.out.println(Arrays.toString(newNums));
        /*区间复制数组*/
        newNums = Arrays.copyOfRange(nums,2,5);
        System.out.println(Arrays.toString(newNums));
    }
    public static void text02(){
        int[] arr = {12,45,66,888,4555};
        int[] arr2 = {12,99,5,45,6666,888,458};
        System.out.println(Arrays.toString(arr));/*将传入的数组转换成字符串格式*/

        /*二分查找：数组中元素的值必须有顺序
         * 如果要查找元素存在，则返回元素下标位置
         * 如果要查找元素不存在，则返回该元素应该存在的位置+1取反*/
        System.out.println(Arrays.binarySearch(arr,888));
        /*排序sort：
         * */
        Arrays.sort(arr2);
        System.out.println(Arrays.binarySearch(arr2,6666));
    }
}
