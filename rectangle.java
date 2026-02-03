import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        double length,breadth,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        length=sc.nextDouble();
        System.out.println("Enter breadth ");
        breadth=sc.nextDouble();
        area=length*breadth;
        System.out.println("area of rectangle:"+area);
    }
    
}
