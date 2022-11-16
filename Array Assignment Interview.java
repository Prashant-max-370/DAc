Arrays Coding Questions: 


1. Write a program to print elements of Array ?  
Ans–


// Java Program to Print the Elements of an Array
// Using loops (considering for loop here)
public class GFG {
  
    // Main driver method
    public static void main(String[] args)
    {
  
        // Initialize array of random numbers and size
        // Suppose array named 'arr' contains 9 elements
        int[] arr = { -7, -5, 5, 10, 0, 3, 20, 25, 12 };
  
        System.out.print("Elements of given array are: ");
  
        // Looping through array by incrementing value of i
        //'i' is an index of array 'arr'
        for (int i = 0; i < arr.length; i++) {
  
            // Print array element present at index i
            System.out.print(arr[i] + " ");
        }
    }
}


O/p->Elements of given array are: -7 -5 5 10 0 3 20 25 12 


2. Write a Java program to check the equality of two arrays? 
Ans– 

import java.util.Arrays;

public class Main {
   public static void main(String[] args) throws Exception {
      int[] ary = {1,2,3,4,5,6};
      int[] ary1 = {1,2,3,4,5,6};
      int[] ary2 = {1,2,3,4};
      System.out.println("Is array 1 equal to array 2?? " +Arrays.equals(ary, ary1));
      System.out.println("Is array 1 equal to array 3?? " +Arrays.equals(ary, ary2));
   }
}


o/p->
Is array 1 equal to array 2?? true
Is array 1 equal to array 3?? false

3. Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?
Ans–

public class FindPairs
{
   public static void main(String[] args)
   {
       int[] arr = new int[] {2, 7, 5, 4, 3, 9, 15};
      //Anumber specified
       int sum = 9;
      //calling findPairs() user defined method
       findPairs(arr, sum);
   }
  
  //findPairs() method
  //it will find all the pairs whose sum is equal to a specified number
   static void findPairs(int inputArray[], int sum)
   {
       System.out.println("The pairs whose sum are equal to "+ sum+" are : ");
       for (int i = 0; i < inputArray.length; i++)
       {
           for (int j = i + 1; j < inputArray.length; j++)
           {
               if (inputArray[i] + inputArray[j] == sum)
               {
                   System.out.println(inputArray[i] + " " + inputArray[j]);
               }
           }
       }
   }
}

o/p->

Output:

The pairs whose sum are equal to 9 are : 
2 7
5 4
4. Write a program to reverse an Array in java .  
Ans–



// Basic Java program that reverses an array
  
public class reverseArray {
  
    // function that reverses array and stores it 
    // in another array
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
  
        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
  
    public static void main(String[] args)
    {
        int [] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
    }
}

o/p->

Reversed array is: 

50
40
30
20
10

5. Find out smallest and largest number in a given Array?  
public class FindLargestSmallestNumber {

 public static void main(String[] args) {

  //numbers array
  int numbers[] = new int[]{55,32,45,98,82,11,9,39,50};

  //assign first element of an array to largest and smallest
  int smallest = numbers[0];
  int largetst = numbers[0];

  for (int i = 1; i < numbers.length; i++) {
   if (numbers[i] > largetst)
    largetst = numbers[i];
   else if (numbers[i] < smallest)
    smallest = numbers[i];
  }

  System.out.println("Largest Number is : " + largetst);
  System.out.println("Smallest Number is : " + smallest);
 }
}
o/p->
Largest number is : 98
Smallest Number is : 9

6. Print the third-largest number in an array without sorting it Input: [ 24,54,31,16,82,45,67]
Output: 54 (82 and 67 are the largest and second-largest) 

Ans–

n=3 haystack=[1,2,3] largest=[0]*n for a in haystack: k=n for i in range(n): if a<=largest[i]: k=i break if k: k-=1 for j in range(k): largest[j]=largest[j+1] largest[k]=a

OR

from heapq import heapify,heappop,heappush class Solution: def findKthLargest(self, nums: List[int], k: int) -> int: heap = [] # this creates min-heap heapify(heap) for e in nums: # with O(log n) push and O(log n) pop heappush(heap,e) if len(heap)>k: heappop(heap) return heappop(heap)


7. Write a program to merge two arrays of integers by reading one number at a time from each array until one of the array is exhausted, and then concatenating the remaining numbers
Input: [23,60,94,3,102] and [42,16,74]
 Output: [23,42,60,16,94,74,3,102] 

Ans–


// Java Program to demonstrate merging
// two array using pre-defined method
  
import java.util.Arrays;
  
