/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGICA;

import java.util.ArrayList;


public class tareasRealizadas {
//ATRIBUTOS
   private String tareaRealizada;
   private int prioridadRealizada;
   
//ARRAY   
   public ArrayList tRealizadaArray = new ArrayList<>();
   public ArrayList<Integer> pRealizadaArray = new ArrayList<>();
//GETTERS AND SETTERS
    public String getTareaRealizada() {
        return tareaRealizada;
    }

    public void setTareaRealizada(String tareaRealizada) {
        this.tareaRealizada = tareaRealizada;
    }

    public int getPrioridadRealizada() {
        return prioridadRealizada;
    }

    public void setPrioridadRealizada(int prioridadRealizada) {
        this.prioridadRealizada = prioridadRealizada;
    }
//METODOS    
    public void agregarTarea(String Tarea, int Prioridad) {
        tRealizadaArray.add(this.tareaRealizada);
        pRealizadaArray.add(this.prioridadRealizada);
    }
          
}
