package javaapplication4;
import java.util.*;

public class EvenString { 
    Scanner scan = new Scanner(System.in);
    // function for printing string an event index
    public String printeven (String inputword) {
    
        int len = inputword.length(), i;
        String letter = "", printword ;
        
        for(i = 0; i<len;i++) {
       //validataing even number
          
          if (i%2 == 0) { 
          letter = letter+inputword.charAt(i);
         
          
          }
        }
        printword = letter;
        
        return printword;
    }
//function user input    
   void userInput(){
       try {
           String inputword, outputword;
           System.out.print("Enter a word: ");
           inputword = scan.next();
           
          outputword = printeven(inputword);
          System.out.println(outputword);
       } catch (Exception e) {
           
       }
   }    
    public static void main (String args []) {
        EvenString even =  new EvenString();
        even.userInput();      
    }   
}
