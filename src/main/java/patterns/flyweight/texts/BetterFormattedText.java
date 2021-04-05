package patterns.flyweight.texts;

import java.util.ArrayList;
import java.util.List;

class BetterFormattedText {
    private String planeText;
    private List<TextRange> formatting = new ArrayList<>();

    public BetterFormattedText(String planeText) {
        this.planeText = planeText;
    }

    public TextRange getRange(int start, int end) {
        TextRange textRange = new TextRange(start, end);
        formatting.add(textRange);
        return textRange;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < planeText.length(); ++i) {
            char c = planeText.charAt(i);
            for (TextRange range : formatting) {
                if (range.covers(i) && range.capitalize) {
                    c = Character.toUpperCase(c);
                }
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static class TextRange {
        public int start, end;
        public boolean capitalize, bold, italic;

        public TextRange(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean covers(int position) {
            return position >= start && position <= end;
        }
    }
}
