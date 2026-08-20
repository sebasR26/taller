public class objmatriz {
    String name;
    Double precio;
    int cantidad;
    
    public objmatriz(String name, double precio, int cantidad) {
        this.name = name;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    

    

    
}
