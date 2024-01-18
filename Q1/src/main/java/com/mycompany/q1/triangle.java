/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q1;

/**
 *
 * @author ViP
 */
public class triangle extends shape {

    private int base;
    private int height;

    public triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        // put your code here
        return (this.base * this.height) / 2;
    }

    @Override
    public String toString() {
        return "=== TRIANGLE === \nBASE = " + this.base + "\nHEIGHT = " + this.height + "\n" + super.toString();
    }
}
