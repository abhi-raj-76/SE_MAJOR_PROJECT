public class DesignBitsetII {
    private final boolean[] bits;
    private int count = 0;
    private boolean flipped = false;

    public DesignBitsetII(int size) {
        bits = new boolean[size];
    }

    public void fix(int idx) {
        if (!bits[idx]) count++;
        bits[idx] = true;
    }

    public void unfix(int idx) {
        if (bits[idx]) count--;
        bits[idx] = false;
    }

    public void flip() {
        flipped = !flipped;
        count = bits.length - count;
    }

    public boolean all() {
        return count == bits.length;
    }

    public boolean one() {
        return count > 0;
    }

    public int count() {
        return count;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (boolean b : bits) sb.append(b ? '1' : '0');
        return sb.toString();
    }
}