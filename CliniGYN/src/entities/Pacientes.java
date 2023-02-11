/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;


public class Pacientes {
    public Pacientes(){
        
    }
    
    public Float IMC(int peso, float altura) {
        return peso / (altura * altura);
    }
               
}
