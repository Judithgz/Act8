package act8.java; 

import java.util.ArrayList;
import java.util.Scanner;

public class Act8Java {


    public static void main(String[] args) throws Exception {
        
        Scanner line = new Scanner(System.in);
        
        int op;
        boolean jugar = true;
        
        Deck deck = new Deck();
        System.out.println("Deck de Cartas para Iniciar: " + deck.getSize());
        
        while(jugar){
        
            System.out.println("Elige una opcion: ");
            System.out.println("1. Shuffle");
            System.out.println("2. Head");
            System.out.println("3. Pick");
            System.out.println("4. Hand");
            System.out.println("5. Salir");
            
            op = line.nextInt();
        //Iniciamos el juego
        switch(op) 
        {
            case 1:
                  deck.shuflle();
                  break;
            case 2:
                  deck.head();
                  break;
            case 3:
                  deck.pick();
                  break;
            case 4:
                if(deck.getSize() < 5){
                System.out.println("Ya no hay cartas suficientes.");  
                } else {
                        deck.hand();
                }
                  break;
            case 5: 
                jugar = false;
                System.out.println("Juego terminado");
                break;
            default:
                System.out.println("Opcion no valida");                 
        }
        
        }
        
   }
}
