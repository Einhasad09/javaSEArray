package StringHomework0808.hw04;

import java.util.Random;

public class Hw04 {
    public static void main(String[] args) {
        /**
         * 4.生成10个[10,23)之间的随机整数
         * 提示：分别使用Math.random()和Random类的nextDouble()或nextInt()实现
         * */
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print("nextDouble():"+(random.nextInt(13)+10)+"\t");
            System.out.print("nextInt():"+ Math.round(random.nextDouble() * 13 + 10)+"\t");
            System.out.println("Math.random():"+ Math.round(10 * Math.random() + 13));
        }
    }
}
