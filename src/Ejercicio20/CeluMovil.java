package Ejercicio20;

import java.util.Scanner;

class CeluMovil {
    public static int calcularCostoTotal(String operador, int minutosInternacionales, int valorPaqueteDatos) {
        int cargoFijo;
        int valorMinutoInternacional;
        int valorPaqueteDatosServicio;

        switch (operador.toLowerCase()) {
            case "tigo":
                cargoFijo = 45000;
                valorMinutoInternacional = 200;
                valorPaqueteDatosServicio = 12000;
                break;
            case "claro":
                cargoFijo = 30000;
                valorMinutoInternacional = 100;
                valorPaqueteDatosServicio = 18000;
                break;
            case "movistar":
                cargoFijo = 40000;
                valorMinutoInternacional = 250;
                valorPaqueteDatosServicio = 8000;
                break;
            default:
                throw new IllegalArgumentException("Operador no reconocido.");
        }

        return cargoFijo + (minutosInternacionales * valorMinutoInternacional) + valorPaqueteDatosServicio;
    }
}

class CeluMovilPromocion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el operador (Claro, Tigo, Movistar): ");
        String operador = scanner.nextLine();

        System.out.print("Ingrese el número de minutos internacionales: ");
        int minutosInternacionales = scanner.nextInt();


        System.out.print("Ingrese el valor del paquete de datos: ");
        int valorPaqueteDatos = scanner.nextInt();


        try {
            int costoTotal = CeluMovil.calcularCostoTotal(operador, minutosInternacionales, valorPaqueteDatos);
            System.out.printf("El costo total para el operador %s es: $%d%n", operador, costoTotal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

