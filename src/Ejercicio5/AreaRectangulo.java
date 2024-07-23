package Ejercicio5;

public class AreaRectangulo {
    public double base;
    public double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean validarDatosIngresados() {
        return base > 0 && altura > 0;
    }


    public double calcularArea() {
        return base * altura;
    }
}

class Main {
    public static void main(String[] args) {
        AreaRectangulo rectangulo = new AreaRectangulo();

        rectangulo.setBase(5);
        rectangulo.setAltura(20);

        if (rectangulo.validarDatosIngresados()) {
            System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
        } else {
            System.out.println("Datos ingresados no válidos.");
        }
    }
}
