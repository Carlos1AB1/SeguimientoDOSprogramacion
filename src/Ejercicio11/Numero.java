package Ejercicio11;

import java.util.Scanner;

class Numero {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String determinarParidad() {
        if (valor % 2 == 0) {
            return "El número es par.";
        } else {
            return "El número es impar.";
        }
    }
}


class DeterminarParidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Numero numero = new Numero();

        System.out.print("Ingrese un número: ");
        numero.setValor(scanner.nextInt());

        System.out.println(numero.determinarParidad());

        scanner.close();
    }
}

