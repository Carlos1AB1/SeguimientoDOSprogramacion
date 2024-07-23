package Ejercicio18;

import java.util.Scanner;

class Computadora {
    private boolean emitePitido;
    private boolean discoGira;

    public boolean isEmitePitido() {
        return emitePitido;
    }

    public void setEmitePitido(boolean emitePitido) {
        this.emitePitido = emitePitido;
    }

    public boolean isDiscoGira() {
        return discoGira;
    }

    public void setDiscoGira(boolean discoGira) {
        this.discoGira = discoGira;
    }

    public String verificarEstado() {
        if (emitePitido) {
            if (discoGira) {
                return "Póngase en contacto con el técnico de apoyo.";
            } else {
                return "Verificar contactos de la unidad.";
            }
        } else {
            if (discoGira) {
                return "Compruebe las conexiones de altavoces.";
            } else {
                return "Traiga la computadora para repararla en la central.";
            }
        }
    }
}


class ResolverProblemaComputadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Computadora computadora = new Computadora();

        System.out.print("¿La computadora emite un pitido al iniciarse? (sí/no): ");
        String respuestaPitido = scanner.nextLine().trim().toLowerCase();
        computadora.setEmitePitido(respuestaPitido.equals("sí"));

        System.out.print("¿El disco duro gira? (sí/no): ");
        String respuestaDisco = scanner.nextLine().trim().toLowerCase();
        computadora.setDiscoGira(respuestaDisco.equals("sí"));

        String estado = computadora.verificarEstado();
        System.out.println(estado);

        scanner.close();
    }
}

