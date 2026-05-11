public class VowelRemover {
    public String remove(String s) {
        return s.replaceAll("[aeiouAEIOU]", "");
    }
}