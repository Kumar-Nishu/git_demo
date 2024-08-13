package fun;
import java.util.*;
class Result {
 static void printOddSum(int no,int sum) {
	 if(no==0) {
		 System.out.println(sum);
		 return;
	 }
	 int check=no%10;
	 if(check%2!=0) sum=sum+check;
	 printOddSum(no/10,sum);
 }
	public static void main(String[] args) {
      printOddSum(5234,0);
	}
}