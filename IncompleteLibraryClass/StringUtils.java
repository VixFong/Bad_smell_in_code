public class StringUtils {
    public static String reverseString(String str) {
        // code to reverse characters in string
        return str;
    }
    
    // Introduce Foreign Method to add a new method for reversing the order of words in a string
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedWords = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords.append(words[i]).append(" ");
        }
        
        return reversedWords.toString().trim();
    }
}

/* Let's say we have a library class called StringUtils that has a method called reverseString 
which reverses the order of characters in a given string. However, we need to also be able to reverse 
the order of words in a string. Since StringUtils does not have a method for this, we can use Introduce 
Foreign Method to add a new method to the class that does what we need: */
