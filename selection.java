package sorting;

public class selection {
	public static void sele(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int mi=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[mi]) {
					mi=j;
				}
			}
			int temp=a[mi];
			a[mi]=a[i];
			a[i]=temp;
		}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,2,3,1};
		sele(a);
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]);
		}
	}

}
