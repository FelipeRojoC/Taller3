public abstract class InstrumentoViento{

    String Material;

    //Constructor Instrumento de Viento
    public InstrumentoViento(String Codigo, double Precio, int Stock, String Material) {
        super(Codigo,Precio,Stock);
        this.Material = Material;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }
}
