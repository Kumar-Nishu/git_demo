package fun;
import java.util.Scanner;
public class prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter the no to be checked");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==0 ||n==1) {
    	System.out.println("invalid input...");
    	return;
    }
    int count=0;
    for(int i=1;i*i<n;i++) {
    	if(n%i==0) {
    		if(n/i==i) {
    			count++;
    		}
    		count=count+2;
    	}
    }
    if(count==2) {
    	System.out.println("Enter no is prime no");
    	System.out.println("total no of factors are : "+count);
    }
    else {
    	System.out.println("Enter no is not a prime no");
    	System.out.println("total no of factors are : "+count);
    }
	}

}
