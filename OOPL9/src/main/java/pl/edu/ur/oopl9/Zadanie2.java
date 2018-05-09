/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class Zadanie2 {
     public Zadanie2() {
    }
    
    public void Zadanie()
    {
      Random losujLiczby = new Random();
      TreeSet<Integer> tree= new TreeSet<Integer>();
      for(int i=0;i<100;i++)
      {
        tree.add(losujLiczby.nextInt(101));
      }
      
      Iterator<Integer> iterator = tree.iterator();
      while (iterator.hasNext()) {
		System.out.print(iterator.next() + " ");
      }
    }
}
