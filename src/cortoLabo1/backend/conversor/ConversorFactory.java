package cortoLabo1.backend.conversor;

import cortoLabo1.backend.AbstractFactory;
import cortoLabo1.backend.OpDisponibles;

public class ConversorFactory implements AbstractFactory {

    @Override
    public float getOperacion(OpDisponibles op, float a, float b) {
        return 0;
    }

    @Override
    public String getConversor(int a) {
        return Integer.toBinaryString(a);
    }
}
