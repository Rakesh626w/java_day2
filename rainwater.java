package learn;

public class rainwater {
	public static void rainw(int h[]){
		//leftmax
		int n=h.length;
		int leftmax[]=new int[n];
		leftmax[0]=h[0];
		for(int i=1;i<n;i++) {
			leftmax[i]=Math.max(h[i], leftmax[i-1]);
		}
		//right max
		int rigthmax[]=new int[n];
		rigthmax[n-1]=h[n-1];
		for(int i=n-2;i>=0;i--) {
			rigthmax[i]=Math.max(h[i],rigthmax[i+1]);
		}
		int trapped=0;
		for(int i=0;i<n;i++) {
			int waterlevel=Math.min(leftmax[i],rigthmax[i]);
			trapped +=waterlevel-h[i];
		}
		System.out.println(trapped);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h[]= {4,2,0,6,3,2,5};
		rainw(h);
	}

}
