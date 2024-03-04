package hn.unah.tarea1.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.tarea1.demo.dtos.IngredientesDto;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/ingredientes")

public class IngredientesController {

    List<IngredientesDto> listaIngredientesDtos = IngredientesDefault.crearIngredientesDefault();

    @GetMapping("/ingredientes/crearIngredientes")
    public String crearIngredientes(@RequestBody IngredientesDto ingDto) {
        listaIngredientesDtos.add(ingDto);
        return ingDto.toString();
    }

    @GetMapping("/ingredientes/obtenerIngredientes")
    public String obtenerIngredientes() {
        return listaIngredientesDtos.toString();
    }

    public List<IngredientesDto> obtenerListaIngredientes() {
        return listaIngredientesDtos;
    }   

}
