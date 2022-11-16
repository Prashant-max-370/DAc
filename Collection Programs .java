
Collection coding questions:

/*
1. Write a Java program to create a new array list, add some colors (string) and print out the 
collection.
Ans--
*/

import java.util.*;
public class Col {
  public static void main(String[] args) {
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Green");
  list_Strings.add("Orange");
  list_Strings.add("White");
  list_Strings.add("Black");
  System.out.println(list_Strings);
 }
}

o/p->

[Red, Green, Orange, White, Black]


2. Write a Java program to insert an element into the array list at the first position.
Ans--

import java.util.*;
  public class Col {
  public static void main(String[] args) {
  // Creae a list and add some colors to the list
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Green");
  list_Strings.add("Orange");
  list_Strings.add("White");
  list_Strings.add("Black");
  // Print the list
  System.out.println(list_Strings);
  // Now insert a color at the first and last position of the list
  list_Strings.add(0, "Pink");
  list_Strings.add(5, "Yellow");
  // Print the list
  System.out.println(list_Strings);
 }
}

o/p->

[Red, Green, Orange, White, Black]
[Pink, Red, Green, Orange, White, Yellow, Black]

3. Write a Java program to retrieve an element (at a specified index) from a given array list.
Ans--

import java.util.*;
  public class Exercise4 {
  public static void main(String[] args) {
  // Creae a list and add some colors to the list
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Green");
  list_Strings.add("Orange");
  list_Strings.add("White");
  list_Strings.add("Black");
  // Print the list
  System.out.println(list_Strings);
  // Retrive the first and third element
  String element = list_Strings.get(0);
  System.out.println("First element: "+element);
  element = list_Strings.get(2);
  System.out.println("Third element: "+element);
 }
}

o/p->

[Red, Green, Orange, White, Black]
First element: Red
Third element: Orange

4. Write a Java program to sort a given array list.

Ans--

// Java Program to Sort an ArrayList
 
import java.util.*;
 
class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Define an objects of ArrayList class
        ArrayList<String> list = new ArrayList<String>();
 
        // Adding elements to the ArrayList
        list.add("India");
        list.add("Pakistan");
        list.add("Srilanka");
        list.add("USA");
        list.add("Australia");
        list.add("Japan");
 
        // Printing the unsorted ArrayList
        System.out.println("Before Sorting : " + list);
 
        // Sorting ArrayList in ascending Order
        Collections.sort(list);
 
        // printing the sorted ArrayList
        System.out.println("After Sorting : " + list);
    }
}

o/p-

Before Sorting : [India, Pakistan, Srilanka, USA, Australia, Japan]
After Sorting : [Australia, India, Japan, Pakistan, Srilanka, USA]

5. Write a Java program to reverse elements in a array list.
Ans--
  
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

6. Write a Java program of swap two elements in an array list.

Ans--

import java.util.ArrayList;
import java.util.Collections;
  public class Exercise14 {
  public static void main(String[] args) {
   ArrayList<String> c1= new ArrayList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");

          System.out.println("Array list before Swap:");
          for(String a: c1){
          System.out.println(a);
        }
          //Swapping 1st(index 0) element with the 3rd(index 2) element
         Collections.swap(c1, 0, 2);
          System.out.println("Array list after swap:");
          for(String b: c1){
          System.out.println(b);
         }
     }
}

o/p->

Array list before Swap:                                                
Red                                                                    
Green                                                                  
Black                                                                  
White                                                                  
Pink                                                                   
Array list after swap:                                                 
Black                                                                  
Green                                                                  
Red                                                                    
White                                                                  
Pink 

7. Write a Java program to print all the elements of a ArrayList using the position of the 
elements.
Ans--

import java.util.ArrayList;
  public class Exercise22 {
    public static void main(String[] args) {
  ArrayList <String> c1 = new ArrayList <String> ();
  c1.add("Red");
  c1.add("Green");
  c1.add("Black");
  c1.add("White");
  c1.add("Pink");
  System.out.println("\nOriginal array list: " + c1);
  System.out.println("\nPrint using index of an element: ");
  int no_of_elements = c1.size();
  for (int index = 0; index < no_of_elements; index++)
   System.out.println(c1.get(index));
 }
}

o/p->

Original array list: [Red, Green, Black, White, Pink]                  
                                                                       
Print using index of an element:                                       
Red                                                                    
Green                                                                  
Black                                                                  
White                                                                  
Pink 

