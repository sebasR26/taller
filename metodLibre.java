import java.util.Scanner;
//ejercicios #3
public class metodLibre{
    public objLibreria[][] llenarLibreria(objLibreria[][] a, Scanner sc){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.println("ingrese nombre del libro:");
                String name = sc.next();
                

                System.out.println("ingrese autor: ");
                 String autor = sc.next();
                 

                System.out.println("ingrese precio: ");
                double precio = sc.nextDouble();
                 

                objLibreria o = new objLibreria(name, autor, precio);
                a[i][j] = o;
            }
        }
        return a;
    }

    public void mostrarLibreria(objLibreria[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.println("\nEl nombre del libro: " + a[i][j].getName());
                System.out.println("Autor del libro: " + a[i][j].getAutor());
                System.out.println("Precio del libro: " + a[i][j].getPrecio());
            }
        }
    }

    public void precioAto(objLibreria[][] a){
        double precioAlto =0;
        String name="";
        String autor="";
        double precio=0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(a[i][j].getPrecio() > precioAlto){
                    
                    precioAlto = a[i][j].getPrecio();
                    name = a[i][j].getName();
                    autor = a[i][j].getAutor();
                    precio = a[i][j].getPrecio();
                }
            }
        }
        System.out.println("El precio más alto es: ");
        System.out.println("Nombre del libro: " + name);
        System.out.println("Autor del libro: " + autor);
        System.out.println("Precio del libro: " + precio);

    }


}
