package fun;

public class loop_checking {
	static void printArray(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
static void returnArray(int [] nums1,int []nums2) {
	int n=nums1.length;
	int m=nums1.length;
	int[] mergeArray = new int[m+n];
	int k=0;
	 for(int i=0,j=0;i<n || j<m;i++,j++) {
		if(nums1[i]!=nums2[j]) {
			 mergeArray[k++]=nums1[i];
			 mergeArray[k++]=nums2[j];
		}
		else
			mergeArray[k++]=nums1[i];
	 }
	 printArray(mergeArray);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] num1= {4,7,9,10,13,16};
         int [] num2= {1,7,5,10,48,16};
         returnArray(num1,num2);
         
	}

}
