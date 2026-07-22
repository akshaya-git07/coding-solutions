import java.util.*;
public class Main {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-->0){
			int k = scan.nextInt();
			int max = 0;
			int two = 0;
			for (int i = 0;i<k;i++){
				int x = scan.nextInt();
				max = Math.max(max,x);
				if (x >= 2) two++;
			}
			if (max >= 3 || two>= 2){
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}