package seleniumsessions;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        
        boolean result = compareStrings(str1, str2);
        
        System.out.println("Are the strings equal? " + result);
    }

    public static boolean compareStrings(String str1, String str2) {
        // Check if both strings are null
        if (str1 == null && str2 == null) {
            return true;
        }
        // Check if one string is null while the other is not
        else if (str1 == null || str2 == null) {
            return false;
        }
        // Compare the strings
        return str1.equals(str2);
    }
}
