package Ejercicio10;

import java.util.Scanner;


class AlquilerLavadora {

    private int tipoLavadora;
    private int horas;
    private int cantidad;

    private static final int PRECIO_LAVADORA_GRANDE = 4000;
    private static final int PRECIO_LAVADORA_PEQUEÑA = 3000;
    private static final double DESCUENTO = 0.03;

    public int getTipoLavadora() {
        return tipoLavadora;
    }

    public void setTipoLavadora(int tipoLavadora) {
        this.tipoLavadora = tipoLavadora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularCosto() {
        int precioPorHora;
        if (tipoLavadora == 1) {
            precioPorHora = PRECIO_LAVADORA_GRANDE;
        } else if (tipoLavadora == 2) {
            precioPorHora = PRECIO_LAVADORA_PEQUEÑA;
        } else {
            throw new IllegalArgumentException("Tipo de lavadora no válido.");
        }

        double costo = precioPorHora * horas * cantidad;

        if (cantidad > 3) {
            costo -= costo * DESCUENTO;
        }

        return costo;
    }
}


class CalculadoraAlquiler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AlquilerLavadora alquiler = new AlquilerLavadora();


        System.out.print("Ingrese el tipo de lavadora (1 para grande, 2 para pequeña): ");
        alquiler.setTipoLavadora(scanner.nextInt());

        System.out.print("Ingrese el número de horas de alquiler: ");
        alquiler.setHoras(scanner.nextInt());

        System.out.print("Ingrese la cantidad de lavadoras: ");
        alquiler.setCantidad(scanner.nextInt());

        double costo = alquiler.calcularCosto();
        System.out.printf("El costo total del alquiler es: $%.2f%n", costo);

        scanner.close();
    }
}

