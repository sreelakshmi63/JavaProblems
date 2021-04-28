
import java.util.HashMap;

//Longest substring without repeating characters
public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "pwwkew";
		int res = longestSubstring(str);
		System.out.println(str);
		System.out.println(res);
		
		
	}
	
	public static int longestSubstring(String str){
		int res = 0;
		int counter = 0;
		HashMap<Integer, Integer> lmap = new HashMap<Integer,Integer>();
		for(int i = 0; i < str.length(); i++){
			if(!lmap.containsKey((int)str.charAt(i))){
				counter++;
				lmap.put((int)str.charAt(i), 0);
			}else{
				lmap = new HashMap<Integer,Integer>();
				lmap.put((int)str.charAt(i), 0);
				counter = 1;
				
			}
			res = Math.max(res, counter);
		}
		return res;
	}

}
