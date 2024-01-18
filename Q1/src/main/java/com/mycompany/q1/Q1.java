/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.q1;

/**
 *
 * @author ViP
 */
public class Q1 {

    public static void main(String[] args) {
        //upcasting
        shape rect = new Rectangle("Blue", 8, 4);
        System.out.println(rect);
        System.out.println("\nArea of Rectangle = " + rect.getArea() + "\n\n");

        shape tr = new triangle("Red", 12, 8);
        System.out.println(tr);
        System.out.println("\nArea of Triangle = " + tr.getArea() + "\n\n");

        //downcasting
        Rectangle shape = (Rectangle) rect;
        System.out.println(shape);
        System.out.println("\nArea of Rectangle = " + shape.getArea());
    }
}
