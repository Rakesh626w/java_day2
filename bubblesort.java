package sorting;

public class bubblesort {
	public static void bubble(int a[]) {
		for(int turn=0;turn<a.length;turn++) {
			for(int j=turn+1;j<a.length;j++) {
				if(a[turn]>a[j]) {
					int temp=a[turn];
					a[turn]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,2,5,4};
		bubble(a);
	}

}