8. Write a Java program to append the specified element to the end of a linked list.
Ans--

import java.util.LinkedList;
  public class Exercise1 {
  public static void main(String[] args) {
     // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("White");
          l_list.add("Pink");
          l_list.add("Yellow");
	
   // print the list
   System.out.println("The linked list: " + l_list);
   }
}

o/p->

The linked list: [Red, Green, Black, White, Pink, Yellow]

9. Write a Java program to insert the specified element at the specified position in the linked 
list.

Ans-- 
 
import java.util.LinkedList;
public class Exercise5 {
	public static void main(String[] args) {
		// create an empty linked list
		LinkedList <String> l_list = new LinkedList <String> ();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");
		System.out.println("Original linked list: ");
		System.out.println("Let add the Yellow color after the Red Color: " + l_list);
		l_list.add(1, "Yellow");
		// print the list
		System.out.println("The linked list:" + l_list);
	}
}

o/p->

Original linked list:                                                  
Let add the Yellow color after the Red Color: [Red, Green, Black, White
, Pink]                                                                
The linked list:[Red, Yellow, Green, Black, White, Pink]

10. Write a Java program to insert elements into the linked list at the first and last position.

ANS--


import java.util.LinkedList;
  public class Exercise6 {
  public static void main(String[] args) {
   // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
     System.out.println("Original linked list:" + l_list);    
   // Add an element at the beginning 
    l_list.addFirst("White");
 
   // Add an element at the end of list 
    l_list.addLast("Pink");
     System.out.println("Final linked list:" + l_list);  
 }
}

o/p->

Original linked list:[Red, Green, Black]                               
Final linked list:[White, Red, Green, Black, Pink]

11. Write a Java program to display the elements and their positions in a linked list. 

Ans--

import java.util.LinkedList;
import java.util.Iterator;
  public class Exercise1 {
  public static void main(String[] args) {
    // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("Pink");
          l_list.add("orange");
      
      // print original list
   System.out.println("Original linked list:" + l_list);  
  for(int p=0; p < l_list.size(); p++)
   {
      System.out.println("Element at index "+p+": "+l_list.get(p));
    } 
 }
}

o/p->

Original linked list:[Red, Green, Black, Pink, orange]                 
Element at index 0: Red                                                
Element at index 1: Green                                              
Element at index 2: Black                                              
Element at index 3: Pink                                               
Element at index 4: orange

12. Write a Java program to check if a particular element exists in a linked list.

Ans--

import java.util.*;
public class Exercise22 {
 public static void main(String[] args) {
  // create an empty linked list
  LinkedList <String> c1 = new LinkedList <String> ();
            c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          System.out.println("Original linked list: " + c1);
           
     // Checks whether the color "Green" exists or not.
    if (c1.contains("Green")) {
       System.out.println("Color Green is present in the linked list.");
    } else {
       System.out.println("Color Green is not present in the linked list.");
     }
    
     // Checks whether the color "Orange" exists or not.
    if (c1.contains("Orange")) {
       System.out.println("Color Orange is present in the linked list.");
    } else {
       System.out.println("Color Orange is not present in the linked list.");
     }
    
 }
}

o/p->

Original linked list: [Red, Green, Black, White, Pink]                 
Color Green is present in the linked list.                             
Color Orange is not present in the linked list.

13. Write a Java program to compare two linked lists.
Ans--

import java.util.*;
  public class Exercise24 {
  public static void main(String[] args) {
   LinkedList<String> c1= new LinkedList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");

          LinkedList<String> c2= new LinkedList<String>();
          c2.add("Red");
          c2.add("Green");
          c2.add("Black");
          c2.add("Orange");

          //comparison output in linked list
          LinkedList<String> c3 = new LinkedList<String>();
          for (String e : c1)
             c3.add(c2.contains(e) ? "Yes" : "No");
          System.out.println(c3);         
     }
}

o/p->

[Yes, Yes, Yes, No, No]


14. Write a Java program to replace an element in a linked list.
Ans--

import java.util.LinkedList;
import java.util.Collections;
  public class Exercise18 {
  public static void main(String[] args) {
          LinkedList<String> c1= new LinkedList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          System.out.println("Original linked list: " + c1);
          // Replacing 2nd element with new value
          c1.set(1, "Orange");
          System.out.println("The value of second element changed.");
          System.out.println("New linked list: " + c1);
   }
}

o/p->

Original linked list: [Red, Green, Black, White, Pink]                 
The value of second element changed.                                   
New linked list: [Red, Orange, Black, White, Pink] 

