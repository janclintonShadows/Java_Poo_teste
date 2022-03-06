/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Poo.Classes.*;
/**
 *
 * @author Zeref
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente1 = new Cliente("Janclinton");
        Cliente cliente2 = new Cliente("Zeref");
        Conta c1 =  new contaCorrente(cliente1);
        Conta c2 = new contaPoupanca(cliente2);
        contaCorrente c3 = new contaCorrente(cliente2);
        c1.depositar(1000);
        c1.transferir(640.12, c2);
                
        Banco banco = new Banco();
        banco.adConta(c1);
        banco.adConta(c3);
        banco.adConta(c2);
        System.out.println("Numero de contas no banco é: "+banco.numContas());
        
        banco.listaContas();
    }
    
}
