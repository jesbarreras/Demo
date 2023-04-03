
package javaapplication4;

import java.util.*;

public class CapitalLetters {  
    
  Scanner scan = new Scanner(System.in);//Input type
    
 // function for return count of Capital Letters   
 public int countcapital (String userInput) {
      
     int len, count = 0;
     
     len = userInput.length();
     
     char letter;
     
     for (int  i = 0; i < len; i++ ) {
         
         //validating characters if capital or not
         
         letter = userInput.charAt(i);
         
         if (Character.isUpperCase(letter)) {
             count++;
         }
     }
     
     return count;
 }
    
 //function that user can input
 void inputuser () {
     
     try {
         
         System.out.print("Enter a word: ");
         String inputword = scan.nextLine().replaceAll("\\s", "");
         
         int capitalCount = countcapital(inputword);
        
         System.out.println("The number of capital letters base on the word you've been enteres is :" + capitalCount);
         
     } catch (Exception e) {
         System.out.println("Error Input!! Please enter only a word");
     }
     
 }

public static void main (String args [] ) {

    CapitalLetters cp = new CapitalLetters();
    cp.inputuser();
    
}    
}

