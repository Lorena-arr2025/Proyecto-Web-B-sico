package ar.edu.viajefacil.Controller;

import ar.edu.viajefacil.Model.Pasajero;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pasajero")
public class PasajeroController {

    private List<Pasajero> pasajeros = new ArrayList<>();

    // Formulario de registro + solicitud de viaje
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("pasajero", new Pasajero());
        return "pasajero-form";
    }

    // Guardar pasajero con su solicitud de viaje
    @PostMapping("/guardar")
    public String guardarPasajero(@ModelAttribute Pasajero pasajero, Model model) {
        pasajeros.add(pasajero);
        model.addAttribute("pasajeros", pasajeros);
        model.addAttribute("mensaje", "✅ Solicitud registrada correctamente. ¡Gracias por elegir Viaje Fácil!");
        return "index";
    }

    // Mostrar lista de pasajeros (opcional)
    @GetMapping("/lista")
    public String mostrarPasajeros(Model model) {
        model.addAttribute("pasajeros", pasajeros);
        return "index";
    }
}
