import java.util.Scanner;

public class menu {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        metodos m = new metodos();
        System.out.println("dimension almacen");
        int n = sc.nextInt();
        objmatriz[][] almacen1=new objmatriz[n][n];
        objmatriz[][] almacen2=new objmatriz[n][n];
        objmatriz[][] almacenUnificado=new objmatriz[n][n];
        while (continuar) {
            System.out.println("Bienvenidos");
            System.out.println("que quiere");
            System.out.println("1- llenar almacen 1");
            System.out.println("2- mostrar almacen 1");
            System.out.println("3- llenar almacen 2");
            System.out.println("4- mostrar almacen 2");
            System.out.println("5- buscar producto ");
            System.out.println("6- unificar almacenes");
            System.out.println("7- mostarar unificados");
            System.out.println("8- salir");

            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("mantenimiento");
                    break;
                case 6:
                    System.out.println("mantenimiento");
                    break;
                case 7:
                    
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
