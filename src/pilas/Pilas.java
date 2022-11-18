/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import javax.swing.JOptionPane;

/**
 *
 * @author lopez
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, elementos;
        boolean salir = false; 
        PilaFun<String> pila = new PilaFun<>();
        
        elementos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos elementos quieres que tenga la pila?"));
        
        for(int i=0; i<elementos; i++)
        {
                  String y;
                  y = JOptionPane.showInputDialog("Dame un nombre(Puro String)");
                  pila.push(y);        
        }

        
       do{
        System.out.println("""
                            0- Salir  
                            1- \u00bfLa pila est\u00e1 vacia? 
                            2-Quitar el ultimo elemento(Pop) 
                            3- Mostrar el ultimo elemento de la Pila
                            4- Mostrar la Pila""");
        x = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?"));

          switch(x){
              case 1 -> System.out.println("¿La pila esta vacia? " + pila.isEmpty());
              case 2 -> System.out.println("pop(): " + pila.pop());
              case 3 -> System.out.println("peek(): " + pila.peek());
              case 4 -> System.out.println("toString: " + pila.toString());  
              default -> System.out.println("Inserte un numero aseptable"); }

        }while(x == 0);
      

    }
    
}
