import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        float num1,num2,result;
        char operation;
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to menu driven calculaor");
        System.out.println("+: Addition of two numbers");
        System.out.println("-: Subtraction of two numbers");
        System.out.println("*: Multiplication of two numbers");
        System.out.println("/: Division of two numbers");
        System.out.println("Enter your option(+,-,*,/):");
        operation=sc.next().charAt(0);
        System.out.println("Enter first number:");
        num1=sc.nextFloat();
        System.out.println("Enter second number:");
        num2=sc.nextFloat();
        switch (operation){
            case '+':
                result=num1+num2;
                System.out.println("sum of "+num1+" add "+num2+" is:"+result);
                break;
                case '-':
                result=num1-num2;
                System.out.println("Difference of "+num1+" add "+num2+" is:"+result);
                break;
                case '*':
                result=num1*num2;
                System.out.println("Multiplication of "+num1+" add "+num2+" is:"+result);
                break;
                case '/':
                result=num1/num2;
                System.out.println("Division of "+num1+" add "+num2+" is:"+result);
                break;
                default:
                    System.out.println("invalid option inputted");
        }




    }
    
}
