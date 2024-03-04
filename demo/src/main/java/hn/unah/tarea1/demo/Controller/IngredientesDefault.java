package hn.unah.tarea1.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import hn.unah.tarea1.demo.dtos.IngredientesDto;

public class IngredientesDefault {
 public static List<IngredientesDto> crearIngredientesDefault(){

    List<IngredientesDto> listaIngredientesDtos = new ArrayList<>();

    IngredientesDto ing1 = new IngredientesDto();
    IngredientesDto ing2 = new IngredientesDto();
    IngredientesDto ing3 = new IngredientesDto();
    IngredientesDto ing4 = new IngredientesDto();

    ing1.setNombre("pescao");
    ing2.setNombre("pajaro");
    ing3.setNombre("leche");
    ing4.setNombre("carne");

    ing1.setCodigo("123");
    ing2.setCodigo("223");
    ing3.setCodigo("323");
    ing4.setCodigo("423");

    ing1.setDescripcion("1blabla");
    ing2.setDescripcion("2blabla");
    ing3.setDescripcion("3blabla");
    ing4.setDescripcion("4blabla");

        listaIngredientesDtos.add(ing1);
        listaIngredientesDtos.add(ing2);
        listaIngredientesDtos.add(ing3);
        listaIngredientesDtos.add(ing4);

    return listaIngredientesDtos;

 }
}