public class MergeTwoArrays1 {
    public static void main(String[] args)
    {
        // first array
        int[] a = { 10, 20, 30, 40 };
  
        // second array
        int[] b = { 50, 60, 70, 80 };
  
        // determines length of firstArray
        int a1 = a.length;
        
        // determines length of secondArray
        int b1 = b.length;
        
        // resultant array size
        int c1 = a1 + b1;
  
        // create the resultant array
        int[] c = new int[c1];
  
        // using the pre-defined function arraycopy
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
  
        // prints the resultant array
        System.out.println(Arrays.toString(c));
    }
}

o/p->

[10, 20, 30, 40, 50, 60, 70, 80]

8. Write a program which takes an array of integers and prints the running average of 3 consecutive integers. In case the array has fewer than 3 integers, there should be no output. Input: [5,14,35,89,140] Output: [18, 46, 88] (Explanation: 18=(5+14+35/3, 46=(14+35+89)/3, ...)

9. Write a program which generates the series 1,4,27,16,125,36 
Ans–


// JAVA code to generate first
// 'n' terms of Logic sequence
 
class GFG {
 
// Function to generate
// a fixed \number
public static int logicOfSequence(int N)
{
    if (N % 2 == 0)
        N = N * N;
    else
        N = N * N * N;
    return N;
}
 
// Driver Method
public static void main(String args[])
{
    int N = 6;
    System.out.println(logicOfSequence(N));
}
}
 
// This code is contributed by Jaideep Pyne

o/p->
36

10. Given an array of integers, print whether the numbers are in ascending order or in descending order or in random order without sorting 
Ans– 


import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        // 1
        Scanner sc = new Scanner(System.in);
        int tempValue;

        // 2
        System.out.println("Enter number of array elements : ");
        int size = sc.nextInt();

        // 3
        int[] numArray = new int[size];

        // 4
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element : ");
            numArray[i] = sc.nextInt();
        }

        // 5
        System.out.println("You have entered : ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(numArray[i] + ",");
        }
        System.out.println(numArray[numArray.length - 1]);

        //6
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {

            //7
            if (numArray[i] > numArray[j]) {
                    tempValue = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = tempValue;
                }
            }
        }

        //8
        System.out.println("Final array after the sorting : ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(numArray[i] + ",");
        }
        System.out.println(numArray[numArray.length - 1]);

    }
}
Enter number of array elements :
5
Enter element : 4
Enter element : 2
Enter element : 8
Enter element : 9
Enter element : 1
You have entered :
4,2,8,9,1
Final array after the sorting :
1,2,4,8,9


11. How to convert a byte array to String? 
Ans–

public class ByteArraytoStringExample  
{  
public static void main(String args[])   
{  
try  
{  
byte[] bytes = "hello world".getBytes();  
//creates a string from the byte array without specifying character encoding  
String s = new String(bytes);     
System.out.println(s);  
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
}  

o/p->

12. How to rotate an array left and right by a given number K? 
Ans–

// Java program to Left Rotate an Array
// by D elements
 
// Main class
class GFG {
 
    // Method 1
    // To left rotate arr[]
    // of size N by D
    void leftRotate(int arr[], int d, int n)
    {
        // Creating temp array of size d
        int temp[] = new int[d];
 
        // Copying first d element in array temp
        for (int i = 0; i < d; i++)
            temp[i] = arr[i];
 
        // Moving the rest element to index
        // zero to N-d
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
 
        // Copying the temp array element
        // in original array
        for (int i = 0; i < d; i++) {
            arr[i + n - d] = temp[i];
        }
    }
 
    // Method 2
    // To print an array
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
    // Method 3
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of class inside main()
        GFG rotate = new GFG();
 
        // Custom input array
        int arr[] = { 1, 2, 3, 4, 5 };
 
        // Calling method 1 and 2 as defined above
        rotate.leftRotate(arr, 2, arr.length);
        rotate.printArray(arr, arr.length);
    }
}

o/p->

3 4 5 1 2


13. Write a program to sort an Array in Java ?  
Ans–


public class SortArrayExample1  
{   
public static void main(String[] args)   
{   
//defining an array of integer type   
int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
//invoking sort() method of the Arrays class  
Arrays.sort(array);   
System.out.println("Elements of array sorted in ascending order: ");  
//prints array using the for loop  
for (int i = 0; i < array.length; i++)   
{       
System.out.println(array[i]);   
}   
}  
}  

o/p->
Array elements in ascending order: 
5 
12 
22 
23 
34 
67 
90 
109


14. Write a program to check whether two given Arrays are equal, given both contains same data type and same length ? 
Ans–


// Java Program to find the if the arrays are equal
  
import java.util.Arrays;
  
public class CheckArraysEqual {
    public static void main(String[] args)
    {
        // Initializing the first array
        int a[] = { 30, 25, 40 };
  
        // Initializing the second array
        int b[] = { 30, 25, 40 };
  
        // store the result
        // Arrays.equals(a, b) function is used to check
        // whether two arrays are equal or not
        boolean result = Arrays.equals(a, b);
  
        // condition to check whether the
        // result is true or false
        if (result == true) {
            // Print the result
            System.out.println("Two arrays are equal");
        }
        else {
            // Print the result
            System.out.println("Two arrays are not equal");
        }
    }
}
o/p->

Two arrays are equal
 
15. How to find the missing number in a given Array from number 1 to 100 ? 

Ans–

import java.util.Scanner;
public class MissingNumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the n value: ");
      int n = sc.nextInt();
      int inpuArray[] = new int[n];
      System.out.println("Enter (n-1) numbers: ");
      for(int i=0; i<=n-2; i++) {
         inpuArray[i] = sc.nextInt();
      }
      //Finding the missing number
      int sumOfAll = (n*(n+1))/2;
      int sumOfArray = 0;
      for(int i=0; i<=n-2; i++) {
         sumOfArray = sumOfArray+inpuArray[i];
      }
      int missingNumber = sumOfAll-sumOfArray;
      System.out.println("Missing number is: "+missingNumber);
   }
}

