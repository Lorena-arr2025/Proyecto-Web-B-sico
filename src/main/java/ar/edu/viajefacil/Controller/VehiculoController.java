package ar.edu.viajefacil.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class VehiculoController {

    @GetMapping("/Vehiculo")
    public String Vehiculo() {
        return "Vehiculo";
    }  
}
