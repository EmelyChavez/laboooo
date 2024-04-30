import Cocina.Cocina;
import ConstructorHamburguesa.ConstructorHamburguesa;
import Director.Director;
import Hamburguesa.Hamburguesa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            ConstructorHamburguesa constructorHamburguesa = new Cocina();
            Director director = new Director(constructorHamburguesa);
            Hamburguesa hamburguesa = director.construirHamburguesa(true, false, true, false, "Pollo");
            System.out.println("Hamburguesa 1: "+ hamburguesa);
            Hamburguesa hamburguesa2 = director.construirHamburguesa(false, true, true, true, "Carne");
            System.out.println("Hamburguesa 2: "+ hamburguesa2);
            Hamburguesa hamburguesa3 = director.construirHamburguesa(true, true, true, true, "Tocino");
            System.out.println("Hamburguesa 3: "+ hamburguesa3);
    }
}