o/p->

Enter the n value:
5
Enter (n-1) numbers:
1
2
4
5
Missing number is: 3

16. Given two arrays, find the intersection between them?  
Ans–

public class Example {
   public static void main(String args[]) {
      int arr1[] = {2, 4, 6, 8, 9};
      int arr2[] = {1, 3, 4, 5, 6, 8, 9};
      int m = arr1.length;
      int n = arr2.length;
      int i = 0, j = 0;
      System.out.print("Array 1: ");
      for(int k = 0; k < m; k++) {
         System.out.print(arr1[k] + " "); 
      }
      System.out.print("
");
      System.out.print("Array 2: ");
      for(int k = 0; k < n; k++) {
         System.out.print(arr2[k] + " ");
      }
      System.out.print("
");
      System.out.print("Intersection of two arrays is: ");
      while (i < m && j < n) {
         if (arr1[i] < arr2[j])
            i++;
         else if (arr2[j] < arr1[i])
            j++;
         else {
            System.out.print(arr2[j++]+" ");
            i++; 
         }
      }
   }
}
o/p->

Array 1: 2 4 6 8 9
Array 2: 1 3 4 5 6 8 9
Intersection of two arrays is: 4 6 8 9

17. Find the missing number in an Array between 1 to 100. Given only one number is missing
Ans–

** Copyright (c), AnkitMittal www.JavaMadeSoEasy.com */
public class FindMissingNumberInSortedArrayExample{
   static int ar[]={3,5,8,44}; //given array
  
   public static void main(String[] args) {
          displayMissing();      
   }
  
   /*
   * Method finds out missing number in given range.
   */
   static public void displayMissing(){
         
          System.out.print("given array(already sorted): ");
          for (int j = 0; j < ar.length; j++)
                 System.out.print(ar[j] +" "); // display it
         
          System.out.print("\nNumbers missing between 1 to 100 in array :  ");
         
          int j=0;
          for(int i=1;i<=100;i++){
                 if(j<ar.length && i==ar[j])
                       j++;
                 else
                       System.out.print(i+" ");
                
          }
         
   }
  
}
/*OUTPUT
given array(already sorted): 3 5 8 44
Numbers missing between 1 to 100 in array :  1 2 4 6 7 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100
*/

18. How to find duplicate elements in a given Array 
Ans–


// Java implementation of the
// above approach
 
import java.util.ArrayList;
 
public class GFG {
 
    // Function to find the Duplicates,
    // if duplicate occurs 2 times or
    // more than 2 times in
    // array so, it will print duplicate
    // value only once at output
    static void findDuplicates(
      int arr[], int len)
    {
 
        // initialize ifPresent as false
        boolean ifPresent = false;
 
        // ArrayList to store the output
        ArrayList<Integer> al = new ArrayList<Integer>();
 
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    // checking if element is
                    // present in the ArrayList
                    // or not if present then break
                    if (al.contains(arr[i])) {
                        break;
                    }
 
                    // if element is not present in the
                    // ArrayList then add it to ArrayList
                    // and make ifPresent at true
                    else {
                        al.add(arr[i]);
                        ifPresent = true;
                    }
                }
            }
        }
 
