/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Gustavo Camargo
 */
public class Cone {
    private float raio = 0;
    private float altura = 0;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception{
        if ( raio < 0 ) throw new Exception("Raio nao pode ser negativo!!");
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura)throws Exception{
        if ( altura < 0 ) throw new Exception("Altura nao pode ser negativo!!"); 
        this.altura = altura;
    }
    
    public float calcGeratriz(){
        return (float) Math.sqrt((Math.pow(altura, 2)+ (Math.pow(raio, 2))));
    }
    public float calcAreaLateral(){
        return (float) (Math.PI * raio * calcGeratriz());
    }
    public float calcAreaTotal(){
        return (float) (Math.PI * raio * (calcGeratriz() + raio));
    }
    public float calcVolume(){
        return (float) (1.0/3.0 * Math.PI * Math.pow(raio, 2)* altura);
    }
}    