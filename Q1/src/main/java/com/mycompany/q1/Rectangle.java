/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q1;

/**
 *
 * @author ViP
 */
public class Rectangle extends shape {

    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "=== RECTANGLE === \nLENGTH = " + this.length + "\nWIDTH = " + this.width + "\n" + super.toString();
    }
}
