public interface System {
    public void Menu(); //Este es el menu del sistema
    public int Opcion(); //Es la opcion del menu
    public void AgregarInstrumento(); //Agrega un instrumento al csv
    public void VenderInstrumento(); //Vende un instrumento del csv
    public void ConsultarInventario(); //Revisa el csv para ver el stock
    public void CerrarSistema(); //Termina el sistema y se actualiza el csv

}
