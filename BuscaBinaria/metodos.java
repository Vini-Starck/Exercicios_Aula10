package BuscaBinaria;

public class metodos {
    
    
    public static int binaria(int[]v,int b){
        int inicio=0, fim=v.length-1, central;
        
        while(inicio <= fim){
            central = (fim+inicio)/2;
            if(b==v[central]){
                return central;
            }else if(b > v[central]){
                inicio = central+1;
            }else{
                fim = central-1;
            }
        }
        return -1;
    }
}
