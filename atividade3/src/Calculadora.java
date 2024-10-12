public class Calculadora {
    public float adicao(float x, float y) {
        return x + y;
    }
    public float subtracao(float x, float y) {
        return x - y;
    }
    public float multiplicacao(float x, float y) {
        return x * y;
    }
    public float divisao(float x, float y) {
        if (y == 0) {
            return 0.0f;
        }
        return x / y;
    }
}