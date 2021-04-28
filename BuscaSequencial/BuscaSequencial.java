
package BuscaSequencial;

import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float []v = {1.2F, 3.4F, 5.6F, 3.6F};
        System.out.println("Digite o valor a ser encontrado:");
        float b = leitor.nextFloat();
        System.out.println("Índice: "+metodos.linear(v, b));
    }
}
