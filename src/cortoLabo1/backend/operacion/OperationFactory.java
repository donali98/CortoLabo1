package cortoLabo1.backend.operacion;

import cortoLabo1.backend.AbstractFactory;
import cortoLabo1.backend.OpDisponibles;

public class OperationFactory implements AbstractFactory {


    @Override
    public float getOperacion(OpDisponibles op, float a, float b) {
        switch (op){
            case SUMAR:
                return Operacion.sumar(a,b);
            case RESTAR:
                return Operacion.restar(a,b);
            case DIVIDIR:
                return Operacion.dividir(a,b);
            case MULTIPLICAR:
                return Operacion.multiplicar(a,b);
                default:
                    return 0;
        }
    }

    @Override
    public String getConversor( int a) {
        return null;
    }
}
