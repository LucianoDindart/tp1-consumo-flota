import java.util.Scanner;

public class Viaje {

    public static final double PRECIO_GASOIL = 1250.0;
    public static final double CAPACIDAD_TANQUE = 400.0;

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la patente del camión: ");
        String patente = teclado.nextLine();

        System.out.print("Ingrese el kilometraje inicial: ");
        double kmInicial = teclado.nextDouble();

        System.out.print("Ingrese el kilometraje final: ");
        double kmFinal = teclado.nextDouble();

        System.out.print("Ingrese los litros cargados: ");
        double litrosCargados = teclado.nextDouble();

        double kmRecorridos = kmFinal - kmInicial;
        double consumo = (litrosCargados / kmRecorridos) * 100;
        double rendimiento = kmRecorridos / litrosCargados;
        double costoTotal = litrosCargados * PRECIO_GASOIL;
        double costoPorKm = costoTotal / kmRecorridos;
        double porcentajeTanque = (litrosCargados / CAPACIDAD_TANQUE) * 100;

        System.out.println("\n--------------------------------------------------");
        System.out.println("               RESUMEN DEL VIAJE");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-30s %s%n", "Patente:", patente);
        System.out.printf("%-30s %.2f km%n", "Kilómetros recorridos:", kmRecorridos);
        System.out.printf("%-30s %.2f litros/100km%n", "Consumo:", consumo);
        System.out.printf("%-30s %.2f km/litro%n", "Rendimiento:", rendimiento);
        System.out.printf("%-30s $%.2f%n", "Costo total:", costoTotal);
        System.out.printf("%-30s $%.2f/km%n", "Costo por kilómetro:", costoPorKm);
        System.out.printf("%-30s %.2f%%%n", "Carga del tanque:", porcentajeTanque);
        System.out.println("--------------------------------------------------");

        teclado.close();

    }
}