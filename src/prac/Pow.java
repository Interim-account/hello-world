package prac;

public class Pow {
	
	public double myPow(double x, int n) {
        
       if(x==0 && n==0) return Integer.MIN_VALUE;
       if(n==0) return 1.0;
       if(n==1) return x;
       if(x==0) return 0;
       
       if(n<0){
    	   //return (1/x)*myPow((1/x), (-n)-1);
    	   double output = 1;
    	   for(int i=n;i>=1;i--){
    		   output *= (1/x);
    	   }
    	   return output;
       }
       
       if(n>0){
    	  // return x*myPow(x, n-1);
    	   double output = 1;
    	   for(int i=n;i>=1;i--){
    		   output *= x;
    	   }
    	   return output;
       }
        
       return 0.0; 
    }

	
	public static void main(String[] args) {
		
		System.out.println(new Pow().myPow(2,123456));
		
	}
}
