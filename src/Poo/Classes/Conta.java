/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Classes;

/**
 *
 * @author Zeref
 */
public abstract class Conta implements iConta{
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    private static final int AGENCIA =1;
    private static int SEQUENCIAL = 1;
    private Cliente cliente;
    private Banco b1;
    
    
    public Conta(Cliente cliente){
        this.agencia = AGENCIA;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        //b1.adConta(this);
    }

    @Override
    public void sacar(double valor) {
       if(this.saldo < valor){
           
       }else{
           this.saldo -= valor;
       }
    }

    @Override
    public void depositar(double valor) {
        if(valor >0){
            this.saldo += valor;
        }
    }

    @Override
    public void transferir(double valor, Conta conta) {
        this.sacar(valor);
        conta.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    //@Override
    protected void imprimirInfo(){
        System.out.println(String.format("Agencia %d", this.agencia));
        System.out.println(String.format("Numero de Conta: %d", numero));
        System.out.println(String.format("Titular da Conta: %s", this.cliente.getNome()));
        System.out.println(String.format("Saldo da Conta: %.2f", this.saldo));
    }
    
}
