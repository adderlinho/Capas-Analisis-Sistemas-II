package gt.edu.umg.sinay.controlador;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import gt.edu.umg.sinay.modelo.Saludo;

@RestController
public class SaludosControlador {
    @GetMapping("/saludoJSON")
    public Map<String, String> saludoJSON(@RequestParam(value = "nombre", defaultValue = "Mundo") String nombre) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Saludos", nombre);
        return map;
    }

    @RequestMapping(value = "/saludoXML", method = RequestMethod.GET)
    public Saludo saludoXML(@RequestParam(value = "nombre", defaultValue = "Mundo") String nombre) {
        Saludo saludo = new Saludo();
        saludo.setTitulo(nombre);
        saludo.setClase("Analisis de Sistemas II");
        return saludo;
    }

    @GetMapping(value = "/saludoHTML", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String saludoHTML(@RequestParam(value = "nombre", defaultValue = "Mundo") String nombre) {
        return "<html>\n" + "<header><title>Saludos</title></header>\n" +
                "<body>\n" + "Saludos " + nombre + "\n" + "</body>\n" + "</html>";
    }
}
