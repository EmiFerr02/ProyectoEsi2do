
package LOGICA;

import java.util.ArrayList;
public class tareaYprioridad {
    //ATRIBUTOS
    private String Tarea;
    private int Prioridad;
    
    //ARRAYS
    public ArrayList<String> TareasArray = new ArrayList<>();
    public ArrayList<Integer> PrioArray = new ArrayList<>();
    
    //CONSTRUCTORES

    /*public tareaYprioridad(String Tarea, int Prioridad) {
        this.Tarea = Tarea;
        this.Prioridad = Prioridad;
    }*/
    //GETTERS AND SETTERS

    public String getTarea() {
        return Tarea;
    }

    public void setTarea(String Tarea) {
        this.Tarea = Tarea;
    }

    public int getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(int Prioridad) {
        this.Prioridad = Prioridad;
    }
    //METODOS
     public void agregarTarea(String Tarea, int Prioridad) {
        TareasArray.add(this.Tarea);
        PrioArray.add(this.Prioridad);
    }

    
}
