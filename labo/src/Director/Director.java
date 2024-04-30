package Director;
import Cocina.Cocina;
import ConstructorHamburguesa.ConstructorHamburguesa;
import Hamburguesa.Hamburguesa;

public class Director {
    private ConstructorHamburguesa constructorHamburguesa;

    public Director(ConstructorHamburguesa constructorHamburguesa) {
        this.constructorHamburguesa = constructorHamburguesa;
    }
    public Hamburguesa construirHamburguesa (boolean lechuga, boolean cebolla, boolean tomate, boolean queso, String tipoCarne) {
        constructorHamburguesa.tipoCarne(tipoCarne);
        constructorHamburguesa.lechuga(lechuga);
        constructorHamburguesa.cebolla(cebolla);
        constructorHamburguesa.tomate(tomate);
        constructorHamburguesa.queso(queso);


        return constructorHamburguesa.construirHamburguesa();
    }
}
