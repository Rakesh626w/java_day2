package sorting;

public class insertionsort {
	public static void insertion(int a[]) {
		for(int i=1;i<a.length;i++) {
			int curr=a[i];
			int prev=i-1;
			while(prev>=0 && a[prev]>curr) {
				a[prev+1]=a[prev];
				prev--;
			}
			a[prev+1]=curr;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,3,1,2};
		insertion(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
