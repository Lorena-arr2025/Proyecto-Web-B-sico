package ar.edu.viajefacil.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conductor {

    // Atributos 
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String licencia;
    private LocalDate fechaAlta;   // fecha en que se registró o su contratacion
    private double ingresoTotal;   // dinero acumulado por viajes
    private List<Viaje> viajes;    // lista de viajes realizados

    // Constructor vacío (necesario para crear objetos sin datos iniciales)
    public Conductor() {
        viajes = new ArrayList<>();
        ingresoTotal = 0;
    }

    //Constructor con parámetros (para crear un conductor con datos)
    public Conductor(String nombre, String apellido, String telefono,
                     String email, String licencia, LocalDate fechaAlta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.licencia = licencia;
        this.fechaAlta = fechaAlta;
        this.viajes = new ArrayList<>();
        this.ingresoTotal = 0;
    }

    // Método para agregar un viaje y acumular ingreso
    public void agregarViaje(Viaje v) {
        viajes.add(v); // añade el viaje a la lista
        ingresoTotal += v.calcularIngresoConductor(); // suma el dinero ganado
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getLicencia() { return licencia; }
    public void setLicencia(String licencia) { this.licencia = licencia; }

    public LocalDate getFechaAlta() { return fechaAlta; }
    public void setFechaAlta(LocalDate fechaAlta) { this.fechaAlta = fechaAlta; }

    public double getIngresoTotal() { return ingresoTotal; }
    public void setIngresoTotal(double ingresoTotal) { this.ingresoTotal = ingresoTotal; }

    public List<Viaje> getViajes() { return viajes; }
    public void setViajes(List<Viaje> viajes) { this.viajes = viajes; }
}