import java.util.ArrayList;

//Longest substring without repeating characters
public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dvdf";
		int res = longestSubstring(str);
		System.out.println(res);
		
		
	}
	
	public static int longestSubstring(String str){
		int res = 0;
		if(str.length() > 0){
			ArrayList<Integer> larr = new ArrayList<Integer>();
			//char fa = str.charAt(0);
			int counter = 0;
			for(int i=0;i<str.length();i++){
				if(!larr.contains((int)str.charAt(i))){
					larr.add((int)str.charAt(i));
					counter++;
				}else{
					break;
				}
			}
			res =  Math.max(counter, longestSubstring(str.substring(1, str.length())));
		}else{
			res = -1;
		}
		return res;
		
	}

}