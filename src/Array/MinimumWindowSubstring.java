package Array;

public class MinimumWindowSubstring {
	
	 public String minWindow(String s, String t) {
	        
	        int[] freq= new int[256];
	        for(int i = 0;i< t.length(); i++){
	            freq[t.charAt(i)]++;
	        }

	        int minSize = Integer.MAX_VALUE;
	        String ans = "";
	        int start = 0;
	        int count = 0;

	        for(int end = 0;end < s.length();end++){

	            if(freq[s.charAt(end)] > 0) count++;

	            freq[s.charAt(end)]--;

	            while( count == t.length()){
	                //System.out.println("Count- "+ count);
	                System.out.println(s.substring(start, end+ 1));
	                if(s.substring(start, end+ 1).length() < minSize){
	                    
	                    minSize = s.substring(start, end+ 1).length();
	                    ans = s.substring(start, end + 1);
	                }

	                freq[s.charAt(start)]++;
	                if(freq[s.charAt(start)] > 0) count--;
	                start++;

	            }
	        }

	        return ans;
	    }

}
