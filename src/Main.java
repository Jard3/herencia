import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Banco Cuenta = new Banco();
        Cuenta.crear_cuenta();

        int i=1;
        int num;
        while (i==1){
            System.out.println("Escoge una opcion");
            System.out.print("1: Consultar Saldo"+"\n"+
                    "2: Depositar " + "\n" +
                    "3: Retirar " + "\n" +
                    "4: Solicitar Tarjeta " + "\n" +
                    "5: Transferir " + "\n" +
                    "6: Solicitar Prestamo " + "\n" +
                    "7: Adquirir Seguro " + "\n" +
                    "8: Comprar Dolares " + "\n" +
                    "9: Vender Dolares " + "\n" +
                    "10: Comprar Euros " + "\n" +
                    "11: Vender Euros ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Cuenta.consultar();
                    System.out.println("Presiona uno si deseas continuar");
                     num = scanner.nextInt();
                    if (num!=1){i=0;}
                    break;
                case 2:
                    Cuenta.depositar();
                    System.out.println("Presiona uno si deseas continuar");
                     num = scanner.nextInt();
                    if (num!=1){i=0;}
                    break;
                case 3:
                    Cuenta.retirar();
                    System.out.println("Presiona uno si deseas continuar");
                    num = scanner.nextInt();
                    if (num!=1){i=0;}
                    break;
                case 4:
                    Cuenta.solicitarTarjeta();
                    System.out.println("Presiona uno si deseas continuar");
                    num = scanner.nextInt();
                    if (num!=1){i=0;}
                    break;
                case 5:
                    Cuenta.transferir();
                    System.out.println("Presiona uno si deseas continuar");
                    num = scanner.nextInt();
                    if (num!=1){i=0;}
                    break;
                case 6:
                    Cuenta.solicitarPrestamo();
                    System.out.println("Presiona uno si deseas continuar");
                    num = scanner.nextInt();
                    if (num!=1){i=0;}
                    break;
                case 7:
                    Cuenta.adquirirSeguro();
                    System.out.println("Presiona uno si deseas continuar");
                    num = scanner.nextInt();
                    if (num!=1){i=0;}
                    break;
                case 8:
                    Cuenta.comprarDolares();
                    System.out.println("Presiona uno si deseas continuar");
                    num = scanner.nextInt();
                    if (num!=1){i=0;}
                    break;
                case 9:
                    Cuenta.venderDolares();
                    System.out.println("Presiona uno si deseas continuar");
                    num = scanner.nextInt();
                    if (num!=1){i=0;}
                    break;
                case 10:
                    Cuenta.comprarEuros();
                    System.out.println("Presiona uno si deseas continuar");
                    num = scanner.nextInt();
                    if (num!=1){i=0;}
                    break;
                case 11:
                    Cuenta.venderEuros();
                    System.out.println("Presiona uno si deseas continuar");
                    num = scanner.nextInt();
                    if (num!=1){i=0;}
                    break;
            }
        }

            }
    }

