
public class Instrumento {

    String Codigo;
    double Precio;
    int Stock;

    //Constructor Instrumento
    public Instrumento(String Codigo, double Precio, int Stock){
        this.Codigo = Codigo;
        this.Precio = Precio;
        this.Stock = Stock;
    }

    public String getCodigo() {
        return Codigo;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public void setStock(int stock) {
        Stock = stock;
    }
}
