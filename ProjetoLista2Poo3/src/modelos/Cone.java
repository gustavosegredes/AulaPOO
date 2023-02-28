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
        
    }
    public float calcAreaLateral(){
        
    }
    public float calcAreaTotal(){
        
    }
    public float calcVolume(){
        
    }