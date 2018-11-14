package collectanea;
import java.util.*;
public class Collectanea {
                
//Activity 1
public static void main(String[] args){
    
System.out.println("Activity no. 1 (Areas)");    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle: ");
        int radius = input.nextInt();
        double AreaCircle = (double) (Math.PI * (Math.pow(radius, 2)));
        System.out.println("The Area of the Circle is " + AreaCircle);
        
        System.out.print("Enter the side of the Square: ");
        int side = input.nextInt();
        double AreaSquare = (double) Math.pow(side, 2);
        System.out.println("The Area of the Square is " + AreaSquare);
        
        System.out.print("Enter the height of the Triangle: ");
        int height = input.nextInt();
        System.out.print("Enter the base of the Triangle: ");
        int base = input.nextInt();
        double AreaTriangle = (double) (0.5 * (base * height));
        System.out.println("The Area of the Triangle is " + AreaTriangle);
        System.out.println("\n");

//Activity 2
System.out.println("Activity no. 2 (Calculator)"); 
        Scanner pwityy = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int a = pwityy.nextInt();
        System.out.print("Enter anonther number: ");
        int b = pwityy.nextInt();
        System.out.print("Enter Operation: ");
        String c = pwityy.next();
        
        System.out.print("The result is: ");
        switch(c) {
            
            case ("add"):
                case ("+"):
                    System.out.println(a+b);
                    break;
                
            case ("subtract"):
                case ("-"):
                    System.out.println(a-b);
                    break;
                    
            case ("multiply"):
                case ("*"):
                    System.out.println(a*b);
                    break;
                    
            case ("divide"):
                case ("/"):
                    System.out.println(a/b);
                    break;
                    
            case ("modulo"):
                case ("%"):
                     System.out.println(a%b);
                     break;
                     
                     
                default:
                    System.out.println("invalid input");
                    
                    
        }System.out.println("\n");
                    
//Activity 3
System.out.println("Activity no. 3 (Courses)");
        Scanner renz = new Scanner(System.in);
        System.out.println("Enter your Department:");
        String ad = renz.next();
        System.out.println("Enter your Course");
        if("COA".equals(ad)){
            String bd = renz.next();
            if("BSA".equals(bd)){
                System.out.println("Your college is COA and your course is BSA");
                System.out.println("The Bachelor of Science in Accountancy (BSA) curriculum adopts CHED MEMORANDUM ORDER NO. 3 Series of 2007, which is based on International Education Standards aimed to equip students to meet the competencies required in the workplace whether in the country or abroad. It is an 11 trimester course (3 years plus 2 semesters) which is equivalent to a 5-year course in a semestral setting. The program prepares students to be liberally educated accountants who can think and write clearly, effectively, and critically. It also prepares them to become total business advisors, who are knowledgeable with business structures and economic concepts; and trains them to be ethically and technically competent in the field of accounting and auditing.");
            }else if("BSAT".equals(bd)){
                System.out.println("Your college is COA and your course is BSAT");
                System.out.println("The BSAcT is a program that prepares students for a career in the accounting and finance divisions of organizations in the private and public sectors. The accounting courses in the BSAcT program, combined with business management courses, equip students with the needed skills, proficiency, and intellectual abilities to lead successful careers. All four major sectors of accountancy, namely public practice, commerce and industry, government, and education, need support staff who will work as bookkeepers, financial analysts, audit staff, inventory control accountants, general ledger accountants, receivables accountants, payables accountants, and other functions where the CPA credential is not required. The BSAcT graduate could adequately respond to this need.");
            }else if("BSMA".equals(bd)){
                System.out.println("Your college is COA and your course is BSMA");
            }else if("BSFA".equals(bd)){
                System.out.println("Your college is COA and your course is BSFA");
            }
        }
        if("CEA".equals(ad)){
            String bd = renz.next();
            if("BSA".equals(bd)){
                System.out.println("Your college is CEA and your course is BSA");
            }else if("BSCE".equals(bd)){
                System.out.println("Your college is CEA and your course is BSCE");
            }else if("BSComE".equals(bd)){
                System.out.println("Your college is CEA and your course is BSComE");
            }else if("BSEE".equals(bd)){
                System.out.println("Your collage is CEA and your course is BSEE");
            }else if("BSESE".equals(bd)){
                System.out.println("Your college is CEA and your course is BSESE");
            }
        }
        if("CITCS".equals(ad)){
            String bd = renz.next();
            if("BSCS".equals(bd)){
                System.out.println("Your college is CITCS and your course is BSCS");
            }else if("BSIS".equals(bd)){
                System.out.println("Your college is CITCS and your course is BSIS");
            }else if("BSIT".equals(bd)){
                System.out.println("Your college is CITCS and your course is BSIT");
            }else if("ACT".equals(bd)){
                System.out.println("Your college is CITCS and your course is ACT");
            }
        }
        if("CTE".equals(ad)){
            String bd = renz.next();
            if("BSEE-G".equals(bd)){
                System.out.println("Your college is CTE and your course is BSEE-G");
            }else if("BSEE".equals(bd)){
                System.out.println("Your college is CTE and your course is BSEE");
            }else if("BSSE".equals(bd)){
                System.out.println("Your college is CTE and your course is BSSE");
            }
        }
        if("CAS".equals(ad)){
            String bd = renz.next();
            if("BAE".equals(bd)){
                System.out.println("Your college is CAS and your course is BAE");
            }else if("BAPS".equals(bd)){
                System.out.println("Your college is CAS and your course is BAPS");
            }else if("BAC".equals(bd)){
                System.out.println("Your college is CAS and your course is BAC");
            }else if("BSP".equals(bd)){
                System.out.println("Your college is CAS and your course is BSP");
            }
        }
        if("CBA".equals(ad)){
            String bd = renz.next();
            if("BSBA".equals(bd)){
                System.out.println("Your college is CBA and your course is BSBA");
            }else if("BSE".equals(bd)){
                System.out.println("Your college is CBA and your course is BSE");
            }else if("BSOA".equals(bd)){
                System.out.println("Your college is CBA and your course is BSOA");
            }
        }
System.out.println("\n");

//Activity 4
System.out.println("Activity no. 4 (Guessing Game)");
        Scanner wes = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int z = wes.nextInt();
        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
        System.out.println("Guess the number");
        int x = wes.nextInt();
        
        
        while ( z != x ) {
            System.out.println("Try Again!: ");
           if(z > x){
               System.out.println("The number to be guessed is higher");
              
           }else {
               System.out.println("The number to be guessed is lower");
           }if (z % 2 == 0) {
               System.out.println("The number is even");
            
           }else {
               System.out.println("The number is odd");
           }
           x = wes.nextInt();
            
        }System.out.println("Correct!!!");       
        System.out.println("\n");
        
//Activity 5
  System.out.println("Activity no. 5 (Odd Even Table)");
    int [] wesley = {3,9,15,20,65,23,18,4,2,14,21,103};

    int [] even = new int [wesley.length];
    int [] odd = new int [wesley.length];

    int er = 0;
    int or = 0;
 
            for (int t = 0; t < wesley.length; t++){
                
                if(wesley[t] % 2 == 0) {
                even[er] = wesley[t];
                er++;
                    
                    
                } else {
                odd[or] = wesley[t];
                or++;
        }
    }

        System.out.println("Even \t Odd");
       
        int pr;
        for(pr = 0; pr < wesley.length; pr++){
            if(even[pr] == 0){
                System.out.print("\t");
                
                             
            }else {
                System.out.print(even[pr] + "\t");
            
        }
            if(odd[pr] == 0){
                System.out.print("\n");
                
                             
            }else {
                System.out.println(odd[pr]);
            }     
        }
    }
}