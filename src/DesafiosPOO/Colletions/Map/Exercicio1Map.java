package DesafiosPOO.Colletions.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Exercicio1Map {
    public static void main(String[] args) {
        Map<String, Integer> populacao = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(populacao);
        System.out.println("");
        System.out.println("----------------OUTRO EXERCICIO-----------------");
        System.out.println("");

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        populacao.put("RN", 3534165);
        System.out.println(populacao);
        System.out.println("");
        System.out.println("----------------OUTRO EXERCICIO-----------------");
        System.out.println("");

        System.out.println("Estado PB com 4039277 pessoas está na lista ?" +populacao.containsKey("PB"));
        System.out.println("");
        System.out.println("----------------OUTRO EXERCICIO-----------------");
        System.out.println("");
    
        populacao.put("PB", 4039277);
        System.out.println(populacao);
        System.out.println("");
        System.out.println("----------------OUTRO EXERCICIO-----------------");
        System.out.println("");

        System.out.println("A população de Pernammbuco é de " +populacao.get("PE")+ " pessoas");
        System.out.println("");
        System.out.println("----------------OUTRO EXERCICIO-----------------");
        System.out.println("");

        Map<String, Integer> populacao1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};

        System.out.println(populacao1);
        System.out.println("");
        System.out.println("----------------OUTRO EXERCICIO-----------------");
        System.out.println("");

        Map<String, Integer> populacao2 = new TreeMap<>(populacao1);
        System.out.println(populacao2);
        System.out.println("");
        System.out.println("----------------OUTRO EXERCICIO-----------------");
        System.out.println("");

        Integer MenorPopulacao = Collections.min(populacao2.values());
        System.out.println(MenorPopulacao);
        String  EstadoMenorPopulacao = "";
        Set<Map.Entry<String, Integer>> estados = populacao2.entrySet();
        for (Map.Entry<String, Integer> estado : estados) {
            if(estado.getValue() == MenorPopulacao) {
                EstadoMenorPopulacao = estado.getKey();
            }
        }
        System.out.println("O estado com a menor população é o "+EstadoMenorPopulacao+ " com "+MenorPopulacao+" pessoas");
        System.out.println("");
        System.out.println("----------------OUTRO EXERCICIO-----------------");
        System.out.println("");








    }
    
}
