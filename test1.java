import java.util.Scanner;
public class seed {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=1,k=0,l=0;
		int c=a;
		while(c!=0){
			c=c/10;
			k++;
		}
		int d=k-1;
		int e=(int)Math.pow(10,d);
			b=b*(a*(a/e));
			while(d!=0){
				e=(int)Math.pow(10,d);
				int f=(a%e)/(int)Math.pow(10,d-1);
				b=b*f;
				d--;
			}
			while(b!=0){
				b=b/10;
				l++;
			}
			if(k==l){
				System.out.println("the given number is like a seed");
			}
			else{
				System.out.println("the given number is like a not seed");
			}
	}

}
