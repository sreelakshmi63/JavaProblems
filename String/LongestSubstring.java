import java.util.HashMap;

//Longest substring without repeating characters
public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "pwwkew";
		System.out.println(str);
		HashMap<Integer, Integer> lmap = new HashMap<Integer,Integer>();
		int counter = 0;
		int res = 0;
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
		System.out.println(res);
		
	}

}
