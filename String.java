String Coding Questions: 

1. How to Print duplicate characters from String? 
Ans–
 
// Java program for the above approach
import java.util.*;
class GFG {
 
    // Function to print all duplicate
    // characters in string using HashMap
    public static void
    countDuplicateCharacters(String str)
    {
 
        // Creating a HashMap containing char
        // as a key and occurrences as a value
        Map<Character, Integer> map
            = new HashMap<Character, Integer>();
 
        // Converting given string into
        // a char array
        char[] charArray = str.toCharArray();
 
        // Checking each character
        // of charArray
        for (char c : charArray) {
 
            if (map.containsKey(c)) {
 
                // If character is present
                // in map incrementing it's
                // count by 1
                map.put(c, map.get(c) + 1);
            }
            else {
 
                // If character is not present
                // in map putting this
                // character into map with
                // 1 as it's value.
                map.put(c, 1);
            }
        }
 
        // Traverse the HashMap, check
        // if the count of the character
        // is greater than 1 then print
        // the character and its frequency
        for (Map.Entry<Character, Integer> entry :
             map.entrySet()) {
 
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()
                                   + " : "
                                   + entry.getValue());
            }
        }
    }
 
    // Driver Code
    public static void
    main(String args[])
    {
        // Given String str
        String str = "geeksforgeeks";
 
        // Function Call
        countDuplicateCharacters(str);
    }
}

3. How to check if two Strings are anagrams of each other?  
Ans–


// JAVA program to check whether two strings
// are anagrams of each other
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
 
class GFG {
 
    /* function to check whether two strings are
    anagram of each other */
    static boolean areAnagram(char[] str1, char[] str2)
    {
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;
 
        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;
 
        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);
 
        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
 
        return true;
    }
 
    /* Driver Code*/
    public static void main(String args[])
    {
        char str1[] = { 'g', 'r', 'a', 'm' };
        char str2[] = { 'a', 'r', 'm' };
       
        // Function Call
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                               + " anagram of each other");
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
    }
}
 
// This code is contributed by Nikita Tiwari.

o/p->
The two strings are not anagram of each other
 
4. How to program to print the first non repeated character from String?  
Ans–
package com.java.w3schools.blog.java.program.to.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Java Program To Find First Non-Repeated Character In String
 * 
 * @author JavaProgramTo.com
 *
 */
public class StringnonRepeatedProgram {

 public static void main(String[] args) {

  withHashMap("abcdabd");

 }

 /**
  * Using hashmap to store the each char as key and its count as value in it.
  * 
  * @param value
  */
 private static void withHashMap(String value) {

  // Creating map instnace
  Map countsByChar = new HashMap<>();

  // converting string to char array
  char[] chars = value.toCharArray();

  //
  for (char c : chars) {

   if (countsByChar.get(c) == null) {
    countsByChar.put(c, 1);
   } else {
    countsByChar.put(c, countsByChar.get(c) + 1);
   }
  }

  boolean found = false;
  for (Entry entry : countsByChar.entrySet()) {
   if (entry.getValue() == 1) {
    System.out.println("First non repeated char : " + entry.getKey());
    found = true;
   }
  }

  if (!found) {
   System.out.println("No non repeating char");
  }

 }

}


o/p->
First non repeated char : c


5. How to check if a String contains only digits?  
Ans–



// Java program for the above approach
// contains only digits
class GFG {
 
    // Function to check if a string
    // contains only digits
    public static boolean
    onlyDigits(String str, int n)
    {
        // Traverse the string from
        // start to end
        for (int i = 0; i < n; i++) {
 
            // Check if character is
            // not a digit between 0-9
            // then return false
            if (str.charAt(i) < '0'
                || str.charAt(i) > '9') {
                return false;
            }
        }
          // If we reach here, that means
          // all characters were digits.
        return true;
    }
 
    // Driver Code
    public static void main(String args[])
    {
        // Given string str
        String str = "1a234";
        int len = str.length();
 
        // Function Call
        System.out.println(onlyDigits(str, len));
    }
}

o/p->
false

6. How to find duplicate characters in a String?  
Ans–

public class DuplicateCharacters {    
     public static void main(String[] args) {    
        String string1 = "Great responsibility";    
        int count;    
            
        //Converts given string into character array    
        char string[] = string1.toCharArray();    
            
        System.out.println("Duplicate characters in a given string: ");    
        //Counts each character present in the string    
        for(int i = 0; i <string.length; i++) {    
            count = 1;    
            for(int j = i+1; j <string.length; j++) {    
                if(string[i] == string[j] && string[i] != ' ') {    
                    count++;    
                    //Set string[j] to 0 to avoid printing visited character    
                    string[j] = '0';    
                }    
            }    
            //A character is considered as duplicate if count is greater than 1    
            if(count > 1 && string[i] != '0')    
                System.out.println(string[i]);    
        }    
    }    
}    

