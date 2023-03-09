/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author gustavocamargo.adm
 */
public class ContraCheque {
    //Atributos privados
    private int matriculaFuncionario = 0;
    private String nomeFuncionario = "";
    private int numeroDependentes = 0;
    private int producao = 0;
    private float salarioBase = 0;

    //Contrutor
    public ContraCheque(int matriculaFuncionario,String nomeFuncionario,int numeroDependentes,int producao, 
                        float salarioBase) throws Exception{
        if ( matriculaFuncionario <= 0 ) throw new Exception("Matricula não pode ser menor menor que 0!");
        this.matriculaFuncionario = matriculaFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        if ( numeroDependentes < 0 ) throw new Exception("Insita um numero positivo");
        this.numeroDependentes = numeroDependentes;
        if ( producao < 0) throw new Exception("Insira um numero positivo");
        this.producao = producao;
        if ( salarioBase <=0 ) throw new Exception("Salario Base nao pode ser menor que 0! ");
        this.salarioBase = salarioBase;
    }
    //metodo calcular o salario bruto
    public float calcularSalarioBruto() {
        float gratificacao = calcularGratificacao();
        if ( producao <= 1000 ) return salarioBase + gratificacao;
        if ( producao < 2000) return salarioBase + gratificacao;
        return salarioBase + gratificacao;        
    }
    //metodo para calcular gratificação
    public float calcularGratificacao () {
        if ( producao <= 1000 ) return 500;
        if ( producao < 2000) return 1250;
        return 2250;     
    }
    //metodo para calcular salario liquido
    public float calcularSalarioLiquido(){
        float salarioLiquido = calcularSalarioBruto() - calcularDescontoINSS() - calcularDescontoIRPF();
        return salarioLiquido;
    }
    //metodo calcular desconto do INSS
    public float calcularDescontoINSS(){
        float salario = calcularSalarioBruto();
        if ( salario <= 1302.00) return (float)(salario * 0.075);
        if ( salario > 1302.00 && salario <= 2571.29) return (float)( salario * 0.09);
        if ( salario > 2571.30 && salario < 3856.94) return (float) ( salario * 0.12);
        return (float)(salario * 0.14);
    }
    //metodo calcular desconto do IRPF
    public float calcularDescontoIRPF() {
        float descontoDependente = calcularDescontoFilhos();
        float salario = calcularSalarioBruto();
        if ( salario <= 1903.98) return 0;
        if ( salario >= 1903.99 && salario <= 2826.65) return (float) ( salario * 0.075)- descontoDependente;
        if ( salario >= 2826.66 && salario <= 3751.05) return (float) ( salario * 0.15)- descontoDependente;
        if ( salario >= 3751.06 && salario <= 4664.68) return (float) ( salario * 0.225)- descontoDependente;
        return (float)(salario * 0.275) - descontoDependente;
    }
    //Metodo para calcular o valor do desconto por dependente
    public float calcularDescontoFilhos(){
        return (float)(numeroDependentes * 123.00);
    }

    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(int matriculaFuncionario) throws Exception{
        if ( matriculaFuncionario <= 0 ) throw new Exception("Matricula não pode ser menor menor que 0!");
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(int numeroDependentes) throws Exception{
        if ( numeroDependentes < 0 ) throw new Exception("Insita um numero positivo ou 0");
        this.numeroDependentes = numeroDependentes;
    }

    public int getProducao() {
        return producao;
    }

    public void setProducao(int producao)throws Exception{
        if ( producao < 0) throw new Exception("Insira um numero positivo");
        this.producao = producao;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase)throws Exception{
        if ( salarioBase <=0 ) throw new Exception("Salario Base nao pode ser menor que 0! ");
        this.salarioBase = salarioBase;
    }
    
}
