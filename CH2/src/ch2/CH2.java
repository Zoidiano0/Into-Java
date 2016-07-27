/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

import java.util.Scanner;

/**
 *
 * @author debian
 */
public class CH2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Area of a circle
        Scanner input = new Scanner(System.in);
        System.out.println("type the radius of a circle");
        double radius = input.nextInt();
        double area=radius*radius*Math.PI;
        System.out.println("The Area Of a circthe with Radius "+radius+" Is: "+area);
        double test = input.nextDouble(); 
    }
    
}
