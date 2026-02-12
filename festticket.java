import java.util.Scanner;
public class festticket {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            System.out.println("Enter age");   
        int age =sc.nextInt();
        System.out.println("Do you have a membership card? (yes/no):");
        String membership=sc.next();
        int price;
        if (age < 12){
            price=5;
        } 
        else if (age>=65){
            price=7;
        } 
        else{
            price=10;
        }
            if 
            (membership.equalsIgnoreCase("yes")){
                price= price -2;
            }
            System.out.println("Your ticket price is :$"+price);
            sc.close();
        }
             


             
    }
    

