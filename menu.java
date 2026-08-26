import java.util.Scanner;

public class menu {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        String name;
        metodos m = new metodos();
        metodLibre ml = new metodLibre();
        int n;
        

        while(continuar){
        System.out.println("que menu deseas ver?\n");
        System.out.println("1- menu de almacen");
        System.out.println("2- menu de libreria");
        System.out.println("3- menu de teatro");
        System.out.println("4- salir");

        n = sc.nextInt();
        switch (n) {
            case 1: //ejercicios #1 #2 
                System.out.println("dimension almacen");
                n = sc.nextInt();
                objmatriz[][] almacen1=new objmatriz[n][n];
                objmatriz[][] almacen2=new objmatriz[n][n*n];
                objmatriz[][] almacenUnificado=new objmatriz[n][n];
                while (continuar) {
            System.out.println("\nBienvenido, que quiere?\n");
            System.out.println("1- llenar almacen 1");
            System.out.println("2- mostrar almacen 1");
            System.out.println("3- llenar almacen 2");
            System.out.println("4- mostrar almacen 2");
            System.out.println("5- inventario de almacen ");
            System.out.println("6- buscar producto ");
            System.out.println("7- unificar almacenes");
            System.out.println("8- mostrar unificados");
            System.out.println("9- salir \n");

            n = sc.nextInt();
            switch (n) {
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
                    System.out.println("en que almacen desea ver el inventario?");
                   System.out.println("1- almacen 1");
                   System.out.println("2- almacen 2");
                   System.out.println("3- salir");
                    n = sc.nextInt();
                   
                   switch (n) {
                    
                    case 1:
                        m.inventario(almacen1);
                        break;
                    case 2:
                        m.inventario(almacen2);
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("fastidioso");
                        break;
                   }
                    break;
                    
                case 6:
                   System.out.println("en que almacen desea buscar?");
                   System.out.println("1- almacen 1");
                   System.out.println("2- almacen 2");
                   System.out.println("3- salir");
                    n = sc.nextInt();
                   
                   switch (n) {
                    
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
                case 7:
                    m.unificar(almacen1, almacen2, almacenUnificado);
                    break;
                case 8:
                    System.out.println("mantenimiento");
                    break;
                case 9:
                    System.out.println("bye");
                    continuar = false;
                    break;
            
                default:
                    System.out.println("fastidioso");
                    break;
            }
            
        }
                break;
            case 2: //ejercicios #3
                System.out.println("dimension libreria");
                    n = sc.nextInt();
                    objLibreria[][] libreria = new objLibreria[n][n];
                    while (continuar) {
                    
                    System.out.println("\nque quiere: ");
                   System.out.println("1- llenar libreria");
                   System.out.println("2- mostrar libreria");
                   System.out.println("3- precio mas alto");
                   System.out.println("4- salir");
                    n = sc.nextInt();
                   
                   switch (n) {
                    
                    case 1:
                        ml.llenarLibreria(libreria, sc);
                        break;
                    case 2:
                        ml.mostrarLibreria(libreria);
                        break;
                    case 3:
                        ml.precioAto(libreria);
                        break;
                    case 4:
                        System.out.println("bye");
                        continuar = false;
                        break;

                   
                    default:
                        System.out.println("fastidioso");
                        break;
                   }
                    
                
                    }
            case 3: //ejercicios #4
                objasiento[][] asientos = new objasiento[1][2];
                    while (continuar) {
                    
                    
                    System.out.println("\nque quiere: ");
                   System.out.println("1- asignar precios: ");
                   System.out.println("2- mostrar asientos: ");
                   System.out.println("3- salir: ");
                   
                    n = sc.nextInt();
                   
                   switch (n) {
                    
                    case 1:
                        m.asignarPrecio(asientos, sc);
                        break;
                    case 2:
                        m.ordenar(asientos);
                        break;
                    case 3:
                        System.out.println("bye");
                        continuar = false;
                        break;

                   
                    default:
                        System.out.println("fastidioso");
                        break;
                   }

                    }
            case 4:
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

