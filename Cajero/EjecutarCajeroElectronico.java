public class EjecutarCajeroElectronico {

    public static void main(String[]arg){

        //crear el objeto para trabajar con los métodos del cajero Electrónico
        //se creo el objeto objp1 con saldo inicial de 1000.0
        CajeroElectronico objp1= new CajeroElectronico(1000.0);

        //Ecenario 1
        //Depositar 1300 dolares
        System.out.println("nuevo saldo:" + objp1.depositar(1300.0));

        //consultar saldo actual
        System.out.println("saldo actual:" + objp1.consultarsaldo());

        //retirar una cantidad de 2000.0
        objp1.retirar(2000.0);

        //tranferir 200 a Medelin
        objp1.transferir(200.0,"Medelin");




    }
    
}
