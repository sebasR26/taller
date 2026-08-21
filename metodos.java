import java.util.Scanner;

public class metodos {
    public objmatriz[][] LenarAlmacen(objmatriz[][] a, Scanner sc){

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                System.out.println("ingrese nombre");
                String name = sc.next();
                System.out.println("ingrese precio");
                Double precio = sc.nextDouble();
                System.out.println("ingrese cantidad");
                int cantidad = sc.nextInt();

                objmatriz o = new objmatriz(name, precio, cantidad);
                a[i][j] = o;



            }
        }


        return a;
    }

    public void MostrarAlmacen(objmatriz[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.println("\nEl nombre del producto: " + a[i][j].getName());
                System.out.println("Precio del producto: " + a[i][j].getPrecio());
                System.out.println("cantidad del producto: " + a[i][j].getCantidad());

            }
        }

    }

    //ejercicio 1
    public void BuscarProducto(objmatriz[][] a, String name){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(a[i][j].getName().equals(name)){
                    System.out.println("\nEl nombre del producto: " + a[i][j].getName());
                    System.out.println("Precio del producto: " + a[i][j].getPrecio());
                    System.out.println("cantidad del producto: " + a[i][j].getCantidad());
                }
            }
        }
    }

    //ejercicio 2
    public void inventario(objmatriz[][] a){
        int total = 0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                
                total = total + a[i][j].getCantidad();
                
            }
        }
        System.out.println("Inventario total del almacen:" + total);
    }

    public objasiento[][] asignarPrecio(objasiento[][] a, Scanner sc){

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.println("\ningrese precio de la fila: " + (i+1) + " asiento: " + (j+1));
                int numero = (i+1);
                int fila = (j+1);
                double precio = sc.nextDouble();
                objasiento o = new objasiento(fila, numero, precio);
                a[i][j] = o;
            }
        }


        return a;
    }

    public void ordenar(objasiento[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                for(int k=0; k<a.length; k++){
                    for(int l=0; l<a[0].length; l++){
                        if(a[i][j].getPrecio() < a[k][l].getPrecio()){
                            objasiento temp = a[i][j];
                            a[i][j] = a[k][l];
                            a[k][l] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("\nAsientos ordenados por precio: ");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.println("\nFila: " + a[i][j].getFila());
                System.out.println("Asiento: " + a[i][j].getNumero());
                System.out.println("Precio: " + a[i][j].getPrecio());
            }
        }
    }
}
