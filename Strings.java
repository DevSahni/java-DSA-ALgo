public class Strings {
    public static void main(String[] args) {
        // concatenate = which means add two or more strings in variable 
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        // second function 
        // charAt()
        String name= "Aman";
        System.out.println(name.charAt(0));
        
        // replace
        String str = "Hello World";
        System.out.println(str.replace("World", "India"));

        // substring
        String str4 = "Hello World";
        System.out.println(str4.substring(6));
        
    }
    
}
