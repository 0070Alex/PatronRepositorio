/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Alexander Elias
 */
public class Car {
    
    private String color;
    private String anio;
    private String motor;
    private String modelo;

    public Car() {
    }

    public Car(String color, String anio, String motor, String modelo) {
        this.color = color;
        this.anio = anio;
        this.motor = motor;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString() {
        return "Color: "+color+ "anio: "+anio+"motor: "+motor+ "modelo: "+modelo;
    }
    
    
}
