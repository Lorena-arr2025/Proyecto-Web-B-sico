package ar.edu.viajefacil.Model;

import java.time.LocalDate;


public class Pasajero {

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
    private LocalDate fechaNac;

    public Pasajero() {}

    public Pasajero(String nombre, String apellido, String email, String telefono, String direccion, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
    }
} 
 public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public LocalDate getFechaNac() { return fechaNac; }
    public void setFechaNac(LocalDate fechaNac) { this.fechaNac = fechaNac; }
}