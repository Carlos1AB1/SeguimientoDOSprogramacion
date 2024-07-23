package Ejercicio7;

public class Reclamo {
    private String numeroReclamo;
    private String nombrePersona;
    private String asunto;
    private String descripcionReclamo;
    private String estadoReclamo;

    public String getNumeroReclamo() {
        return numeroReclamo;
    }

    public void setNumeroReclamo(String numeroReclamo) {
        this.numeroReclamo = numeroReclamo;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcionReclamo() {
        return descripcionReclamo;
    }

    public void setDescripcionReclamo(String descripcionReclamo) {
        this.descripcionReclamo = descripcionReclamo;
    }

    public String getEstadoReclamo() {
        return estadoReclamo;
    }

    public void setEstadoReclamo(String estadoReclamo) {
        this.estadoReclamo = estadoReclamo;
    }

    public boolean validarEstadoReclamo() {
        // Implementar lógica de validación aquí
        return "Pendiente".equals(estadoReclamo) || "Resuelto".equals(estadoReclamo); // Ejemplo de validación
    }

    public String mensajeRecepcionReclamo() {
        return "Reclamo recibido: " + numeroReclamo + " - " + asunto;
    }
}

class Main {
    public static void main(String[] args) {
        Reclamo reclamo = new Reclamo();
        reclamo.setNumeroReclamo("R12345");
        reclamo.setNombrePersona("Juan Pérez");
        reclamo.setAsunto("Producto defectuoso");
        reclamo.setDescripcionReclamo("El producto recibido está defectuoso y no funciona correctamente.");
        reclamo.setEstadoReclamo("Pendiente");

        System.out.println(reclamo.mensajeRecepcionReclamo());
        System.out.println("Estado del reclamo válido: " + reclamo.validarEstadoReclamo());
    }
}

