import java.util.Scanner;

public class Test {
    public static void main (String[] args) {


        int numOne = 10;
        int numTwo = 30;
        int number = 5;

        System.out.println("==============");
        System.out.println("1 - addition");
        System.out.println("2 - soustraction");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");
        System.out.println("5 - table ");
        System.out.println("0 - exit");
        System.out.println("==============");
        System.out.println("enter your choice :");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int res = 0;
        while (choice != 0){
            switch (choice){
              case 1 :
                 res = numTwo + numOne;
                System.out.println("the result is : "+res);
                break;
              case 2 :
                 res = numTwo - numOne;
                System.out.println("the result is : "+res);
                break;
              case 3 :
                res = numTwo * numOne;
                System.out.println("the result is : "+res);
                break;
              case 4 :
                   if (numOne == 0){
                       System.out.println("impossible divided to 0 ");
                   }else{
                       float resDiv = numTwo / numOne;
                       System.out.println("the result is : "+resDiv);
                   }
                break;
              case 5 :
                for (int i = 1;i<=10;i++){
                    res = 5 * i;
                System.out.println(number +" * "+i+" = "+ res);
                }
                break;
              default:
                System.out.println("operator is not correct please enter the correct operator ");
                break;
        }
                System.out.println("==============");
                System.out.println("1 - addition");
                System.out.println("2 - soustraction");
                System.out.println("3 - multiplication");
                System.out.println("4 - division");
                System.out.println("5 - table ");
                System.out.println("0 - exit");
                System.out.println("==============");
                System.out.println("enter your choice :");
                choice = sc.nextInt();
        }
        System.out.println("thallaaaa");
    }
}
