package ar.edu.viajefacil.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class ViajeController {
   @Controller
public class AutoController {

    @GetMapping("/Viaje")
    public String Viaje() {
        return "Viaje";
    } 
}
