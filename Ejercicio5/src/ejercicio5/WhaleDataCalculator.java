/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.*;
/**
 *
 * @author poo02alu08
 */

public class WhaleDataCalculator {
    public int processRecord (int input) {
        try {
            Thread.sleep (10);
        }catch( InterruptedException e) {
            // Handle i n t e r r u p t e d e x c e p ti o n
        }
        return input+1;
    }
    public void processAllData ( List <Integer> data ) {
        data.stream().map(a -> processRecord(a)).count();
        //data.parallelStream().map(a -> processRecord(a)).count();
    }
    public static void main ( String [] args ) {
        WhaleDataCalculator calculator = new WhaleDataCalculator();
        // D efi n e the data
        List <Integer> data = new ArrayList<Integer>();
        for (int i=0;i<4000;i++)
            data.add(i);
        // P ro c e s s the data
        long start = System.currentTimeMillis();
        calculator.processAllData (data);
        double time = ( System.currentTimeMillis()-start)/1000.0;
        // Report r e s u l t s
        System.out.println("\nTasks completed in : "+ time +" seconds ");
    }
}