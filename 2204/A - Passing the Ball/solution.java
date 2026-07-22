import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1;i<=t;i++){
            int num = scan.nextInt();
            scan.nextLine();
            String S = scan.nextLine();
            int count = 1;
            for(char ch : S.toCharArray()){
                if (ch == 'L') break;
                else count++;
            }
            System.out.println(count);
        }
    }
}