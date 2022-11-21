import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        int a,b,c,largest,smallest,option=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        a=sc.nextInt();
        System.out.println("enter the second number");
        b=sc.nextInt();
        System.out.println("enter the third number");
        c=sc.nextInt();
        System.out.println("enter the option");
        option=sc.nextInt();
        switch (option){
            case 1:
                System.out.println(largest = c > (a>b ? a:b) ? c:((a>b) ? a:b) );
                break;
            case 2:
                System.out.println(smallest=c<(a<b?a:b)?c:((a<b)? a:b));
            break;
            default:
                System.out.println("invalid");
        }

    }
}
