public class Main {
    public static void main(String[] args) {
        JavaFXApp.main (args);

    }
}

interface Icomputation{
    public int compute(int getal1, int getal2);

}

class MultiplyComputation implements Icomputation{

    @Override
    public int compute(int getal1, int getal2) {
        return (getal1 * getal2);
    }
}

class DivideComputation implements Icomputation{
    @Override
    public int compute(int number1, int number2){
        return (number1/number2);
    }
}
