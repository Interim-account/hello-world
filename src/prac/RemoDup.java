package prac;

public class RemoDup {

/*public String shortestPalindrome(String s) {
        
		if(s==null || s.length()==0) return s;
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		if(s.equalsIgnoreCase(sb.toString())) return s;
		
		int i=1;
		while(i<s.length()){
			sb.append(s.charAt(i));
			System.out.println(sb.toString());
			if(sb.toString().equalsIgnoreCase(new StringBuilder(sb).reverse().toString())){
				return sb.toString();
			}
			i++;
		}
	
		return "here";
    }*/
	
	
	boolean isPalindrome(String s){
		
		if(s==null || s.length()==0) return true;
		
		if(s.length()==1) return true;
		
		for (int i = 0; i < s.length()/2; i++) {
			
			if(i==(s.length()+1)/2){
				return true;
			}
			
			if(s.charAt(i)==s.charAt(s.length()-1-i)){
				continue;
			}else{
				break;
			}
		}
		
		return false;
	}

	public String shortestPalindrome(String s) {
		
		if(s==null || s.length()==0) return s;
		
		//s = s.toLowerCase();
		StringBuilder sb = new StringBuilder(s);
		
		int i=1;
		
		while(i<s.length()){
			
			String str = sb.toString();
			
			if(isPalindrome(str)){
				return str;
			}
			
			System.out.println(sb);
			sb.insert(0, s.charAt(i));
			
			i++;
		}
		
		return "here";
	}
	
	public static void main(String[] args) {
		
		System.out.println(new RemoDup().shortestPalindrome("cara"));
		
		//System.out.println(new RemoDup().isPalindrome("acara"));
		
	}
}
