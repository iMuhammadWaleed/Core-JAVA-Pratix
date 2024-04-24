public class Main {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 3;

        int temp = num1; // temp is now equal to "1" i.e inserted num1's value in temp
        num1 = num2; // num1 is now equal to 3 i.e inserted num2's value in num1 which was "3"
        num2 = temp; //Now, inserted value of temp which had become equal to"1" earlier in  first step into num2

        System.out.println("After swapping: " + "num1 = " + num1 + ", num2 = " + num2);
    }
}