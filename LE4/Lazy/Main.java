public class Main {
    public static void main(String[] args) {

        LazySamosa sm1 = LazySamosa.getSamosa();
        System.out.println(sm1.hashCode());

        LazySamosa sm2 = LazySamosa.getSamosa();
        System.out.println(sm2.hashCode());
    }
}