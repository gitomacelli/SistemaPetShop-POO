package main;

import animal.Cachorro; // Importa a classe `Cachorro`
import animal.Cavalo; // Importa a classe `Cavalo` 
import animal.Passaro; // Importa a classe `Passaro` 

public class Main { 
    public static void main(String[] args) { 
        
        // Criando um objeto da classe Cachorro
        Cachorro objCachorro = new Cachorro("Billy", 7, 7.8, "Shitzu", "Pequeno", true);
        
        // Exibindo informações do Cachorro e os preços dos serviços
        System.out.println("\nCACHORRO: " + objCachorro.getNome()); // Exibe o nome do cachorro
        System.out.println("Preço do banho: R$" + objCachorro.precoServico("banho")); 
        System.out.println("Preço da tosa: R$" + objCachorro.precoServico("tosa")); 
        System.out.println("Preço da consulta: R$" + objCachorro.precoServico("consulta")); 
        
        // Criando um objeto da classe Passaro 
        Passaro objPassaro = new Passaro("Roberto", 2, 1.2, "Papagaio", "Verde", true);
        
        // Exibindo informações do Pássaro e os preços dos serviços
        System.out.println("\nPASSARO: " + objPassaro.getNome()); // Exibe o nome do pássaro
        System.out.println("Preço do banho: R$" + objPassaro.precoServico("banho")); 
        System.out.println("Preço da tosa: R$" + objPassaro.precoServico("tosa")); 
        System.out.println("Preço da consulta: R$" + objPassaro.precoServico("consulta"));
        
        // Criando um objeto da classe Cavalo
        Cavalo objCavalo = new Cavalo("Pé de Pano", 3, 450, "Frisio", 1.75, false);
        
        // Exibindo informações do Cavalo e os preços dos serviços
        System.out.println("\nCAVALO: " + objCavalo.getNome()); // Exibe o nome do cavalo
        System.out.println("Preço do banho: R$" + objCavalo.precoServico("banho"));
        System.out.println("Preço da tosa: R$" + objCavalo.precoServico("tosa")); 
        System.out.println("Preço da consulta: R$" + objCavalo.precoServico("consulta")); 
    }
}