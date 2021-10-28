package act8.java;

/**
 *
 * @author judi_
 */
public class Card {
    
    
    private String Palo;
    private String Color;
    private String Valor;
    
    public Card(String Palo, String Color, String Valor){
        
        this.Palo = Palo;
        this.Color = Color; 
        this.Valor = Valor;
    }
    
    
    public String getPalo(){

        return Palo;
    }
    
    public String getColor(){
        
        return Color;
    }
    
    public String getValor(){
        
        return Valor;
    }
    
    
    
    
    public void setPalo(String Palo){
        
        this.Palo = Palo;
    }
    
    public void setColor(String Color){
        
        this.Color = Color;
    }
    
    public void setValor(String Valor){
        
        this.Valor = Valor;
    }
    

    public String toString(){
        
        return (Palo + ", " + Color + ", " + Valor);
    }
    
}
