/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joao-
 */
public class TestePessoa {
    public static void main(String[] args){
        Pessoa p = new Pessoa.PessoaBuilder("Joao")
                .ultimoNome("Victor")
                .cpf("123456789")
                .criarPessoa();
        Pessoa p2 = new Pessoa.PessoaBuilder("Carlos")
                .ultimoNome("Abreu")
                .cpf("987654321")
                .criarPessoa();
        System.out.println(p);
        System.out.println(p2);
    }
    
}
