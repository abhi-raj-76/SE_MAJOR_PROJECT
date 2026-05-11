public class EncodeAndDecodeTinyURL {
    private final java.util.Map<String, String> map = new java.util.HashMap<>();
    private int counter = 0;

    public String encode(String longUrl) {
        String shortUrl = "http://tiny.url/" + counter++;
        map.put(shortUrl, longUrl);
        return shortUrl;
    }

    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}