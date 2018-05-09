/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Random losujLiczby = new Random();
        
        int[] tablica=new int[100];
        for(int i=0;i<100;i++)
        {
          tablica[i]=losujLiczby.nextInt(101);
        }
        Arrays.sort(tablica);
        for(int i=0;i<100;i++)
        {
          System.out.print(" "+tablica[i]+"");
        }
        
        
        
        
        //zadanie3
         ArrayList<Auto> autotree= new ArrayList<Auto>();
         for(int i=0;i<100;i++)
        {
          autotree.add(new Auto("Opel","Corsa","2000$","1998"));
        
        }
         
        //zadanie4
	Scanner odczyt = new Scanner(System.in);
        String jakie_slowo="nic";
        System.out.print("Podaj slowo po polsku");
        while(jakie_slowo.equals("koniec!"))
        {
            jakie_slowo=odczyt.next();
            Slownik slownik=new Slownik();
            System.out.print("Po angliesku"+slownik.Szukaj_slowa(jakie_slowo));
            jakie_slowo=slownik.Szukaj_slowa(jakie_slowo);
            
        }
        
        
    }
    
}
