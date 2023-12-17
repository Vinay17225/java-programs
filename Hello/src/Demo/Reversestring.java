package Demo;

public class Reversestring {
	 static String revStr(String s1, String s2) {
	        
	        // code here
		 String str=s1+s2;
	        String reverseStr="";
	        char ch;
	        for(int i=0;i <str.length(); i++ ){
	            ch= str.charAt(i);
	            reverseStr=ch+reverseStr;
	        }
	        System.out.println(reverseStr);
			return reverseStr;
	    }
	     
	     public static void main(String[] args){
	    	 Reversestring.revStr("GeeksforGeeks", null );
	     }
	    
	}