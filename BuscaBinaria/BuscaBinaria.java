package BuscaBinaria;

import javax.swing.JOptionPane;

public class BuscaBinaria {
    public static void main(String args[]){
        int []v = {2,4,5,6,12,34,67};
        
        int busca =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        
        int r = metodos.binaria(v, busca);
        JOptionPane.showMessageDialog(null,"Índice: "+r);
    }
}
