package Ejercicio8;


class Empleado {

    private String nombre;
    private int horasTrabajadas;
    private int salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
        calcularSalario();
    }

    public int getSalario() {
        return salario;
    }

    private void calcularSalario() {
        if (horasTrabajadas <= 10) {
            salario = horasTrabajadas * 30000;
        } else {
            salario = (10 * 30000) + ((horasTrabajadas - 10) * 33000);
        }
    }
}


class CalculadoraSalario {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("Arle");
        empleado.setHorasTrabajadas(15);

        // Mostrar el mensaje
        System.out.println("Señor " + empleado.getNombre() + " el número de horas es " + empleado.getHorasTrabajadas() + " y su salario equivale a " + empleado.getSalario());
    }
}

