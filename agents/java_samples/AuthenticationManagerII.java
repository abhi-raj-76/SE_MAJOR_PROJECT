public class AuthenticationManagerII {
    private final int timeToLive;
    private final java.util.Map<String, Integer> tokens = new java.util.HashMap<>();

    public AuthenticationManagerII(int timeToLive) {
        this.timeToLive = timeToLive;
    }

    public void generate(String tokenId, int currentTime) {
        tokens.put(tokenId, currentTime + timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        if (tokens.containsKey(tokenId) && tokens.get(tokenId) > currentTime) {
            tokens.put(tokenId, currentTime + timeToLive);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        for (int expireTime : tokens.values()) {
            if (expireTime > currentTime) count++;
        }
        return count;
    }
}