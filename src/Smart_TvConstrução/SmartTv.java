package Smart_TvConstrução;
public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;
    
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void trocarCanal(int novoCanal){
        canal=novoCanal;
    }
    public void trocarCanalMais(){
        canal++;
    }

    public void trocarCanalMenos(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }


}