package Recursion;

public class PrintN {

    public static void main(String[] args) {

        //calling method
       // printN(5);
        printNum(5);

    }

    //doing work while stack is building
    private static void printN(int n) {
        if(n==0)
            return ;
        System.out.println(n);
        printN(n-1);
    }

   private static  void printNum(int n)
   {
       if (n==0)
           return;
       printNum(n-1);
       System.out.println(n);
   }


}
