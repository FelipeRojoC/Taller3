public abstract class InstrumentoPercusion extends Instrumento{

    String Tipo;
    String Material;
    double Altura;

    //Constructor Instrumento de Percusion
    public InstrumentoPercusion(String Codigo, double Precio, int Stock, String Tipo, String Material, double Altura) {
        super(Codigo, Precio, Stock);
        this.Tipo = Tipo;
        this.Material = Material;
        this.Altura = Altura;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getMaterial() {
        return Material;
    }

    public double getAltura() {
        return Altura;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }
}
