package hn.unah.tarea1.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.tarea1.demo.dtos.ComidasDto;




@RestController
@RequestMapping("/comidas")

public class ComidasController {
   
    List<ComidasDto> comidasList = ComidasDefault.crearComidasDefault();

    @RequestMapping("/comidas/crearComidas")
    public String crearComidas(@RequestBody ComidasDto comidasDto) {
        comidasList.add(comidasDto);
        return comidasDto.toString();
    }
    
    @RequestMapping("/comidas/comidasObtener")
    public String obtenerComidas() {
        return comidasList.toString();
    }
    

}
