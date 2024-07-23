package Ejercicio2;

import javax.swing.*;

public class CitaMedica {
    private int codCita;
    private String fecha;
    private String hora;
    private int consultorio;
    private String nombreMedico;
    private String nombrePaciente;
    private String centroMedico;

    public int getCodCita() {
        return codCita;
    }

    public void setCodCita(int codCita) {
        this.codCita = codCita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getCentroMedico() {
        return centroMedico;
    }

    public void setCentroMedico(String centroMedico) {
        this.centroMedico = centroMedico;
    }

    // Métodos
    public void crearCita() {
        nombrePaciente = JOptionPane.showInputDialog("Ingrese su nombre");
        fecha = JOptionPane.showInputDialog("Ingrese la fecha de la cita (dd-mm-aaaa)");
        hora = JOptionPane.showInputDialog("Ingrese la hora de la cita (hh:mm)");
        consultorio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del consultorio"));
        nombreMedico = JOptionPane.showInputDialog("Ingrese el nombre del médico");
        centroMedico = JOptionPane.showInputDialog("Ingrese el nombre del centro médico");
    }

    public String consultarDatosCita() {
        return "Cita médica:\n" +
                "Paciente: " + nombrePaciente + "\n" +
                "Fecha: " + fecha + "\n" +
                "Hora: " + hora + "\n" +
                "Consultorio: " + consultorio + "\n" +
                "Médico: " + nombreMedico + "\n" +
                "Centro Médico: " + centroMedico;
    }

    public void cambiarHora() {
        hora = JOptionPane.showInputDialog("¿A qué hora desea la cita?");
    }

    public static void main(String[] args) {
        CitaMedica cita = new CitaMedica();
        cita.crearCita();
        System.out.println(cita.consultarDatosCita());
        cita.cambiarHora();
        System.out.println("Nueva hora de la cita: " + cita.getHora());
    }
}
