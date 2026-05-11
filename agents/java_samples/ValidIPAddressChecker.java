public class ValidIPAddressChecker {
    public static String validIPAddress(String queryIP) {
        if (queryIP.contains(".")) {
            String[] parts = queryIP.split("\\.");
            if (parts.length != 4) return "Neither";
            for (String part : parts) {
                if (part.isEmpty() || part.length() > 3 || (part.startsWith("0") && part.length() > 1)) return "Neither";
                try {
                    int val = Integer.parseInt(part);
                    if (val < 0 || val > 255) return "Neither";
                } catch (Exception e) {
                    return "Neither";
                }
            }
            return "IPv4";
        } else if (queryIP.contains(":")) {
            // Simplified for IPv6
            String[] parts = queryIP.split(":");
            if (parts.length != 8) return "Neither";
            return "IPv6";
        }
        return "Neither";
    }
}