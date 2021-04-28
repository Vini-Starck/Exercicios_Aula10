
package BuscaSequencialObjetos;

import java.util.Scanner;

public class BuscaSequencialPessoa {
    public static void main(String args []){
        Pessoa [] lista = new Pessoa[3];
        metodos.inserir(lista);
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o ID da pesquisa: ");
        int id = leitor.nextInt();
        Pessoa pessoa = metodos.linear(lista, id);
        if(pessoa != null){
            System.out.println("=== Dados da Pesquisa ===");
            System.out.println("Nome: "+pessoa.nome);
            System.out.println("Idade: "+pessoa.idade);
        }else{
            System.out.println("=== Dados da Pesquisa ===");
            System.out.println("Cadastro não existe!");
        }
    }
}
