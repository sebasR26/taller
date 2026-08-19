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

                objmatriz o = new objmatriz(name, i, cantidad);
                a[i][j] = o;



            }
        }


        return a;
    }

    public void MostrarAlmacen(objmatriz[][] a){

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.println("El nombre del producto" + a[i][j].getName());
                System.out.println("Precio del producto" + a[i][j].getPrecio());
                System.out.println("cantidad del producto" + a[i][j].getCantidad());

            }
        }

    }
}
