package fun;

import java.util.Scanner;

public class three_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no to be checked");
		 Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int a=1,b=1,c=1;
		    for(int i=2;i*i<n;i++) {
		    	if(n%i==0) {
		    		a=i;
		    		break;
		    	}
		    }
		    n=n/a;
		    for(int i=2;i*i<n;i++) {
		    	if(n%i==0) {
		    		if(i!=a) {
		    			b=i;
		    		}
		    	}
		    }
		    System.out.println(a);
		    System.out.println(b);
		    c=n/b;
		    System.out.println(c);
		    if(a!=b && b!=c && c!=1 && b!=1 && a!=1) {
		    	System.out.println("yes it is possible and no are :"+a+" "+b+" "+c);
		    }
		    else {
		    	System.out.println("Sorry not possible...");
		    }
		    
	}

}
