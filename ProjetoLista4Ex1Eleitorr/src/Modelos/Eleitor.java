/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Gustavo Camargo
 */
public class Eleitor {
    private String nome = "";
    private int anoNascimento = 0;
    
    public Eleitor(String nome, int anoNascimento) throws Exception{
        this.nome = nome;
        if ( anoNascimento < 0 ) throw new Exception("Ano do nascimento nao pode ser < 0");
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) throws Exception {
        if ( anoNascimento < 0 ) throw new Exception("Ano do nascimento nao pode ser < 0");
        this.anoNascimento = anoNascimento;
    }

    public String calcularTipoEleitor() {
        LocalDate anoAtual = LocalDate.now();
        int idade = (anoAtual.getYear() - anoNascimento);
        if ( idade < 16 ) return "Nao eleitor" + idade;
        if ( idade >= 16 && idade < 18 ) {
            return "Eleitor Facultativo"+ idade;
        }
        if ( idade <= 18 && idade <= 65){
            return "Eleitor Obrigatorio" + idade;
        }
        return "Eleitor Facultativo"+ idade;
    }
}
