package ar.edu.viajefacil.Controller;

import ar.edu.viajefacil.Model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


 // Controlador para manejar las vistas del pasajero (registro y viajes).
 
@Controller
@RequestMapping("/pasajero")
public class PasajeroController {

    // Lista temporal de pasajeros (sin base de datos)
    private List<Pasajero> pasajeros = new ArrayList<>();

    // Página inicial: formulario de registro
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("pasajero", new Pasajero());
        return "pasajero-form";
    }

    // Guardar pasajero registrado
    @PostMapping("/guardar")
    public String guardarPasajero(@ModelAttribute Pasajero pasajero, Model model) {
        pasajeros.add(pasajero);
        model.addAttribute("pasajeros", pasajeros);
        return "index";
    }

    // Mostrar lista de pasajeros registrados
    @GetMapping("/lista")
    public String mostrarPasajeros(Model model) {
        model.addAttribute("pasajeros", pasajeros);
        return "index";
    }
}
