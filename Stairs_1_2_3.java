package fun;

public class Stairs_1_2_3 {
 static int stairs(int n) {
	 if(n==1 || n==2 ) return n;
	 if(n==3) return 4;
	 return stairs(n-1)+stairs(n-2)+stairs(n-3);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int sum=stairs(5);
     System.out.println(sum);
     
	}

}
