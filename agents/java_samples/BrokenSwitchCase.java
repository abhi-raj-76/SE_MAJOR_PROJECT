public class BrokenSwitchCase {
    public String getDay(int n) {
        switch (n) {
            case 1
                return "Monday";
            default:
                return "Invalid";
        }
    }
}