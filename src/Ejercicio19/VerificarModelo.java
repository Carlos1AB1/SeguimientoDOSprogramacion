package Ejercicio19;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class VerificadorModelo {
    private static final Set<Integer> MODELOS_DEFECTUOSOS = new HashSet<>();

    static {
        MODELOS_DEFECTUOSOS.add(119);
        MODELOS_DEFECTUOSOS.add(179);
        for (int i = 189; i <= 195; i++) {
            MODELOS_DEFECTUOSOS.add(i);
        }
        MODELOS_DEFECTUOSOS.add(221);
        MODELOS_DEFECTUOSOS.add(780);
    }

    public String verificarModelo(int numeroModelo) {
        if (MODELOS_DEFECTUOSOS.contains(numeroModelo)) {
            return "El automóvil está defectuoso, llevar a garantía.";
        } else {
            return "Su automóvil no está defectuoso.";
        }
    }
}

class VerificarModeloAutomovil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VerificadorModelo verificador = new VerificadorModelo();

        System.out.print("Ingrese el número de modelo de su automóvil: ");
        int numeroModelo = scanner.nextInt();

        String resultado = verificador.verificarModelo(numeroModelo);
        System.out.println(resultado);

        scanner.close();
    }
}
