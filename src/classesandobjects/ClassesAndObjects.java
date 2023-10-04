/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjects;

import shapes.Rectangle;
import shapes.Triangle;

/**
 *
 * @author felip
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Triangle tri1 = new Triangle();
        Triangle tri2 = new Triangle();
        Triangle tri3 = new Triangle();
        Triangle tri4 = new Triangle();
        Triangle tri5 = new Triangle();
        Triangle tri6 = new Triangle();
        
        int[] sideLenghts = new int [18]; //the leghts if tril's side will be first, then leghts of tril's sides.
        sideLenghts [0] = 5;
        sideLenghts [1] = 8;
        sideLenghts [2] = 9;
        
        //tri 5  (4,7,2)
        sideLenghts[12] = 4;
        sideLenghts[13] = 7;
        sideLenghts[14] = 2;
        
        
        sideLenghts [1] = 3;
        sideLenghts [4] = 3;
        sideLenghts [7] = 3;
        sideLenghts [10] = 3;
        sideLenghts [13] = 3;
        sideLenghts [16] = 3;
        
        //we want to set the middle side of each triagle to be 3
        
        Rectangle rect1 = new Rectangle();
        System.out.println(rect1.getArea());
        
        
    }
    
}
