public abstract class InstrumentoCuerda extends Instrumento{

    String TipoCuerda;
    int NumeroCuerdas;
    String Material;
    String Tipo;

    //Constructor Instrumento de Cuerdas
    public InstrumentoCuerda(String Codigo, double Precio, int Stock, String TipoCuerda, int NumeroCuerdas, String Material, String Tipo) {
        super(Codigo, Precio, Stock);
        this.TipoCuerda = TipoCuerda;
        this.NumeroCuerdas = NumeroCuerdas;
        this.Material = Material;
        this.Tipo = Tipo;
    }

    public String getTipoCuerda() {
        return TipoCuerda;
    }

    public int getNumeroCuerdas() {
        return NumeroCuerdas;
    }

    public String getMaterial() {
        return Material;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipoCuerda(String tipoCuerda) {
        TipoCuerda = tipoCuerda;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        NumeroCuerdas = numeroCuerdas;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}
