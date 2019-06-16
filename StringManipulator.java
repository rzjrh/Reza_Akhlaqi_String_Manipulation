//method 


package string.manipulation;
public class StringManipulator {
    
    //create method trimAndConcat to trim and then concat them 
    //use both trim (for removing the spaces) and concat to join both words
   	public String trimAndConcat(String i, String j){
		String x = i.trim();
		String y = j.trim();
		return x.concat(y); 
	}
        
        
        //create a method with String and char values
        //using if-else statement here and indexOf method
        //what is indexOf? source: https://www.geeksforgeeks.org/java-string-indexof/
        // see this video fir indexOf https://www.youtube.com/watch?v=VBGuX4GaWiU
        //method signature is (String, char)
	public Integer getIndexOrNull(String x, char i){
		if(x.indexOf(i)>=0)
			return x.indexOf(i);
		else{
			return null;
		}
	}
        
        
        
        //here is same method name (getIndexOrNull) but with different signature (String, String)
	public Integer getIndexOrNull(String y, String s){
		if(y.indexOf(s)>0){
			return y.indexOf(s);
		}
		else{
			return null;
		}
	}
        
        
        
        //Get a substring using a starting and ending index, and concatenate that with the second string input to our method
        //what is substring? source: https://www.geeksforgeeks.org/substring-in-java/
        //https://www.youtube.com/watch?v=US4v4SD0iiU
	public String concatSubstring(String x, int y, int z, String sub){
		return x.substring(y,z).concat(sub);
	}

}
