import java.util.Scanner;

public class EjemploSopaipillas {

    public static void main(String[] args ){
        Scanner teclado =new Scanner(System.in);


        VendedorSopapipillas miVendedor =new VendedorSopapipillas(100,150,10100);
        System.out.println("********"+miVendedor.toString()+"**********");

        System.out.println("Cuantas sopaipillas de_*$"+miVendedor.getPrecio()+"*_pesos desea comprar:");
        int cant=miVendedor.cantComprar();

        int rest= miVendedor.getInventarioIncial()- cant;
        miVendedor.setInventarioIncial(rest);
        System.out.println("*****inventario actual: "+miVendedor.getInventarioIncial()+"**********");


        int pagarCliente= miVendedor.pagarCliente(cant);
        int dineroActual=miVendedor.getDineroInicial()+pagarCliente;
        miVendedor.setDineroInicial(dineroActual);


        System.out.println("******Dinero actual: "+miVendedor.getDineroInicial()+"*******");
        System.out.println(" ingrese con cuanto pagara:\n");

        int pagoCliente = teclado.nextInt();
        miVendedor.vuelto(pagoCliente,dineroActual);












    }


}
