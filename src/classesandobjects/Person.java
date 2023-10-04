/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesandobjects;

import shapes.Triangle;

/**
 *
 * @author felip
 */
public class Person {

    String name;
    int age;
    double height;
    double weight;
    String gender;
    String colour;
    boolean isProgrammer;
    Triangle favTriangle;
    

    public Person(String name, int age, double height, double weight, String gender, String colour, boolean isProgrammer) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.colour = colour;
        this.isProgrammer = isProgrammer;
    }
  

    public String Run() {
        return "Correndo";
    }

    public String Sit() {
        return "Sitting";
    }

    public String Program() {
        if (isProgrammer = true) {
            return "Programming";
        }
        return "cannot programme";
    }

}
