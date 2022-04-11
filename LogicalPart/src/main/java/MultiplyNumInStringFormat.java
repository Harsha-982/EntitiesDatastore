import java.lang.Math;
import java.util.Scanner;

public class MultiplyNumInStringFormat {
        public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        int n = Integer.parseInt(n1);
        int[] allnum = new int[n];
        for (int j = 0; j < n; j++) {
            String str = sc.nextLine();
            char[] ch = str.toCharArray();
            int sum = 0;
            for (int i = 0; i < ch.length; i++) {
                int num =ch[ch.length - i - 1];
                int min = num - 48;
                sum = min * (int) Math.pow(10, i) + sum;

            }
            allnum[j] = sum;
        }
        int mul = 1;
        for (int i = 0; i < allnum.length; i++) {
            mul = mul * allnum[i];
        }
        System.out.println(mul);
    }
}
