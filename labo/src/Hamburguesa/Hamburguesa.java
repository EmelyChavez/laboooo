package Hamburguesa;

public class Hamburguesa {
    private boolean lechuga;
    private boolean tomate;
    private boolean cebolla;
    private boolean queso;
    private String tipoCarne;
    public Hamburguesa(){}

    @Override
    public String toString() {
        return "Su hamburguesa es con " + tipoCarne + (lechuga ? ", lechuga" : "") + (tomate ? ", tomate": "") + (cebolla ? ", cebolla": "") + (queso ? ", queso": "");
    }

    public void setLechuga(boolean lechuga) {
        this.lechuga = lechuga;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public void setQueso(boolean queso) {
        this.queso = queso;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }
}



