import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precio;

        System.out.print("Ingrese el monto de la compra: ");
        precio = sc.nextDouble();

        if(precio>100){

            precio = precio * 0.90;

        }

        precio = precio * 1.18;

        System.out.println("Precio final con IGV: S/" + precio);

    }

}