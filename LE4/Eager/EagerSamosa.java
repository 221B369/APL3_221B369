public class EagerSamosa {
    
    private static final EagerSamosa samosa = new EagerSamosa();
    
    private EagerSamosa() {}
    
    public static EagerSamosa getSamosa() {
        return samosa;
    }
}