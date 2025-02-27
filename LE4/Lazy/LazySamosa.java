public class LazySamosa {

    private static LazySamosa samosa;

    private LazySamosa() {}

    public synchronized static LazySamosa getSamosa() {
        if (samosa == null) {
            samosa = new LazySamosa();
        }
        return samosa;
    }
}