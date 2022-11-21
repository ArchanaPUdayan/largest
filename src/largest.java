import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        int a, b, c, largest, smallest, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the option");

        int option = sc.nextInt();
        if (option == 6) {
            System.out.println("Exit");
        } else {
            switch (option) {
                case 1:

                    System.out.println("enter the first number");
                    a = sc.nextInt();
                    System.out.println("enter the second number");
                    b = sc.nextInt();
                    System.out.println("enter the third number");
                    c = sc.nextInt();
                    System.out.println(largest = (c > (a > b ? a : b) ? c : ((a > b) ? a : b)));
                    break;
                case 2:
                    System.out.println("enter the first number");
                    a = sc.nextInt();
                    System.out.println("enter the second number");
                    b = sc.nextInt();
                    System.out.println("enter the third number");
                    c = sc.nextInt();
                    System.out.println(smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b));
                    break;
                case 3:
                    System.out.println("enter the num");
                    num = sc.nextInt();
                    boolean flag = false;
                    for (int i = 2; i <= num / 2; ++i) {
                        if (num % i == 0) {
                            flag = true;
                            break;
                        }
                    }

                    if (!flag)
                        System.out.println(num + " is a prime number.");
                    else
                        System.out.println(num + " is not a prime number.");
                    break;
                case 4:
                    System.out.println("enter the num");
                    num = sc.nextInt();
                    if (num % 2 == 0)
                        System.out.println("num is even");
                    else
                        System.out.println("num is not even");

                    break;
                case 5:

                    System.out.println("enter the num");
                    num = sc.nextInt();
                    int reverse = 0;

                    while (num != 0) {
                        int remainder = num % 10;
                        reverse = reverse * 10 + remainder;
                        num = num / 10;
                    }
                    System.out.println("reverse num" + reverse);
                    break;


            }
        }
    }
}







