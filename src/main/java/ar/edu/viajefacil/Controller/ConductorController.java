package ar.edu.viajefacil.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConductorController {
   
    @GetMapping("/Conductor")
    public String Conductor() {
        return "Conductor";
    } 
}
