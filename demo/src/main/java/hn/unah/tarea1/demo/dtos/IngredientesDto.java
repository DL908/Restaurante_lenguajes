package hn.unah.tarea1.demo.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class IngredientesDto {
    private String nombre;
    private String codigo;
    private String descripcion;

    @Override
    public String toString(){
        return  "nombre:"+ this.nombre + "\n"+
                "codigo: "+ this.codigo + "\n"+
                "descripcion: " +this.descripcion+"\n";
    }



}
