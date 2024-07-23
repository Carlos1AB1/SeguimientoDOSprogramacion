package Ejercicio3;

import javax.swing.*;

public class PrestamoLibro {
    public int codPrestamo;
    public String fechaPrestamo;
    public String nombreLibro;
    public int codigoUsuario;
    public int diasDePrestamo;
    public boolean estadoPrestamo;

    public int getCodPrestamo() {
        return codPrestamo;
    }

    public void setCodPrestamo(int codPrestamo) {
        this.codPrestamo = codPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public int getDiasDePrestamo() {
        return diasDePrestamo;
    }

    public void setDiasDePrestamo(int diasDePrestamo) {
        this.diasDePrestamo = diasDePrestamo;
    }

    public boolean isEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(boolean estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }

    //método
    public void prestarLibro() {
        codPrestamo = 101;
        fechaPrestamo = "22 de julio del 2024";
        nombreLibro = JOptionPane.showInputDialog("Ingrese el nombre del libro");
        try {
            codigoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Cual es tu codigo de usuario?"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "código de inválido, debe ser un número.");
            return;
        }
        diasDePrestamo = 3;
        estadoPrestamo = true;
    }

    //método
    public String consultarEstadoPrestamo() {
        return "Datos Prestamo:\n" +
                "Codigo de prestamo: " + codPrestamo + "\n" +
                "Fecha del prestamo: " + fechaPrestamo + "\n" +
                "Nombre del libro: " + nombreLibro + "\n" +
                "Dias prestado: " + diasDePrestamo + "\n" +
                "Estado del prestamo: " + (estadoPrestamo ? "Activo" : "Inactivo");
    }

    public static void main(String[] args) {
        PrestamoLibro libro = new PrestamoLibro();
        libro.prestarLibro();
        System.out.println(libro.consultarEstadoPrestamo());
    }
}
