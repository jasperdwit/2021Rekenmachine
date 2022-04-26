public class Main {
    public static void main(String[] args) {
        JavaFXApp.main (args);

    }
}

interface Icomputation{
    public int compute(int getal1, int getal2);

}
class AddComputation implements Icomputation {
    @Override
    public int compute(int nummer1, int nummer2) {
        return nummer1+nummer2;
    }
}