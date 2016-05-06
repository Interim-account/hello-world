package prac;

import java.util.HashMap;

public class WordPattern {
	
	static boolean match(String text, String pattern){
		
		if(text==null || pattern==null) return false;
		
		char[] pr = pattern.toCharArray();
		text = text.trim();
		String[] words = text.split(" ");
		HashMap<Character, String> hm1 = new HashMap<>();
		//HashMap<String, Character> hm2 = new HashMap<>();
		
		int i=0;
		while(i<pr.length){
			if(!hm1.containsKey(pr[i])){
				hm1.put(pr[i], words[i]);
			}else{
				if(!words[i].equalsIgnoreCase(hm1.get(pr[i]))){
					return false;
				}
			}
			i++;
		}
		
			return true;
		
		}

	
	public static void main(String[] args) {
		
		System.out.println(match("aa aa aa aa","aaa"));
	}
}
