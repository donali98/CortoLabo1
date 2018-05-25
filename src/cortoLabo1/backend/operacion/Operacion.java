package cortoLabo1.backend.operacion;

public interface Operacion {
    static float sumar(float a, float b){
        return a + b;
    }
    static float restar(float a, float b){
        return a - b;
    }
    static float multiplicar(float a, float b){
        return a * b;
    }
    static float dividir(float a, float b){
        return a/b;
    }
}
