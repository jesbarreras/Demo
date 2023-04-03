
package javaapplication4;

import java.util.*;
        
        
public class Palindrome {
    
    
    Scanner scan =  new Scanner(System.in);// input type
   
    // function for checking palindrome 
    
   void checkpalindrome(String userInput) {
       
       int len = userInput.length();
       
       String reverseInput = "";     
       
       //reversing the input
       for (int i = len - 1; i >= 0; i--){
           
           reverseInput =  reverseInput + userInput.charAt(i);
           
           
       }
    //validating the reverse input   
        if (reverseInput.equalsIgnoreCase(userInput)) {
           
               System.out.println("This is Palindrome");
       }
           
           else {
               System.out.println("This is not Palindrome");
           }
       
       
       
   }
   
   // function for user input
    void inputUser () {
       
         try{
             
             String enterInput; 
             System.out.print("Enter a word or number: ");
             enterInput = scan.nextLine();
             
             checkpalindrome(enterInput);
             
             
         } catch (Exception e) {
            System.out.print("Error Input!!");
         }
       
   }
       
    


public static void main (String args []) {
    
    Palindrome  pali =  new Palindrome();
    pali.inputUser();

}

}
