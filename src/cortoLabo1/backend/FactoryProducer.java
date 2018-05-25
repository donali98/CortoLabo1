package cortoLabo1.backend;

import cortoLabo1.backend.conversor.ConversorFactory;
import cortoLabo1.backend.operacion.OperationFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(TipoOp type){
        switch (type){
            case ARITMETICO:
                return new OperationFactory();
            case BINARIO:
                return new ConversorFactory();
                default:return null;
        }
    }


}
