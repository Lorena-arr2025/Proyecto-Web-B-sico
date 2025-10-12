package ar.edu.viajefacil.Model;

public class Vehiculo {

    // Atributos (características del vehículo)
    private String marca;
    private String modelo;
    private String patente;
    private String color;
    private int año;           // año del vehículo
    private Conductor conductor; // relación: un vehículo pertenece a un conductor

    // Constructor vacío (permite crear un objeto sin inicializar)
    public Vehiculo() {}

    // Constructor con parámetros (permite crear el objeto con todos los datos)
    public Vehiculo(String marca, String modelo, String patente, String color, int año, Conductor conductor) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.color = color;
        this.año = año;
        this.conductor = conductor;
    }

    // Getters y Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getPatente() { return patente; }
    public void setPatente(String patente) { this.patente = patente; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }

    public Conductor getConductor() { return conductor; }
    public void setConductor(Conductor conductor) { this.conductor = conductor; }


}
