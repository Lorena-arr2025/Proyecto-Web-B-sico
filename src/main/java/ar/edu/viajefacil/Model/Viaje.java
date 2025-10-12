package ar.edu.viajefacil.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Viaje {
    private Pasajero pasajero;
    private Conductor conductor;
    private Vehiculo vehiculo;

    // Datos propios del viaje
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime hora;
    private double precio;     // Precio total del viaje
    private double comision;   // Porcentaje que cobra la app (ej: 20%)
    private String estado;     // "Pendiente", "En curso" o "Finalizado"

    // Constructor vacío (para crear viajes sin inicializar)
    public Viaje() {}

    // Constructor con parámetros (para inicializar todos los datos)
    public Viaje(Pasajero pasajero, Conductor conductor, Vehiculo vehiculo,
                 String origen, String destino, LocalDate fecha, LocalTime hora,
                 double precio, double comision, String estado) {
        this.pasajero = pasajero;
        this.conductor = conductor;
        this.vehiculo = vehiculo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.comision = comision;
        this.estado = estado;
    }

    // Método para calcular cuánto gana el conductor
    //    El conductor recibe (100% - comisión) del precio total
    public double calcularIngresoConductor() {
        double porcentajeConductor = 1 - (comision / 100);
        return precio * porcentajeConductor;
    }

    // Método para calcular cuánto gana la empresa (comisión)
    public double calcularIngresoEmpresa() {
        return precio * (comision / 100);
    }

    // Getters y Setters
    public Pasajero getPasajero() { return pasajero; }
    public void setPasajero(Pasajero pasajero) { this.pasajero = pasajero; }

    public Conductor getConductor() { return conductor; }
    public void setConductor(Conductor conductor) { this.conductor = conductor; }

    public Vehiculo getVehiculo() { return vehiculo; }
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public LocalTime getHora() { return hora; }
    public void setHora(LocalTime hora) { this.hora = hora; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public double getComision() { return comision; }
    public void setComision(double comision) { this.comision = comision; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }


}
