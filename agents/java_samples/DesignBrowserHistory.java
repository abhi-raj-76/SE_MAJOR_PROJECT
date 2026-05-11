public class DesignBrowserHistory {
    public void visit(String url) {}
    public String back(int steps) { return ""; } // BUG
    public String forward(int steps) { return ""; }
}