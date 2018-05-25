package cortoLabo1.backend;

import cortoLabo1.backend.OpDisponibles;

public interface AbstractFactory {

     float getOperacion(OpDisponibles op, float a, float b);
     String getConversor(int a);

}
