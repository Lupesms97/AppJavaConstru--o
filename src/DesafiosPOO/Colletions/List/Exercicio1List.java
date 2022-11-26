package DesafiosPOO.Colletions.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio1List {
    public static void main(String[] args) {
        List<Double> temperaturas = new  ArrayList<>();
        temperaturas.add(10d);
        temperaturas.add(27d);
        temperaturas.add(28.8);
        temperaturas.add(14.1);
        temperaturas.add(35.01);
        temperaturas.add(20d);
        
        System.out.println(temperaturas.toString());


        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            //cada numero que tiver sera adicionadoatraves do nexct
            Double next = iterator.next();
            soma += next; 
        }

        double media = soma/temperaturas.size();
        
        System.out.println("A media das temperaturas nos ultimos 6 meses são : "+ (media) +" graus");

        Iterator<Double> iterator1 = temperaturas.iterator();
        while(iterator1.hasNext()){
            //cada numero que tiver sera adicionadoatraves do nexct
            Double next = iterator1.next();
            if(next < media) iterator1.remove();

        }

        System.out.println(temperaturas);

    }


    
}



/*class Temperatura{

    private double graus;

    public Temperatura(double graus) {
        this.graus = graus;
    }

    @Override
    public String toString() {
        return String.valueOf(graus);
    }

    
    //public double getMedia6Temperatura(double med1, double med2, double med3, double med4, double med5, double med6){
        //Double media = (med1 + med2 + med3 + med4 + med5 + med6)/6;
   // }
}*/