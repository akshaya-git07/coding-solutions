import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        while (testCase-->0){
            int n = scan.nextInt();
            int [] a = new int[n];
            int sum1 = 0;
            for (int idx = 0;idx<n;idx++){
                a[idx] = scan.nextInt();
                sum1 += a[idx];
            }
            if(n%2 == 1){
                System.out.println("No");
            }
            else if (sum1%4 == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}