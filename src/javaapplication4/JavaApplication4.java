
package javaapplication4;

import java.util.*;

public class JavaApplication4 {
    
   Scanner scanner = new Scanner(System.in);
    
    public double add(double num1, double num2 ){
        
        
        return num1 + num2;
    }
    
    
    public void enternum(){
        try {
           
         double enternum1, enternum2;
        System.out.print("Enter First Number: ");
        enternum1 = scanner.nextDouble();
        System.out.print("Enter Second Number: ");
        enternum2 = scanner.nextDouble();
        
        /*char = .next().chartAt(0)*/
        
      
        
        System.out.println("The answer is: "+ add(enternum1, enternum2));
            
        } catch (Exception e) {
            System.out.println("Error!");
        }
       
                     
    }

   
    public static void main(String[] args) {
        JavaApplication4 java =  new JavaApplication4();
        java.enternum();
        
    }
    
}
