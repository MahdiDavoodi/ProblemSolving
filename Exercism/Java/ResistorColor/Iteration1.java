import java.util.Arrays;

class ResistorColor {
    int colorCode(String color) {
        return Arrays.stream(colors()).toList().indexOf(color);
    }

    String[] colors() {
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
/*
 * Iteration 1 - My way.
 * Instead of using maps or switch cases, I've used an array.
 * IMO, this is the best solution for passing the tests, but in production, this code is weak.
 */