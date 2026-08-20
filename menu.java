import java.util.Scanner;

public class menu {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        String name;
        metodos m = new metodos();
        System.out.println("dimension almacen");
        int n = sc.nextInt();
        objmatriz[][] almacen1=new objmatriz[n][n];
        objmatriz[][] almacen2=new objmatriz[n][n];
        objmatriz[][] almacenUnificado=new objmatriz[n][n];
        while (continuar) {
            System.out.println("\nBienvenido, que quiere?\n");
            System.out.println("1- llenar almacen 1");
            System.out.println("2- mostrar almacen 1");
            System.out.println("3- llenar almacen 2");
            System.out.println("4- mostrar almacen 2");
            System.out.println("5- buscar producto ");
            System.out.println("6- unificar almacenes");
            System.out.println("7- mostarar unificados");
            System.out.println("8- salir \n");

            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    m.LenarAlmacen(almacen1, sc);
                    break;
                case 2:
                    System.out.println("\n");
                    m.MostrarAlmacen(almacen1);
                    break;
                case 3:
                    m.LenarAlmacen(almacen2, sc);
                    break;
                case 4:
                    System.out.println("\n");
                    m.MostrarAlmacen(almacen2);
                    break;
                case 5:
                   System.out.println("en que almacen desea buscar?");
                   System.out.println("1- almacen 1");
                   System.out.println("2- almacen 2");
                   System.out.println("3- salir");
                   int almacen = sc.nextInt();
                   
                   switch (almacen) {
                    
                    case 1:
                        System.out.println("ingrese nombre del producto a buscar");
                        name = sc.next();
                        m.BuscarProducto(almacen1, name);
                        break;
                    case 2:
                        System.out.println("ingrese nombre del producto a buscar");
                        name = sc.next();
                        m.BuscarProducto(almacen2, name);
                        break;
                    case 3:
                        break;

                   
                    default:
                        System.out.println("fastidioso");
                        break;
                   }
                    break;
                case 6:
                    System.out.println("mantenimiento");
                    break;
                case 7:
                    System.out.println("mantenimiento");
                    break;
                case 8:
                    System.out.println("bye");
                    continuar = false;
                    break;
            
                default:
                    System.out.println("fastidioso");
                    break;
            }
            
        }

    } 
}

