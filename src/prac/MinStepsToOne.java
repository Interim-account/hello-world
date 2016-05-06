package prac;

public class MinStepsToOne {

	
/*	static int minSteps(int n){
		
		if(n==1) return 0;
		
		int steps = 0;
		
		while(true){
			
			if(n%3==0){
				n /= 3;
				++steps;
			}else if(n%2==0){
				n /= 2;
				++steps;
			}else{
				n -= 1;
				++steps;
			}
			
			if(n==1){
				break;
			}
			
		}
		
		return steps;
		
	}*/
	
	
	/* 

	int getMinSteps ( int n )
	{
		int dp[n+1] , i;
		dp[1] = 0;  // trivial case
		for( i = 2 ; i < = n ; i ++ )
		{
			dp[i] = 1 + dp[i-1];
			if(i%2==0) dp[i] = min( dp[i] , 1+ dp[i/2] );
			if(i%3==0) dp[i] = min( dp[i] , 1+ dp[i/3] );
		}
		return dp[n];
	}

	 */
	
	static int minSteps(int n){
		
		int[] dp = new int[n+1];
		dp[1]=0;
		for(int i=2;i<=n;i++){
			dp[i]=1+dp[i-1];
			if(i%2==0){
				dp[i] = Math.min(dp[i], 1+dp[i/2]);
			}
			if(i%3==0){
				dp[i] = Math.min(dp[i], 1+dp[i/3]);
			}
		}
		
		return dp[n];
	}
	
	public static void main(String[] args) {
		System.out.println(minSteps(55555555));
	}
	
}
