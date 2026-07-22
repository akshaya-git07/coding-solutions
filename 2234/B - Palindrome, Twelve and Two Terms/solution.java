import java.util.*;
public class Main {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		long [] palindrome = {0,1,2,3,4,5,6,7,8,9,11,22};
		while (t-->0){
			long n = scan.nextLong();
			boolean find = false;
			for (long p : palindrome){
				if (p<=n && (n-p)%12 ==0){
					System.out.println(p+" "+(n-p));
					find = true;
					break;
				}
			}
			if(!find){
				System.out.println("-1");
			}
		}
		scan.close();
	}
}