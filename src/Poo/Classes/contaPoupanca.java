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
public class contaPoupanca extends Conta{

    public contaPoupanca(Cliente cliente) {
        super(cliente);
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extracto Conta Poupança ***");
        super.imprimirInfo();
    }
    
}
