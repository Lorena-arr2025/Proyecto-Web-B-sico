package ar.edu.viajefacil.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PasajeroController {
    
    @GetMapping("/Pasajero")
    public String Pasajero() {
        return "Pasajero";
    }
}
