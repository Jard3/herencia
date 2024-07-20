import java.util.Scanner;
public class BancoAvanzado {
    static Scanner scanner = new Scanner(System.in);
    private String nombre;


int Saldo,Dolares,Euros;


    public int depositar() {
        System.out.println("Ingrese el valor del deposito: ");
       int deposito = scanner.nextInt();
        Saldo  = Saldo + deposito;
        System.out.println("Depostio realizado");
        return deposito;
    }

    public int consultar(){
        System.out.println("Su saldo es: Q" + Saldo + " $" + Dolares + " €" + Euros);
        return 0;
    }
    public int retirar (){
        System.out.println("Ingresen el valor del deposito: ");
        int Retiro = scanner.nextInt();
        if (Retiro > Saldo) {System.out.println("Su saldo es insuficiente");}
        else{System.out.println("Retiro realizado");}
        return 0;
    }
    public int solicitarTarjeta(){
        System.out.println("Ingrese el nombre que desea que aparezca en la tarjeta ");
        String nombre = scanner.next();
        int numeroTarjeta = (int) Math.floor(Math.random() *1000000000+1);
        int codigoSeguridad = (int) Math.floor(Math.random() * 999 + 1);
        System.out.println("Felicidades Sr/Srta " + nombre + " su solicitud fue aprobada ");
        System.out.println("Su numero de tarjeta es: " + numeroTarjeta );
        System.out.println("Su codigo de seguridad es " + codigoSeguridad);

        return 0;
    }

    public int transferir (){
        System.out.println("Ingrese el numero de cuenta");
        int cuenta = scanner.nextInt();
        if (cuenta <10000000) {
            System.out.println("Ingresen el valor a transferir: ");
            int Retiro = scanner.nextInt();
            if (Retiro > Saldo) {
                System.out.println("Su saldo es insuficiente");
            } else {Saldo-=Retiro;
                System.out.println("Retiro realizado");
            }

        }else{System.out.println("Ingrese un numero de cuenta valido");}
        return 0;
    }
    public int solicitarPrestamo (){
        System.out.println("Ingresa la cantidad que deseas solicitar");
        int cantidad = scanner.nextInt();
        int prestamo = (cantidad/10)+cantidad;
        System.out.println("El total a rembolsar es de: " + prestamo);
        System.out.println("Desea continuar??");
        System.out.println("1: si/2: no");
        int decision = scanner.nextInt();
        if(decision == 1){
            Saldo+=cantidad;
            System.out.println("Prestamo concedido");
        }
        else{System.out.println("Esperamos que considere la propuesta");}
        return 0;
    }
    public int adquirirSeguro (){
        System.out.println("Contamos con seguros de vida y seguros médicos");
        System.out.println("1: Seguro de vida costo Q100");
        System.out.println("2: Seguro médico costo Q50");
        int opcion = scanner.nextInt();
        if (opcion==1){Saldo-=100;
        System.out.println("Seguro de vida adquirido");
        } else if (opcion == 2) {Saldo -=50;
            System.out.println("Seguro medico adquirido");
        }else{System.out.println("Ingrese una opcion valida");}
        return 0;
    }
    public int comprarDolares(){
        System.out.println("Cuantos dolares desea adquirir");
        System.out.println("1 Dolar = 7.88");
        int cantidad = scanner.nextInt();
            Saldo-=cantidad*7.88;
            Dolares+=cantidad;
            return 0;
    }
    public int venderDolares(){
        System.out.println("Cuantos dolares desea vender");
        System.out.println("1 Dolar = 7.54");
        int cantidad = scanner.nextInt();
        Saldo+=cantidad*7.54;
        Dolares-=cantidad;
        return 0;
    }
    public int comprarEuros(){
        System.out.println("Cuantos euros desea adquirir");
        System.out.println("1 euro = 9.33");
        int cantidad = scanner.nextInt();
        Saldo-=cantidad*9.33;
        Euros+=cantidad;
        return 0;
    }
    public int venderEuros(){
        System.out.println("Cuantos euros desea vender");
        System.out.println("1 Euro = 7.89");
        int cantidad = scanner.nextInt();
        Saldo+=cantidad*7.89;
        Euros-=cantidad;
        return 0;
    }
}
