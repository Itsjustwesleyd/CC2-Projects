package JavaApplication7;
import java.util.Scanner;
public class Combination {
    static long fi(int n){
    if ((n == 0) || (n == 1)){
        return n;
        
    } else { 
    return fi (n-1) + fi (n-2); 
    } 
      }
    
    static long fa(int n) {
        if(n<=1)
            return 1;
        else
            return n * fa(n - 1);
        
    }
   
    static void Scanner(){
        Scanner sc = new Scanner(System.in);
        String Pick; 
        
        System.out.println("What do you want to get? factorial or fibonacci?");
        Pick = sc.nextLine().toLowerCase();
        
        switch(Pick){
            
            case "fibonacci":
                fibonacciGO();
                break;
                
            case "factorial":
                factorialGO();
                break;
                
            default:
                Scanner();
            
        }
        
    }
       
   
        static void factorialGO(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter array size: ");
            int row = sc.nextInt();
            int ley [] = new int [row];
            
            for(int hr = 0; hr < ley.length; hr++){
                System.out.print("Index [" + hr + "]: ");
            
                ley[hr] = sc.nextInt();
  
            }
            
            for (int hr = 0; hr < ley.length; hr++) {
                System.out.print("fa(" + ley[hr] + ")\t");
            }
            System.out.println("");
            
            System.out.println("The factorial is: ");
            
            for (int rh = 0; rh < ley.length; rh++) {
                System.out.print( fa(ley[rh]) + "\t");
            }
            System.out.println("");
}
        
        static void fibonacciGO(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter array size: ");
            int row = sc.nextInt();
            int ley [] = new int [row];
            
            for(int hr = 0; hr < ley.length; hr++){
                System.out.print("Index [" + hr + "]: ");
            
                ley[hr] = sc.nextInt();
  
            }
            
            for (int hr = 0; hr < ley.length; hr++) {
                System.out.print("fi(" + ley[hr] + ")\t");
            }
            System.out.println("");
            
            System.out.println("The fibonacci is: ");
            
            for (int rh = 0; rh < ley.length; rh++) {
                System.out.print(fi(ley[rh]) + "\t");
            }
            System.out.println("");
    }
    
        public static void main(String[] args){
            Scanner();
        }
        
}
