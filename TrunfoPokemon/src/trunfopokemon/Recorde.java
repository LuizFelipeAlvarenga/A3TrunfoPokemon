package trunfopokemon;

public class Recorde{
    private String nome = " ";
    private int pontos = 0;
    
public Recorde(int pontos, String nome){    
    this.nome = nome;
    this.pontos = pontos;
}
public String print(){
    return (this.nome + ": " + this.pontos + " pontos");
    
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

}