15. Write a Java program to iterate through all elements in a hash list.
Ans--

import java.util.*;
import java.util.Iterator;
  public class Exercise2 {
  public static void main(String[] args) {
         // Create a empty hash set
     HashSet<String> h_set = new HashSet<String>();
   // use add() method to add values in the hash set
          h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");

  // set Iterator 
    Iterator<String> p = h_set.iterator();
  // Iterate the hash set
   while (p.hasNext()) {
   System.out.println(p.next());
   }
   }
}

o/p->

Red                                                                    
White                                                                  
Pink                                                                   
Yellow                                                                 
Black                                                                  
Green

16. Write a Java program to empty an hash set.
Ans--

import java.util.*;

  public class Exercise4 {
  public static void main(String[] args) {
         // Create a empty hash set
     HashSet<String> h_set = new HashSet<String>();
   // use add() method to add values in the hash set
          h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");
    System.out.println("Original Hash Set: " + h_set);
    // Remove all elements
    h_set.removeAll(h_set);
    System.out.println("Hash Set after removing all the elements "+h_set);   
   }
}

o/p->

Original Hash Set: [Red, White, Pink, Yellow, Black, Green]            
Hash Set after removing all the elements [] 

17. Write a Java program to convert a hash set to an array.
Ans--

There are two ways of converting HashSet to the array:

Traverse through the HashSet and add every element to the array.
To convert a HashSet into an array in java, we can use the function of toArray().

Method 1: By traversing the set add elements to the array

// Java program to convert HashSet to array
  
import java.io.*;
import java.util.*;
  
class GFG {
    public static void main(String[] args)
    {
        HashSet<String> set = new HashSet<String>();
        set.add("1");
        set.add("13");
        set.add("27");
        set.add("87");
        set.add("19");
  
        System.out.println("Hash Set Contains :" + set);
        String arr[] = new String[set.size()];
          
        int i=0;
        
        // iterating over the hashset
        for(String ele:set){
          arr[i++] = ele;
        }
  
        for (String n : arr)
            System.out.println(n);
    }
}

o/p->

Hash Set Contains :[1, 13, 27, 19, 87]
1
13
27
19
87

Method 2: Using toArray() method

// Java program to convert HashSet to array
  
import java.io.*;
import java.util.*;
  
class GFG {
    public static void main(String[] args)
    {
        HashSet<String> set = new HashSet<String>();
        set.add("1");
        set.add("13");
        set.add("27");
        set.add("87");
        set.add("19");
  
        System.out.println("Hash Set Contains :" + set);
        String arr[] = new String[set.size()];
        
        // toArray() method converts the set to array
        set.toArray(arr);
  
        for (String n : arr)
            System.out.println(n);
    }
}

o/p->

Hash Set Contains :[1, 13, 27, 19, 87]
1
13
27
19
87

18. Write a Java program to compare two sets and retain elements which are same on both 
sets.
Ans--

import java.util.*;
  public class Exercise11 {
  public static void main(String[] args) {
     // Create a empty hash set
        HashSet<String> h_set1 = new HashSet<String>();
     // use add() method to add values in the hash set
          h_set1.add("Red");
          h_set1.add("Green");
          h_set1.add("Black");
          h_set1.add("White");
          System.out.println("Frist HashSet content: "+h_set1);
          HashSet<String>h_set2 = new HashSet<String>();
          h_set2.add("Red");
          h_set2.add("Pink");
          h_set2.add("Black");
          h_set2.add("Orange");
          System.out.println("Second HashSet content: "+h_set2);
          h_set1.retainAll(h_set2);
          System.out.println("HashSet content:");
          System.out.println(h_set1);
     }
}

o/p->

Frist HashSet content: [Red, White, Black, Green]                      
Second HashSet content: [Red, Pink, Black, Orange]                     
HashSet content:                                                       
[Red, Black]

19. Write a Java program to create a new tree set, add some colors (string) and print out the 
tree set.
Ans--

import java.util.TreeSet;
public class Exercise1 {
  public static void main(String[] args) {
  TreeSet<String> tree_set = new TreeSet<String>();
  tree_set.add("Red");
  tree_set.add("Green");
  tree_set.add("Orange");
  tree_set.add("White");
  tree_set.add("Black");
  System.out.println("Tree set: ");
  System.out.println(tree_set);
 }
}

o/p->

