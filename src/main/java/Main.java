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