o/p->

Duplicate characters in a given string:
r
e
t
s
i

7. You need to write a program to print all duplicate character and their count in Java. For example, if given String is "Programming" then your program should print g : 2 r : 2 m : 

8. How to count the occurrence of a given character in String? 
Ans–

9. How to convert numeric String to an int? 
Ans–

public class StringTest {
    public static void main(String[] args) {
        String str = "25";
        String str1 = "25.06";
        System.out.println(isNumeric(str));
        System.out.println(isNumeric(str1));
    }

    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
}
o/p->

true
true

11. How to replace each given character to other e.g. blank with %20?  
Ans– 

// Java program for Replace every character of a
// string by a different character
public class GFG {
 
    //Function to manipulate the string
    static void manipulateString(String str)
    {
 
        char[] str1 = str.toCharArray();
         
     // looping through each character of string
     for (int i = 0; i < str.length(); i++) {
 
         // storing integer ASCII value of
         // the character in 'asc'
          
         int asc = str1[i];
        
         // 'rem' contains coded value which
         // needs to be rounded to 26
         int rem = asc - (26 - (str1[i] - 97));
 
         // converting 'rem' character in range
         // 0-25 and storing in 'm'
         int m = rem % 26;
         
         // printing character by adding ascii value of 'a'
         // so that it becomes in the desired range i.e. a-z
         str1[i] = (char)(m + 'a');
             
     }
     
     String str2 = String.valueOf(str1);
     System.out.println(str2);
      
    }
 
    //Driver code
    public static void main(String[] args) {
         
        // Declaring str as 'geeksforgeeks'
         String str = "geeksforgeeks";
 
         manipulateString(str);
          
         
    }
}


O/p->

fbbnddvbfbbnd
 

13. How to find all permutations of String? 
Ans– 


1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
#include <iostream>
using namespace std;
 
// Function to find all permutations of a given string `str[i…n-1]`
// containing all distinct characters
void permutations(string str, int i, int n)
{
    // base condition
    if (i == n - 1)
    {
        cout << str << endl;
        return;
    }
 
    // process each character of the remaining string
    for (int j = i; j < n; j++)
    {
        // swap character at index `i` with the current character
        swap(str[i], str[j]);        // STL `swap()` used
 
        // recur for substring `str[i+1, n-1]`
        permutations(str, i + 1, n);
 
        // backtrack (restore the string to its original state)
        swap(str[i], str[j]);
    }
}
 
int main()
{
    string str = "ABC";
 
    permutations(str, 0, str.length());
 
    return 0;
}

 

o?p->


ABC
ACB
BAC
BCA
CBA
CAB


14. How to reverse words in a sentence without using a library method? 


Ans—


public static void solution() { 
   String sentence = "logic to sort a sentence in descending order of the length of words"; 
   String[] words = sentence.split(" "); 
   Arrays.sort(words, new Comparator<String>(){ 
       @Override 
       public int compare(String arg0, String arg1) { 
            return arg1.length() - arg0.length(); 
       } 
   }); 
   System.out.println(Arrays.toString(words)); 
} 


O/p->



15. How to remove duplicate characters from String? 
Ans–



// Java program to remove duplicate character
// from character array and print in sorted
// order
import java.util.*;
 