Tree set:                                                              
[Black, Green, Orange, Red, White] 

20. Write a Java program to find the numbers less than 7 in a tree set. 

Ans--

import java.util.TreeSet;
import java.util.Iterator;

  public class Exercise9 {
  public static void main(String[] args) {
 // creating TreeSet 
   TreeSet <Integer>tree_num = new TreeSet<Integer>();
   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
     
   // Add numbers in the tree
   tree_num.add(1);
   tree_num.add(2);
   tree_num.add(3);
   tree_num.add(5);
   tree_num.add(6);
   tree_num.add(7);
   tree_num.add(8);
   tree_num.add(9);
   tree_num.add(10);
     
   // Find numbers less than 7
 treeheadset = (TreeSet)tree_num.headSet(7);  

   // create an iterator
   Iterator iterator;
   iterator = treeheadset.iterator();
     
   //Displaying the tree set data
   System.out.println("Tree set data: ");     
   while (iterator.hasNext()){
   System.out.println(iterator.next() + " ");
   }
   }    
}

o/p->

Tree set data:                                                         
1                                                                      
2                                                                      
3                                                                      
5                                                                      
6 

21. Write a Java program to remove all the elements from a priority queue.
Ans--

import java.util.*;
  public class Example5 {
  public static void main(String[] args) {
   // Create Priority Queue
           PriorityQueue<String> pq1 = new PriorityQueue<String>();  
   // use add() method to add values in the Priority Queue
          pq1.add("Red");
          pq1.add("Green");
          pq1.add("Black");
          pq1.add("White");
    System.out.println("Original Priority Queue: "+pq1);
   
   // Removing all the elements from the Priority Queue
    pq1.clear();
 
    System.out.println("The New Priority Queue: " + pq1);
  } 
}

o/p->

Original Priority Queue: [Black, Red, Green, White]                    
The New Priority Queue: []

22. Write a Java program to count the number of key-value (size) mappings in a map
Ans--

import java.util.*;  
public class Example2 {  
   public static void main(String args[]){  
  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
  hash_map.put(1, "Red");
  hash_map.put(2, "Green");
  hash_map.put(3, "Black");
  hash_map.put(4, "White");
  hash_map.put(5, "Blue");
  System.out.println("Size of the hash map: "+hash_map.size());
 }
}

o/p->

Size of the hash map: 5 

23. Write a Java program to convert a priority queue to an array containing all of the 
elements of the queue
Ans--

import java.util.*;

  public class Example10 {
  public static void main(String[] args) {

   // Create Priority Queue
           PriorityQueue<String> pq1 = new PriorityQueue<String>();  
   // use add() method to add values in the Priority Queue
          pq1.add("Red");
          pq1.add("Green");
          pq1.add("Black");
          pq1.add("White");
    System.out.println("Original Priority Queue: "+pq1);
   
   //Convert a linked list to array list    
   List<String> array_list = new ArrayList<String>(pq1);
   System.out.println("Array containing all of the elements in the queue: "+array_list);
    
   }    
}

o/p->

Original Priority Queue: [Black, Red, Green, White]                    
Array containing all of the elements in the queue: [Black, Red, Green, 
White] 

24. Write a Java program to check whether a map contains key-value mappings (empty) or 
not
Ans--

import java.util.*;  
public class Example5 {  
   public static void main(String args[]) {
  HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
  hash_map.put(1, "Red");
  hash_map.put(2, "Green");
  hash_map.put(3, "Black");
  hash_map.put(4, "White");
  hash_map.put(5, "Blue");
  // check if map is empty
  boolean result = hash_map.isEmpty();
  // check the result
  System.out.println("Is hash map empty: " + result);
  // Removing all the elements from the linked map
  hash_map.clear();
  // check if map is empty
  result = hash_map.isEmpty();
  // check the result
  System.out.println("Is hash map empty: " + result);
 }
}

o/p->

Is hash map empty: false                                               
Is hash map empty: true

25. Write a Java program to get the value of a specified key in a map
Ans-- 

import java.util.*;  
public class Example10 {  
    public static void main(String args[]){  
   HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
   hash_map.put(1,"Red");
  hash_map.put(2,"Green");
  hash_map.put(3,"Black");
  hash_map.put(4,"White");
  hash_map.put(5,"Blue");
     // get value of key 3
   String val=(String)hash_map.get(3); 
   // check the value
   System.out.println("Value for key 3 is: " + val);
 }
}

o/p->

Value for key 3 is: Black
 
