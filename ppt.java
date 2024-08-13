package fun;

public class ppt {
 static void compute(int[] arr) {
	 int n=arr.length;
	 int high=arr[0];
	 int high_2nd=arr[0];
	 int low=arr[0];
	 int low_2nd=arr[0];
	 int sum=0;
	 int avg=0;
	 for(int i=0;i<n;i++) {
		 if(arr[i]>high) {
			 high_2nd=high;
			 high=arr[i];
		 }
		 else if(arr[i]>high_2nd) {
			 high_2nd=arr[i];
		 }
		 else if(arr[i]<low) {
			 low_2nd=low;
			 low=arr[i];
		 }
		 else if(arr[i]<low_2nd) {
			 low_2nd=arr[i];
		 }
		 sum=sum+arr[i];
	 }
	 System.out.println("high "+high);
	 System.out.println("2nd high "+high_2nd);
	 System.out.println("low "+low);
	 System.out.println("2nd low "+low_2nd);
	 System.out.println("sum "+sum);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] arr= {2,5,6,2,99,16,47,35};
 compute(arr);
	}

}
