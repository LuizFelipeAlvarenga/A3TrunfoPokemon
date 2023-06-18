package trunfopokemon;

public class Utilidade {
    private static boolean flag = true;
    private static InterfacePrincipal menu = new InterfacePrincipal();
    private static InterfaceJogo Jogar = new InterfaceJogo();

public Utilidade(){
}

public int comp(double dado1, double dado2){
    if(dado1 > dado2){
      return 1;
    }else if(dado1 < dado2){
      return 2;
    }else{
      return 3;
    }    
}
public void setBotaoVisivel(boolean flag){
    Jogar.BotaoAtaque.setVisible(flag);
    Jogar.BotaoTamanho.setVisible(flag);
    Jogar.BotaoPeso.setVisible(flag);
}
public void setBotaoSalProx(boolean flag){
    Jogar.BotaoProxRodada.setVisible(flag);
    Jogar.BotaoSalvar.setVisible(flag);
    Jogar.BotaoSair.setVisible(flag);
    Jogar.TFnome.setVisible(flag);
}
public void setTxtVisivel(boolean flag){
    Jogar.TxtAttak.setVisible(flag);
    Jogar.TxtPeso.setVisible(flag);
    Jogar.TxtTamanho.setVisible(flag);
}
public void setTxt(){
    Jogar.TxtAttak.setText("");
    Jogar.TxtPeso.setText("");
    Jogar.TxtTamanho.setText("");
}
public boolean getFlag(){
    return this.flag;
}
public static void setFlag(boolean flag) {
    Utilidade.flag = flag;
}
public void menu(boolean flag){
    menu.setVisible(flag);
}
public void jogo(boolean flag){
    Jogar.setVisible(flag);
    
}
}
