public class Main {
    public static void main(String[] args) {
        
        EagerSamosa sm1 = EagerSamosa.getSamosa();
        System.out.println(sm1.hashCode());

        EagerSamosa sm2 = EagerSamosa.getSamosa();
        System.out.println(sm2.hashCode());
    }
}