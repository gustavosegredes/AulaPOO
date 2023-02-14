/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Gustavo Camargo
 */
public class Esfera {
    private float raio = 0;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
            
    public float CalcularArea() {
        return (float) (4*3.1415* (raio * raio));
    }
    public float CalcularVolume() {
        return (float) ((4/3)* 3.1415 * ( raio * raio * raio));
    }
}
