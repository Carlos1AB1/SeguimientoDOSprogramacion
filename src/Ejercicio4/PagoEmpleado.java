package Ejercicio4;

public class PagoEmpleado {
    private int codEmpleado;
    private double salarioBasico;
    private double horasExtras;
    private int numeroHoras;
    private double descuento;
    private double descuentoPrestamo;
    private double bonificacion;
    private double neto;

    // Getters y Setters
    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuentoPrestamo() {
        return descuentoPrestamo;
    }

    public void setDescuentoPrestamo(double descuentoPrestamo) {
        this.descuentoPrestamo = descuentoPrestamo;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    // Métodos
    public double calcularValorHE() {
        // Calcula el valor de las horas extras
        return horasExtras * numeroHoras;
    }

    public double calcularDevengado() {
        // Calcula el salario devengado
        return salarioBasico + calcularValorHE() + bonificacion;
    }

    public double calcularDeducido() {
        // Calcula el total deducido (descuento + descuentoPrestamo)
        return descuento + descuentoPrestamo;
    }

    public double calcularNeto() {
        // Calcula el salario neto
        neto = calcularDevengado() - calcularDeducido();
        return neto;
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la clase
        PagoEmpleado empleado = new PagoEmpleado();

        empleado.setCodEmpleado(1);
        empleado.setSalarioBasico(1000);
        empleado.setHorasExtras(10);
        empleado.setNumeroHoras(5);
        empleado.setDescuento(50);
        empleado.setDescuentoPrestamo(30);
        empleado.setBonificacion(100);

        double neto = empleado.calcularNeto();

        System.out.println("Codigo de Empleado: " + empleado.getCodEmpleado());
        System.out.println("Salario Básico: " + empleado.getSalarioBasico());
        System.out.println("Horas Extras: " + empleado.getHorasExtras());
        System.out.println("Número de Horas: " + empleado.getNumeroHoras());
        System.out.println("Descuento: " + empleado.getDescuento());
        System.out.println("Descuento Prestamo: " + empleado.getDescuentoPrestamo());
        System.out.println("Bonificación: " + empleado.getBonificacion());
        System.out.println("Salario Neto: " + neto);
    }
}
