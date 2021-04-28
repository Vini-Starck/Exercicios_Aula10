package BuscaSequencial;

public class metodos {
    public static int linear(float[]v, float b){
        for(int i=0; i<v.length; i++){
            if(v[i] == b){
                return i;
            }
        }
        return -1;
    }
}
