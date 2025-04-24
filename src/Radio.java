import java.util.Scanner;

public class Radio {
    public static void main(String[] args) {
        System.out.println("Ingresa el radio: ");
        Scanner escaner = new Scanner(System.in);
        long radio = escaner.nextInt();
        double area = Math.PI * (radio * radio);
        System.out.println("El área es: " + area);
        escaner.close();
    }
}