        // if duplicates is present
        // then print ArrayList
        if (ifPresent == true) {
 
            System.out.print(al + " ");
        }
        else {
            System.out.print(
                "No duplicates present in arrays");
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
 
        int arr[] = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };
        int n = arr.length;
 
        findDuplicates(arr, n);
    }
}


o/p->

[12, 11, 5]
 
19. Write a program to sum all the values of a given Array in java?  
Ans–


// Java Program to find sum of elements in a given array
class Test {
    static int arr[] = { 12, 3, 4, 15 };
 
    // method for sum of elements in an array
    static int sum()
    {
        int sum = 0; // initialize sum
        int i;
 
        // Iterate through all elements and add them to sum
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
 
        return sum;
    }
 
    // Driver method
    public static void main(String[] args)
    {
        System.out.println("Sum of given array is "
                           + sum());
    }
}

o/p->

Sum of given array is 34
 
20. How do you separate zeros and non-zeros in a given Array in java? 
Ans–


import java.util.Arrays;
import java.util.Scanner;
public class ZerosFromNonZeros {
   public static void main(String args[]){
      //Reading the array from the user
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array that is to be created: ");
      int size = sc.nextInt();
      int[] myArray = new int[size];
      System.out.println("Enter the elements of the array: ");
      for(int i=0; i<size; i++){
         myArray[i] = sc.nextInt();
      }
      System.out.println("The array created is: "+Arrays.toString(myArray));
      System.out.println("Resultant array: ");
      int pos = 0;
      for(int i=0; i<myArray.length; i++){
         if(myArray[i]!=0){
            myArray[pos]=myArray[i];
            pos++;
         }
      }
      while(pos<myArray.length) {
         myArray[pos] = 0;
         pos++;
      }
      System.out.println("The array created is: "+Arrays.toString(myArray));
   }
}
o/p->


Enter the size of the array that is to be created:
8
Enter the elements of the array:
14
0
56
0
12
47
0
0
The array created is: [14, 0, 56, 0, 12, 47, 0, 0]
Resultant array:
The array created is: [14, 56, 12, 47, 0, 0, 0, 0]


21. How to convert Array to ArrayList in java ? 
Ans–


// Java program to demonstrate conversion of
// Array to ArrayList of fixed-size.
import java.util.*;
 
class GFG
{
    public static void main (String[] args)
    {
        String[] geeks = {"Rahul", "Utkarsh",
                          "Shubham", "Neelam"};
 
        // Conversion of array to ArrayList
        // using Arrays.asList
        List al = Arrays.asList(geeks);
 
        System.out.println(al);
    }
}


O/p->

[Rahul, Utkarsh, Shubham, Neelam]


22. How to convert Array to TreeSet in java ?  
Ans–


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
import java.util.TreeSet;
 
public class ConvertArrayToTreeSetExample {
    
    public static void main(String[] args) {
        
        Integer[] numberArray = new Integer[]{3, 2, 5, 1, 4, 2};
        
        //create new TreeSet object of the same type
        TreeSet<Integer> tSetNumbers = new TreeSet<Integer>();
        
        //use for loop
        for(Integer number : numberArray){
            
            //add element to the TreeSet
            tSetNumbers.add(number);
        }
        
        System.out.println("TreeSet contains: " + tSetNumbers);
    }
}



o/p->


TreeSet contains: [1, 2, 3, 4, 5]

23. How to convert ArrayList to String Array in java ? 

Ans–

/ Java Program to Convert ArrayList to Array
// using toArray() Method
 
// Importing required classes
import java.util.ArrayList;
import java.util.Arrays;
 
// Main class
class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating an empty ArrayList of string type
        ArrayList<String> al = new ArrayList<String>();
 
        // Populating the ArrayList by custom elements
        al.add("Anshul Aggarwal");
        al.add("Mayank Solanki");
        al.add("Abhishek Kelenia");
        al.add("Vivek Gupta");
 
        String[] str = new String[al.size()];
 
        for (int i = 0; i < al.size(); i++) {
            str[i] = al.get(i);
        }
 
        // Printing using for each loop
        for (String k : str) {
            System.out.println(k);
        }
    }
}
o/p->

Anshul Aggarwal
Mayank Solanki
Abhishek Kelenia
Vivek Gupta
24. Write a program to find second largest element in a given Array in java?
Ans–

public class SecondLargestInArrayExample{  
public static int getSecondLargest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-2];  
}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2};  
int b[]={44,66,99,77,33,22,55};  
System.out.println("Second Largest: "+getSecondLargest(a,6));  
System.out.println("Second Largest: "+getSecondLargest(b,7));  
}}  
o/p->

Second Largest: 5
Second Largest: 77
