/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Gustavo Camargo
 */
public class Retangulo {
    //Atributos privados
    private float comprimento = 0;
    private float largura = 0;

    //Get e sets
    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    //MEtodos
    public float calcularArea() {
        return largura * comprimento;
    }
    public float calcularPerimetro(){
        return (largura*2)+ (comprimento *2);
    }
    
}
