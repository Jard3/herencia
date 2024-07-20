public class Banco  extends BancoAvanzado{
    private String nombre;

    public int crear_cuenta () {
            int numeroGenerado = (int) Math.floor(Math.random() * 10000000 + 1);
System.out.println("Su numero de cuenta es: " + numeroGenerado);

        return 0;
    }
}
