import java.util.Scanner;

public class Flota {

    public static double calcularConsumo(double km, double litros) {
        return (litros / km) * 100;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int cantidadCamiones = 6;

        String[] patentes = new String[cantidadCamiones];
        double[] kilometros = new double[cantidadCamiones];
        double[] litros = new double[cantidadCamiones];

        double totalKm = 0;
        double totalLitros = 0;
        double maxKm = 0;
        double minKm = 100000000;
        String patenteMax = "";
        String patenteMin = "";

        int eficientes = 0;
        int normales = 0;
        int excesivos = 0;

        for (int i = 0; i < cantidadCamiones; i++) {
            System.out.println("Camión " + (i + 1) + ":");
            System.out.print("Ingrese la Patente: ");
            patentes[i] = teclado.next();
            System.out.print("Ingrese los Kilómetros recorridos: ");
            kilometros[i] = teclado.nextDouble();
            System.out.print("Ingrese los Litros consumidos: ");
            litros[i] = teclado.nextDouble();
        }

        for (int i = 0; i < cantidadCamiones; i++){

            totalKm += kilometros[i];
            totalLitros += litros[i];

            if (kilometros[i] > maxKm) {
                maxKm = kilometros[i];
                patenteMax = patentes[i];
            }

            if (kilometros[i] < minKm) {
                minKm = kilometros[i];
                patenteMin = patentes[i];
            }
        }
        double promedioKm = totalKm / cantidadCamiones;
        double consumoPromedioFlota = calcularConsumo(totalKm, totalLitros);

        System.out.println("\n--- INFORME FINAL DE LA FLOTA ---");
        System.out.printf("Total de kilómetros recorridos....: %.2f km\n", totalKm);
        System.out.printf("Total de litros consumidos........: %.2f L\n", totalLitros);
        System.out.printf("Promedio de kilómetros por camión.: %.2f km\n", promedioKm);
        System.out.println("Camión con más kilómetros.........: " + patenteMax + " (" + maxKm + " km)");
        System.out.println("Camión con menos kilómetros.......: " + patenteMin + " (" + minKm + " km)");
        System.out.printf("Consumo promedio de la flota......: %.2f L/100km\n", consumoPromedioFlota);

        for (int i = 0; i < cantidadCamiones; i++){
            double consumoCamion = calcularConsumo(kilometros[i], litros[i]);

            String clasificacion = "";
            if (consumoCamion < 8) {
                clasificacion = "EFICIENTE";
                eficientes++;
            } else if (consumoCamion >= 8 && consumoCamion <= 12) {
                clasificacion = "NORMAL";
                normales++;
            } else {
                clasificacion = "EXCESIVO";
                excesivos++;
            }

            System.out.printf("\nPatente: %s | Consumo: %.2f L/100km | Clasificación: %s\n", patentes[i], consumoCamion, clasificacion);
        }

        System.out.println("\n--- RESUMEN DE CATEGORÍAS ---");
        System.out.println("Camiones EFICIENTES: " + eficientes);
        System.out.println("Camiones NORMALES: " + normales);
        System.out.println("Camiones EXCESIVOS: " + excesivos);

        teclado.close();
    }
}