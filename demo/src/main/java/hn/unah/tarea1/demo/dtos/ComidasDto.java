package hn.unah.tarea1.demo.dtos;


import java.util.List;

//import hn.unah.tarea1.demo.Controller.IngredientesController;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComidasDto {
    //private IngredientesController iC = new IngredientesController();
    private String nombre;
    private String precio;
    private List<IngredientesDto> listaDeIngredientes;
    

    /*public void compararIngrediente(){
        List<IngredientesDto> listaDeComparacion =iC.obtenerListaIngredientes()
        for (IngredientesDto ingredientesDto : listaDeIngredientes) {
            
        }
    }*/

  
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Comida").append('\n');
        stringBuilder.append("nombre=").append(nombre).append('\n');
        stringBuilder.append("precio=").append(precio).append('\n');
        stringBuilder.append("listaDeIngredientes=").append(listaDeIngredientes).append('\n');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

}
