package sorting;
import java.util.Arrays;
import java.util.Collections;
public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {1,4,3,2,5};
		Arrays.sort(a,Collections.reverseOrder());
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
	}

}
