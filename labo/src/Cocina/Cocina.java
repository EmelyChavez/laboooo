package Cocina;

import ConstructorHamburguesa.ConstructorHamburguesa;
import Hamburguesa.Hamburguesa;

public class Cocina implements ConstructorHamburguesa {
    private Hamburguesa hamburguesa = new Hamburguesa();


    @Override
    public void lechuga(boolean agregar) {
        hamburguesa.setLechuga(agregar);
    }

    @Override
    public void tomate(boolean agregar) {
        hamburguesa.setTomate(agregar);
    }

    @Override
    public void cebolla(boolean agregar) {
        hamburguesa.setCebolla(agregar);

    }

    @Override
    public void queso(boolean agregar) {
        hamburguesa.setQueso(agregar);
    }

    @Override
    public String tipoCarne(String tipoCarne) {
        hamburguesa.setTipoCarne(tipoCarne);
        return tipoCarne;
    }

    @Override
    public Hamburguesa construirHamburguesa() {
        return hamburguesa;
    }
}
