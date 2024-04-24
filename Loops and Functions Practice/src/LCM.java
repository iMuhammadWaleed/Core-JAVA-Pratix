import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        //Suppose num1 = 15;

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        //Suppose num2 = 20;

        int lcm = lcm(num1,num2); //lcm will be 60

        System.out.println("LCM of these 2 numbers is: " + lcm); }

    public static int lcm(int num1, int num2) {

        int i = 1;

        while (true)
        {

            int factor = num1 * i;

            if (factor % num2 == 0)
            {
                return factor;
            }

            i++;

        }
    }
}

/*       Just understand what approach is used here!
           Particularly, compiler will first check compiler will also check condition of
           condition inside if brackets which is "factor % num2 == 0"
           to check whether after dividing factor by num2 which is 20 give 
           reminder of 0 or not, similarly iterations will take place;
           
           Iteration i=1:
           15x1=15, 15%20 ==0? (Nope..)
           
           Iteration i=2:
           15x2=30, 30%20 ==0? (Nope..)
           
           Iteration i=3:
           15x3=45,  45%20 ==0? (Nope..)
           
           Iteration i=4:
           15x4=60, 60%20 ==0? (Yes so it will end now!)
           
           Similarly, it will first take num 1 which is
           15 and then it will iterations to generate multiples
           @/c to given condition " int factor = num1 * i;", 
           of 15 till num2 which is 20 like 15x1=15 ... 15x 20..,
           just for assumption. Now, we know mathematically
           lcm of both 15 and 20 is 60, so during iterations of
           multiples of 15 if compiler gets number 60 then it 
           will terminate and return the answer that 60 is the 
           dividing with 15. Iterations will usually take like this:
           
           Iteration i=1:
           15x1=15 (cont..)
           
           Iteration i=2:
           15x2=30 (cont..)
           
           Iteration i=3:
           15x3=45  (cont..)
           
           Iteration i=4:
           15x4=60 (terminate/end)
           
           [Point to remember! How "i" is increasing, simply because of 
           "i++" which is basically "i = i +1" 's shorter form] */
