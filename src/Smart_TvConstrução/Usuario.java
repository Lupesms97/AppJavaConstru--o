package Smart_TvConstrução;
public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Qual o canaal atual? " + smartTv.canal);
        System.out.println("Volume atual é:" + smartTv.volume);
;
        smartTv.ligar();
        System.out.println
        ("Novo status - TV Ligada ?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status - TV Ligada ?" + smartTv.ligada);

        smartTv.trocarCanalMais();
        System.out.println("Qual o canaal atual? " + smartTv.canal);

        smartTv.trocarCanalMenos();
        System.out.println("Qual o canaal atual? " + smartTv.canal);

        smartTv.trocarCanal(13);
        System.out.println("Qual o canaal atual? " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual é " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.print("Volume atual é " + smartTv.volume);

    }
}
