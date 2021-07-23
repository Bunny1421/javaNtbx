public class Range {
    private final String input;

    public Range(String input) {
        this.input = input;
    }

    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }

    public int getStart() {
        if (isStartWithInclude()) return Character.getNumericValue(this.input.charAt(1));
        else return Character.getNumericValue(this.input.charAt(1)+1);
    }

    public boolean isEndWithInclude() {
        return this.input.endsWith("]");
    }

    public int getEnd() {
        if (isEndWithInclude()) return Character.getNumericValue(this.input.charAt(3));
        else return Character.getNumericValue(this.input.charAt(3)-1);
    }
}
