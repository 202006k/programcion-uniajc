public class NumerosPrimos {
    private int numero;
    private int inicio;
    private int fin;
    
    public void EjecutarVerificarPrimos(int numero, int inicio, int fin){
        this.inicio=inicio;
        this.fin=fin;
    }
    public int cantidadPrimos(int numero){
        int contador =0, primos=0;
        while (numero !=0) {
            numero/=10;
            if(numero%2==0){
                primos++;
            }
            contador++;
            
        }
        return primos;

    }
} 
