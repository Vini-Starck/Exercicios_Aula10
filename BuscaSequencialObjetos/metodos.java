package BuscaSequencialObjetos;

import java.util.Scanner;

public class metodos {
    
    
    /**
     * instancia e insere os valores dentro do array
     * @param lista [] Pessoa
     */
    public static void inserir(Pessoa[]lista){
        Scanner leitor = new Scanner(System.in);
        for(int i=0; i<lista.length; i++){
            lista[i] = new Pessoa();
        }
        
        for(int i=0; i<lista.length; i++){
            System.out.println("Nome da "+(i+1)+"º pessoa: ");
            lista[i].nome = leitor.next();
            System.out.println("Idade da "+(i+1)+"º pessoa: ");
            lista[i].idade = leitor.nextInt();
            // auto incremento
            lista[i].id = i+1;
        }
    }
    
    public static Pessoa linear(Pessoa[]lista, int id){
        for(int i=0; i<lista.length; i++){
            if(lista[i].id == id){
                return lista[i];
            }
        }
        return null; // não retorna nenhum objeto
    }
}