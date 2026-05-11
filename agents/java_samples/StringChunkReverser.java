public class StringChunkReverser {
    public String reverseChunks(
            String s,
            int k
    ) {
        StringBuilder result =
                new StringBuilder();

        for (int i = 0;
             i < s.length();
             i += k) {

            int end =
                    Math.min(i + k, s.length());

            String chunk =
                    s.substring(i, end);

            result.append(
                    new StringBuilder(chunk)
                            .reverse()
            );
        }

        return result.toString();
    }
}