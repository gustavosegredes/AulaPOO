/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavocamargo.adm
 */
public class contaPoupanca {
    private String nomeCliente = "";
    private int numeroConta  = 0;
    private int agencia = 0;
    private float saldo = 0;
    private float deposito = 0;
    private float depositoMinimoAbrirConta = 0; 
    
    public contaPoupanca(String nomeCliente, float saldo, float depositoMinimoAbrirConta) throws Exception{
        Random gerarNumero = new Random();
        //if ( nomeCliente.equalsIgnoreCase("")) throw  new Exception("Nome nao pode estar vazio!!");
        this.nomeCliente = nomeCliente;
        this.numeroConta = (int)gerarNumero.nextInt(1000);
        this.agencia = (int)gerarNumero.nextInt(10);
        this.saldo = saldo;
        //if ( deposito <= 0 ) throw new Exception("Valor do deposito não pode ser <= 0");
        //this.deposito = deposito;
        if ( depositoMinimoAbrirConta < 1000 ) throw new Exception("Para abrir a conta o deposito minimo e de R$1.000 reais!");
        this.depositoMinimoAbrirConta = depositoMinimoAbrirConta;
    }
    public float sacarDinheiro(float valorSaque)throws Exception{
        if ( valorSaque <= saldo) throw new Exception("Seu saldo não e menor que valor desejado");
        saldo += valorSaque;
        return saldo;
    }
    public float depositarDinheiro(float valorDeposito){
        saldo += valorDeposito;
        return saldo;
    }
    public float verificarSaldo() {
        return saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    public float getDepositoMinimoAbrirConta() {
        return depositoMinimoAbrirConta;
    }

    public void setDepositoMinimoAbrirConta(float depositoMinimoAbrirConta) {
        this.depositoMinimoAbrirConta = depositoMinimoAbrirConta;
    }
    
}
