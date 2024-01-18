/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q1;

/**
 *
 * @author ViP
 */
public class shape {

    private String color;

    public shape(String color) {
        this.color = color;
    }

    public double getArea() {
        System.out.println("Instance is Created!");
        return 0;
    }

    @Override
    public String toString() {
        return "Color:-" + this.color;
    }
}
