public class circulo{

    //Atributos
    private float radio;
    
    //Costructor de la xclase: nos permite iniciar la clase
    //el metodo contructor se llama igual a la clase
    public circulo(float radio){
        this.radio = radio; //this es una autoreferencia al atributo de la clase
    }

    //métodos
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }

    public double calcularArea(){
        return Math.PI*(radio*radio);//Math.PI*Math.pow(r,2)
    }


}