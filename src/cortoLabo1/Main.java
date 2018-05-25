package cortoLabo1;

import cortoLabo1.backend.AbstractFactory;
import cortoLabo1.frontend.Ventana;

public class Main {
    public static void main(String [] args){

        AbstractFactory factory;
        new Ventana().setVisible(true);

    }
}
