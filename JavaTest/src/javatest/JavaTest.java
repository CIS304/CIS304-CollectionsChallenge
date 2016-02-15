/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import java.util.ArrayList; 
import java.util.LinkedList; 
import java.util.List; 

/**
 *
 * @author Kevin Mach
 */
public class JavaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> myQueue = new LinkedList<>(); 
        myQueue.add("A"); 
        myQueue.add("B"); 
        myQueue.add("C"); 
        myQueue.add("D"); 
        
        List<String> myList = new ArrayList<>(myQueue); 
        
        for(Object theFruit : myList){
            System.out.println(theFruit);
        }
    }
    
}
