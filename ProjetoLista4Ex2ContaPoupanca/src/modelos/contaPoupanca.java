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

    public contaPoupanca(String nomeCliente,int numeroConta, int agencia, float saldo )throws Exception{
        this.nomeCliente = nomeCliente;
        if ( numeroConta <= 0) throw new Exception("Valor da conta nao pode ser menor que 0!");
        this.numeroConta = numeroConta;
        if ( agencia <= 0) throw new Exception("Valor da conta nao pode ser menor que 0!");
        this.agencia = agencia;
        if ( saldo <= 0 ) throw new Exception("Valor do deposito não pode ser <= 0");
        this.saldo = saldo;
        if ( saldo < 1000 ) throw new Exception("Para abrir a conta o deposito minimo e de R$1.000 reais!");

    }
    public void sacarDinheiro(float valorSaque)throws Exception{
        if ( valorSaque > saldo) throw new Exception("Seu saldo e menor que valor desejado");
        if ( valorSaque <= 0 ) throw  new Exception("Saque não pode ser menor que 0!");
        saldo -= valorSaque;
    }
    public void  depositarDinheiro(float valorDeposito) throws Exception{
        if ( valorDeposito <=0 ) throw new Exception("Valor do deposito nao pode ser menor que 0!");
        saldo += valorDeposito;
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

}
