import java.util.*;

class Temperature {
public static void main(String [] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter Celsius: ");
int c = sc.nextInt();

double f = (c*9.0/5) + 35;

System.out.println("Celsius = " + c);
System.out.println("Fahrenheit = " + f);

}
}

