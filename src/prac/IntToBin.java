package prac;

public class IntToBin {
	
	static String conv(int n){
		
		if(n<=0) return "0";
		
		StringBuilder sb = new StringBuilder();
		while(n>1){
			sb.insert(0, n%2);
			n /= 2;	
		}
		sb.insert(0,1);
		return sb.toString();
		
	}
	
	static public int hammingWeight(int n) {
        
		
		if(n==0) return 0;
		
		int ret = 0;
		char[] ar = conv(n).toCharArray();
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]=='1'){
				++ret;
			}
		}
		return ret;
    }
	
	public static void main(String[] args) {
		
		System.out.println(hammingWeight(678905432));
		
	}

}
