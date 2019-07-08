//This is a basic program for a celcius and fahrenhiet converter
import java.util.Scanner;

public class simpfahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        while(true){
            System.out.println("Would you like to enter a temperature in Celcius or Fahrenheit?('x' to Close)");
            String opt = sc.nextLine();

            if(opt.equalsIgnoreCase("Celcius")){
                celcius();
            }else if (opt.equalsIgnoreCase("Fahrenheit")){
                fahrenheit();
            }else if(opt.equalsIgnoreCase("x")){
                break;
            }else{
                System.out.println("Invalid response try again.");
            }
        }
    }
    public static void celcius() {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter your degrees in Celcius: ");
        double degrees = s.nextDouble();

        double fah = (degrees * (9/5)) +32;
        System.out.println("Your temperature in Fahrenhiet is: " + fah);
    }
    
    public static void fahrenheit() {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter your degrees in Fahrenheit: ");
        double degrees = s.nextDouble();

        double cel = (degrees - 32) * 5/9;
        System.out.println("Your temperature in Celcius is: " + cel);

    }
}
