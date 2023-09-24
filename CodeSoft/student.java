package CodeSoft;
import java.util.Scanner;
public class student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in maths ");
        int math= sc.nextInt();
        System.out.println("Enter the marks in english ");
        int eng= sc.nextInt();
        System.out.println("Enter the marks in physics ");
        int phy=sc.nextInt();
        System.out.println("Enter the marks in biology ");
        int bio=sc.nextInt();
        int sum=math+eng+phy+bio;
        double avg_per=sum/4;
        System.out.println("your average percentage is : " + avg_per);
        if(avg_per>90 && avg_per<100)
        {
            System.out.println(" A grade ");

        }
        if(avg_per>80 && avg_per<90)
        {
            System.out.println(" B grade ");
        }
        if(avg_per>70 && avg_per<80)
        {
            System.out.println(" C grade ");
        }
        if(avg_per>60 && avg_per<70)
        {
            System.out.println(" D grade ");
        }
        if(avg_per>50 && avg_per<60)
        {
            System.out.println(" E grade ");
        }
        if(avg_per<50)
        {
            System.out.println("  Failed");
        }
        }
}
