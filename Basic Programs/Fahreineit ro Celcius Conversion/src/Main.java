import java.util.Scanner;
class FahrenheitToCelsius
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in fahrenheit: ");
        float F = input.nextFloat();

        float celsius = (F - 32f) * 5f / 9f;

        System.out.println("Temperature in celsius: " + celsius);

    }
}
