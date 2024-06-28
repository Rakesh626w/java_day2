package learn;

public class buyandsell {
	public static void buysell(int s[]) {
		int maxProfit=0;
		int buyprice=Integer.MAX_VALUE;
		for(int i=0;i<s.length;i++) {
			if(buyprice<s[i]) {
				int profit=s[i]-buyprice;
				maxProfit=Math.max(maxProfit,profit);
			}else {
				buyprice=s[i];
			}
		}
		System.out.println(maxProfit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[]= {7,1,5,3,6,4};
		buysell(s);
	}

}
