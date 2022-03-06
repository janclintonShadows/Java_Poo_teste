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
public interface iConta {
    void sacar(double valor);
    
    void depositar(double valor);
    
    void transferir(double valor,Conta conta);
    
    void imprimirExtrato();
}
