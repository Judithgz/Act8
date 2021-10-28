package act8.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author judi_
 */
public class Deck {
 
    
    private final String[] Palo = {"Corazón", "Diamante", "Treból", "Pica"};
    private final String[] Color = {"Rojo", "Negro"};
    private final String[] Valor = {"A", "2", "3", "4", "5", "6", "7", "8","9", "10", "J", "Q", "K"};
        
        
    private ArrayList<Card> mazo;
        
    public Deck(){
            
        mazo = new ArrayList<Card>();
            
       
        for(int i = 0; i < 2; i++){
            
            for(int j = 0; j < Valor.length; j++){
                
                mazo.add(new Card(Palo[i], Color[0],Valor[j]));  
            } 
        }
        
        for(int i = 2; i < 4; i++){
            
            for(int j = 0; j < Valor.length; j++){
                
                mazo.add(new Card(Palo[i], Color[1], Valor[j]));  
            } 
        }   
    }
    
    //Obtenemos el tamaño del deck
    public int getSize(){
   
        return mazo.size();
    }
    
   
   //Nos muestra el Deck 
    public ArrayList<Card> getDeck(){
        
        return mazo;
    }
    
    public void shuflle() {
            Collections.shuffle(mazo);
            System.out.println("Mezclamos el deck.");
            for (Object objeto : mazo)
            {
                System.out.print(mazo + " /n ");
            }
        }

        public void head(){
            System.out.println(mazo.get(0));
            mazo.remove(0);
            System.out.println("Quedan " + mazo.size() + " cartas");
        }


        public void pick() {
            Random random = new Random();
            System.out.println(mazo.get(random.nextInt(mazo.size())));
            mazo.remove(random.nextInt(mazo.size()));
            System.out.println("Quedan " + mazo.size() + " cartas");
        }

        public void hand() {
            for(int i=0; i<=4; i++){
                System.out.println(mazo.get(i));
            }
            for(int i=0; i<=4; i++){
                mazo.remove(i);
            }
            System.out.println("Quedan " + mazo.size()+ " cartas");
        }

    
}
