package Ejercicio12;

import java.util.Scanner;


class Calificaciones {
    private double fisica;
    private double quimica;
    private double biologia;
    private double matematicas;
    private double informatica;


    public double getFisica() {
        return fisica;
    }

    public void setFisica(double fisica) {
        this.fisica = fisica;
    }

    public double getQuimica() {
        return quimica;
    }

    public void setQuimica(double quimica) {
        this.quimica = quimica;
    }

    public double getBiologia() {
        return biologia;
    }

    public void setBiologia(double biologia) {
        this.biologia = biologia;
    }

    public double getMatematicas() {
        return matematicas;
    }

    public void setMatematicas(double matematicas) {
        this.matematicas = matematicas;
    }

    public double getInformatica() {
        return informatica;
    }

    public void setInformatica(double informatica) {
        this.informatica = informatica;
    }

    public double calcularPromedio() {
        return (fisica + quimica + biologia + matematicas + informatica) / 5.0;
    }

    public String determinarCalificacion() {
        double promedio = calcularPromedio();
        if (promedio >= 0 && promedio <= 5.9) {
            return "La calificación es mala.";
        } else if (promedio >= 6 && promedio <= 8) {
            return "La calificación es buena.";
        } else if (promedio > 8) {
            return "La calificación es excelente.";
        } else {
            return "Calificación fuera de rango.";
        }
    }
}

class EvaluarCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calificaciones calificaciones = new Calificaciones();

        System.out.print("Ingrese la calificación de Física: ");
        calificaciones.setFisica(scanner.nextDouble());

        System.out.print("Ingrese la calificación de Química: ");
        calificaciones.setQuimica(scanner.nextDouble());

        System.out.print("Ingrese la calificación de Biología: ");
        calificaciones.setBiologia(scanner.nextDouble());

        System.out.print("Ingrese la calificación de Matemáticas: ");
        calificaciones.setMatematicas(scanner.nextDouble());

        System.out.print("Ingrese la calificación de Informática: ");
        calificaciones.setInformatica(scanner.nextDouble());

        double promedio = calificaciones.calcularPromedio();
        String calificacionGeneral = calificaciones.determinarCalificacion();

        System.out.printf("El promedio de las calificaciones es: %.2f%n", promedio);
        System.out.println(calificacionGeneral);

        scanner.close();
    }
}

