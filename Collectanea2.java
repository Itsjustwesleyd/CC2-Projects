package collectanea;
import java.util.*;
public class Collectanea2 {
                    static long f(int n){ //fibonacci
                if ((n == 0) || (n == 1)){
                    return n;
        
            } else { 
                return f (n-1) + f (n-2); 
         } 
      }
//Activity 6 
public static void main(String[] args){
System.out.println("Activity no. 6 (User input - 2d)");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int row = sc.nextInt();
        System.out.print("Enter column size: ");
        int column = sc.nextInt();
       
        String ley [][] = new String [row][column]; 
             
            for(int hr = 0; hr < row; hr++){
                for(int ir = 0; ir < column; ir++){
                
                System.out.print("Row: " + hr + " Column: " + ir + ": ");
            
                String jr = sc.next();
                ley[hr][ir] = jr; 
                }
            }
            
            System.out.print("\n");
            System.out.println("Two Dimensional Array:");
            
            for (int i = 0; i < ley.length; i++) {
                
                for (int j = 0; j < ley[i].length; j++) {
                    System.out.print(ley[i][j] + " ");
                }
                
                System.out.println("");
            }System.out.print("\n");

                
                               
//Activity 7
System.out.println("Activity no. 7(Fibonacci)");
            System.out.println("Enter a number: ");
                int s = sc.nextInt();
        
            for(int q = 0; q <= s; q++){
                
            System.out.print("f(" + q + ")" +"\t");
                }System.out.print("\n");
    
            for(int q = 0; q <= s; q++){
                for(int u = 0; u <= q; u++){
            System.out.print(f(u)+"\t");
            }System.out.print("\n");

                
        }
      }
    }


