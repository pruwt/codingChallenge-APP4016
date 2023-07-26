import java.util.*;
public class CelsiusFahrenheitCalc {
    public static void main(String[] args) {
        //converts Fahrenheit to Celsius

//        int fahrenheit =94;
//      float temperature = ((fahrenheit - 32) * 5/9);
//        System.out.println( "The temperature is " + temperature + " degree celcius");
//
//
//         temperature = ((fahrenheit - 32) * 5/9);
//        System.out.println( "The temperature is " + Math.round(temperature
//        ) + " degree celcius");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit to convert");
        float fahr = input.nextFloat();

        //calculator
        double cels = ((fahr - 32) * 5/9);

        System.out.println("Temperature in Celsius: " +Math.round(cels)); //rounds up



    }
}