class GFG
{
    static String removeDuplicate(char str[], int n)
    {
        // Used as index in the modified string
        int index = 0;
 
        // Traverse through all characters
        for (int i = 0; i < n; i++)
        {
 
            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
 
            // If not present, then add it to
            // result.
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
 
    // Driver code
    public static void main(String[] args)
    {
        char str[] = "geeksforgeeks".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }
}
 
// This code is contributed by Rajput-Ji

O/pp>

geksfor


17. How to check if a String is a valid shuffle of two String? 

Ans–


// Java program to check if String
// str1 is subString of str2 or not.
import java.util.*;
 
class GFG
{
 
// Function two check String A
// is shuffled subString of B
// or not
static boolean isShuffledSubString(String A, String B)
{
    int n = A.length();
    int m = B.length();
 
    // Return false if length of
    // String A is greater than
    // length of String B
    if (n > m)
    {
        return false;
    }
    else
    {
 
        // Sort String A
        A = sort(A);
 
        // Traverse String B
        for (int i = 0; i < m; i++)
        {
 
            // Return false if (i + n - 1 >= m)
            // doesn't satisfy
            if (i + n - 1 >= m)
                return false;
 
            // Initialise the new String
            String str = "";
 
            // Copy the characters of
            // String B in str till
            // length n
            for (int j = 0; j < n; j++)
                str += B.charAt(i + j);
 
            // Sort the String str
            str = sort(str);
 
            // Return true if sorted
            // String of "str" & sorted
            // String of "A" are equal
            if (str.equals(A))
                return true;
        }
    }
    return false;
}
 
// Method to sort a string alphabetically
static String sort(String inputString)
{
    // convert input string to char array
    char tempArray[] = inputString.toCharArray();
     
    // sort tempArray
    Arrays.sort(tempArray);
     
    // return new sorted string
    return String.valueOf(tempArray);
}
 
// Driver Code
public static void main(String[] args)
{
    // Input str1 and str2
    String str1 = "geekforgeeks";
    String str2 = "ekegorfkeegsgeek";
 
    // Function return true if
    // str1 is shuffled subString
    // of str2
    boolean a = isShuffledSubString(str1, str2);
 
    // If str1 is subString of str2
    // print "YES" else print "NO"
    if (a)
        System.out.print("YES");
    else
        System.out.print("NO");
    System.out.println();
}
}
 
// This code is contributed by PrinciRaj1992


O/p->

YES


19. How to return the highest occurred character in a String? For example if input is "aaaaaaaaaaaaaaaaabbbbcddddeeeeee" it should return "a"

20.Write a program to remove a given character from String? 
Ans-

public class RemoveChar {  
    public static void main(String[] args) {  
              String str = "India is my country";  
              System.out.println(charRemoveAt(str, 7));  
           }  
           public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           }  
} o/p-> India i my country
India i my countryIndia i my countryIndia i my country
22. Write a program to find the longest palindrome in a string? 
Ans- 
public class PalDemo {
 
  public static void main(String[] args) {
    PalDemo pd = new PalDemo();
    
    String pal = pd.findLongestPalindrome("bananas");
    System.out.println("" + pal);
    
    pal = pd.findLongestPalindrome("abaradar121");
    System.out.println("" + pal);
  }
    
  public String findLongestPalindrome(String s) {
    // Validations
    if (s.isEmpty()) {
      return "Please enter a String";
    }
 
    if (s.length() == 1) {
      return s;
    }
    // Validations end
    // Start with one char (starting) as a longest palindrome
    String longest = s.substring(0, 1);
    for (int i = 0; i < s.length(); i = i+1) {        
      // get longest palindrome for odd length (center is i)
      String tmp = checkForEquality(s, i, i);
      if (tmp.length() > longest.length()) {
        longest = tmp;
      }
 
      // get longest palindrome for even length (center is i, i+1)
      tmp = checkForEquality(s, i, i + 1);
      if (tmp.length() > longest.length()) {
        longest = tmp;
      }
    }
    return longest;
  }
    
    
  /**
  * In this method equality is checked starting from
  * the center moving one character left and one character
  * right from the center. If both chars are equal then the
  * next set of chars are checked.  
  *     
  */
  public String checkForEquality(String s, int begin, int end) {
    while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
      begin--;
      end++;
    }
    return s.substring(begin + 1, end);    
  }
}
 
o/p->
anana
radar
 
 
23. How to sort String on their length in Java?  
Ans–
 
// Java program to Sort a String Alphabetically
// Using toCharArray() method
// With using the sort() method
 
// Importing Arrays class from java.util package
import java.util.Arrays;
 
// Main class
public class GFG {
    // Method 1
    // To sort a string alphabetically
    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        return new String(tempArray);
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Custom string as input
        String inputString = "geeksforgeeks";
        String outputString = sortString(inputString);
 
        // Print and display commands
 
        // Input string
        System.out.println("Input String : " + inputString);
        // Output string
        System.out.println("Output String : "
                           + outputString);
    }
}
o/p->
Input String : geeksforgeeks
Output String : eeeefggkkorss
 
 
4. Write a Program to sort String on their length in Java? Your method should accept an array of
 String and return a sorted array based upon the length of String. Don't forget to write unit tests for your solution.
Ans– 
 
// Java program to Sort a String Alphabetically
// Using toCharArray() method
// Without using sort() method
 
// Importing required classes
import java.io.*;
import java.util.Arrays;
 
// Main class
class GFG {
 
    // Main driver method
    public static void main(String[] args) throws Exception
    {
        // Custom string input
        String str = "geeksforgeeks";
       
        // Converting string into an array for computation
        char arr[] = str.toCharArray();
 
        // Nested loops for comparison of characters
        // in above character array
       
        char temp;
 
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                   
                    // Comparing the characters one by one
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
 
        // By now loop is done means we have
        // iterated the whole array
        System.out.println(arr);
    }
}
 
O/p->
 
eeeefggkkorss
 
 
 
  










