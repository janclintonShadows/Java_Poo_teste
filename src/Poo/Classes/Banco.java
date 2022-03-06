/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Classes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zeref
 */
public class Banco {
    private String nome;
    private List<Conta> conta = new ArrayList<>();
    
    public void adConta(Conta conta){
        this.conta.add(conta);
    }
    
    public void listaContas(){
        conta.stream().forEach((a) -> {
            a.imprimirExtrato();
        });
    }
    
    public int numContas(){
        return conta.size();
    }
    
    public void escConta(int num){
        conta.stream().forEach((Conta a) ->{
       if(a.getNumero()==num){
           a.imprimirExtrato();
       } else{
           System.out.println("Conta não Existe");
       } 
    });
    }
}
