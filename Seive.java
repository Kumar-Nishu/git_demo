package fun;

public class Seive {
  static void  prime(int [] arr) {
	for(int i=2;i*i<arr.length;i++) {
		for(int j=i*i;j<arr.length;j=j+i) {
			arr[j]=1;
		}
	}
	for(int i=2;i<arr.length;i++) {
		if(arr[i]==0) {
			System.out.print(i+" ");
		}
	}
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr=new int [100];
		 prime(arr);
	}

}
