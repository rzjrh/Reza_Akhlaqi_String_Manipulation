
package string.manipulation;
public class StringManipulatorTesting{
	public static void main(String[] args) {
            
            //create a new object StringManipulator. This object here (manipulator) work for all methods here and will call the other class
		StringManipulator manipulator = new StringManipulator();
		
             //create a new string (str), call StringManipulator class and trimAndConcat method to do the process for entered values
                String str = manipulator.trimAndConcat("    Hello     ","     World    ");
		System.out.println(str);
	
                
                
		char letter = 'o';
		Integer a = manipulator.getIndexOrNull("Coding", letter);
		Integer b = manipulator.getIndexOrNull("Hello World", letter);
		Integer c = manipulator.getIndexOrNull("Hi", letter);
		System.out.println(a); 
		System.out.println(b); 
		System.out.println(c);

                
		String word = "Hello";
		String subString = "llo";
		String notSubString = "world";
		Integer sub = manipulator.getIndexOrNull(word, subString);
		Integer not = manipulator.getIndexOrNull(word, notSubString);
		System.out.println(sub);
		System.out.println(not);

                
                //word itself is problematic, so changed to word1 to make it work 
                //here in letter Hello we need to subsrting it by (1, 2) means letter "e". 1 is start which is "e" and 2 is "l" but excluded and move one back which is still "e"
                String word1 = manipulator.concatSubstring("Hello", 1, 2, "world");
                System.out.println(word1); // eworld

 	}
}