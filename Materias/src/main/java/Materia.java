/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Materia {
    public String nombre, carrera;
    public int creditos, codigo, cuatriCurso;
    
    public Materia(){
        
    }
    public Materia(String nombre, String carrera, int creditos, int codigo, int cuatriCurso){
        this.carrera = carrera;
        this.codigo = codigo;
        this.creditos = creditos;
        this.cuatriCurso = cuatriCurso;
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "La materia se llama: "+nombre + "\n pertenece a la carrera de: "+carrera+"\ncreditos: "+creditos+ "\ncodigo "+codigo
                + "\nse cursa en el cuatrimestre: "+cuatriCurso;
    }
}
