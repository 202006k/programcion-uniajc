public class CajeroElectronico {
    //Atributos
    private double saldo;

    //costructor:permite inicializar la clase
    public CajeroElectronico(double saldo){
        this.saldo=saldo;
    }

        //Métodos
        /**
         * obtiene lo que tenga asignado el atributo saldo
         * @return saldo
         */
        public double getSaldo(){
            return saldo;
        }
        /**
         * Método para depositar dinero y asignarselo al saldo 
         * @param cantidad
         * return slado
         */
        public double depositar(double cantidad){
            return saldo += cantidad;

        }

        /**
         * Método para retirar permite resaltarle el saldo el monto retirado
         * @param cantidad
         */

        public void retirar(double cantidad){
            if(cantidad<=saldo){
                System.out.println("el nuevo saldo es:"+ saldo);
            }else{
                System.out.println("la cantidad a retirar es mayor que el saldo");
            }
        }
        

        /**
         * obtener el saldo actual de la cuenta
         * @return saldo
         */
        public double consultarsaldo(){
            return saldo;
        }

        public void tranferir(double cantidad,String destino){
            if(cantidad<=saldo){
                System.out.println("se realizo una transferencia por:"+ cantidad +"a:"+ destino +"y su saldo es:" + saldo);

            }else{
                System.out.println("la transferencia no se pudo hacer");

            }
        }


    }

