public class DemoMain {
    public static void main(String[] args) {
        String[] str01;
        String[] str02 = new String[0];
        String[] str03 = new String[4];
        String[] str04 = null;
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        //getSum(11,55,88);
    }
    /*public static void getSum(int ...num){
        *//*把可变参数看作是数组*//*
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        System.out.println(sum);
    }*/
}
