package trunfopokemon;

import java.util.Random;

public class Player {
    private Random rdm = new Random();
    private int pontos = 0;
    private int vidas = 3;
    private int carta = 0;

public Player(){
    this.carta = rdm.nextInt(151) + 1;
}
public Player(int pontos){
    this.pontos = pontos;
}
public void setCarta(){
    this.carta = rdm.nextInt(151) + 1;
}
public int getCarta(){
    return this.carta;
}
public int getPontos(){
    return pontos;
}

public int getVidas(){
    return vidas;
}
public void maisPontos(){
    this.pontos = this.pontos + 1;
}
public void menosVida(){
    this.vidas = this.vidas - 1;
}

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

}
