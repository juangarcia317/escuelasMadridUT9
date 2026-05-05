package tema9.escuelasMadrid.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import tema9.escuelasMadrid.repository.EscuelaRepository;
import tema9.escuelasMadrid.model.Escuela;
import java.util.List;


@Controller // Importante: Usa @Controller, no @RestController para páginas web
@RequestMapping("/web/escuelas")
public class EscuelaWebController {

    @Autowired
    private EscuelaRepository repository;

    @GetMapping
    public String listarEscuelas(Model model) {
        // Pasamos la lista de escuelas a la vista con el nombre "listaEscuelas"
        model.addAttribute("listaEscuelas", repository.findAll());
        System.out.println("Número de escuelas encontradas: " + repository.count());
        return "listado"; // Esto buscará el archivo listado.html
    }
}
