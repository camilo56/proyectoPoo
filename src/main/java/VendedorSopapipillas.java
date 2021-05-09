import java.util.Scanner;

public class VendedorSopapipillas {




    Scanner teclado =new Scanner(System.in);

    private int inventarioIncial;
    private int precio;
    private int dineroInicial;

    public VendedorSopapipillas() {
        this.inventarioIncial = 50;
        this.precio = 200;
        this.dineroInicial=5000;


    }


    public VendedorSopapipillas(int inventarioIncial, int precio, int dineroInicial) {
        this.inventarioIncial = inventarioIncial;
        this.precio = precio;
        this.dineroInicial = dineroInicial;
    }

    public int getDineroInicial() {
        return dineroInicial;
    }

    public void setDineroInicial(int dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    public int getInventarioIncial() {
        return inventarioIncial;
    }

    public void setInventarioIncial(int inventarioIncial) {
        this.inventarioIncial = inventarioIncial;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public void vuelto(int pago,int aPagar){

        int vuelto=pago-aPagar;
        System.out.println("El vuelto del cliente es:"+vuelto);

    }


    public int cantSopa(){
        System.out.println("Cuantas sopaipillas de_*"+precio+"*_pesos desea comprar:");

        int cant = teclado.nextInt();
        return cant;
    }


    public int pagarCliente(int cant) {
        int pagarCliente = cant * precio;
        System.out.println("monto que debe pagar:\n" + pagarCliente);
        return pagarCliente;

    }

    public int cantComprar(){

        int cant = 0;
        do {
            try {
                cant = teclado.nextInt();

            }catch (Exception e){
                System.out.println("Cantidad ingresada invalida");
                teclado.next();
            }

        }while(cant> inventarioIncial || cant<0 );
        return cant;

    }



    @Override
    public String toString() {
        return "VendedorSopapipillas{" +
                ", inventarioIncial=" + inventarioIncial +
                ", precio=" + precio +
                ", dineroInicial=" + dineroInicial +
                '}';
    }
}
