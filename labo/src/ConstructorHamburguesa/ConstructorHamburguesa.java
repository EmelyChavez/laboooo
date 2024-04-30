package ConstructorHamburguesa;

import Hamburguesa.Hamburguesa;

public interface ConstructorHamburguesa {
    void lechuga(boolean agregar);
    void tomate(boolean agregar);
    void cebolla(boolean agregar);
    void queso(boolean agregar);
    String tipoCarne(String tipoCarne);
    Hamburguesa construirHamburguesa();
}
