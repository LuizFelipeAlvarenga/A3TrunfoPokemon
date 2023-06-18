package trunfopokemon;

public class Carta {
  private int numero = 0;
  private String name = " ";
  private double weight = 0;
  private int height = 0;
  private double attack = 0;
  

public Carta(){
    
}
public Carta(int numero, String pokemon, double peso, int tamanho, double ataque){
    this.numero = numero;
    this.name = pokemon;
    this.weight = peso;
    this.height = tamanho;
    this.attack = ataque;
  }

    public int getNumero() {
        return numero;
    }

    public String getName() {
        return name;
    }
    public void getDescricao(){
        InterfaceJogo.TxtPeso.setVisible(true);
        InterfaceJogo.TxtPeso.setText("Peso: "+ this.weight +" Kg");
        
        InterfaceJogo.TxtTamanho.setVisible(true);
        InterfaceJogo.TxtTamanho.setText("Tamanho: " + this.height + " centimetros");
        
        InterfaceJogo.TxtAttak.setVisible(true);
        InterfaceJogo.TxtAttak.setText("Ataque: " + this.attack);
    }
    public double getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public double getAttack() {
        return attack;
    }

}
