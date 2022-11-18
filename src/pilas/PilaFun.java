/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.ArrayList;

/**
 *
 * @author lopez
 * @param <T>
 */
public class PilaFun <T> {
    ArrayList <T> datos = new ArrayList<>();
    private int top;
    
    public PilaFun() {}
    
    public void push(T dato){
        datos.add(dato);
        top++;
    }
    
    public int lenght(){
        return this.top;
    }
    
    public boolean isEmpty(){
        return this.datos==null;
    }
    
    public T pop(){
        T dato = datos.remove(top-1);
        top = top-1;
        return dato;
    }
    
    public T peek(){
        T dato = datos.get(top-1);
        return dato; 
    }
    
   @Override
    public String toString(){
        String actual = "";
        
        for (T dato : datos) {
            actual += dato + " ->" + " " ;             
        }
        return actual;
    }    
    
    
}
