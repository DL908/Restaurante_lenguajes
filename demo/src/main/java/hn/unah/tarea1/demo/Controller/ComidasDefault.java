package hn.unah.tarea1.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import hn.unah.tarea1.demo.dtos.ComidasDto;

public class ComidasDefault {
    public static List<ComidasDto> crearComidasDefault(){
         List<ComidasDto> comidasList = new ArrayList<>();

         ComidasDto panConCebolla = new ComidasDto();
         ComidasDto baleada = new ComidasDto();
         ComidasDto confle = new ComidasDto();
         ComidasDto arosDeSal = new ComidasDto();

        panConCebolla.setNombre("pan con cebolla");
        baleada.setNombre("baleada");
        confle.setNombre("confle");
        arosDeSal.setNombre("aros de sal");

        panConCebolla.setPrecio("24");
        baleada.setPrecio("24");
        confle.setPrecio("24");
        arosDeSal.setPrecio("24");

       /* panConCebolla.setListaDeIngredientes("123");
        baleada.setListaDeIngredientes("123");
        confle.setListaDeIngredientes("123");
        arosDeSal.setListaDeIngredientes("123");
*/ 
        comidasList.add(panConCebolla);
        comidasList.add(arosDeSal);
        comidasList.add(confle);
        comidasList.add(baleada);

        return comidasList;
    }
}
