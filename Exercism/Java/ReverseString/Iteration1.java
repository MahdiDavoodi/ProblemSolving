class ReverseString {
    String reverse(String inputString) {
        StringBuilder result = new StringBuilder(inputString);
        return result.reverse().toString();
    }
}
/*
 * Iteration 1 - My way
 * Using StringBuilder, you can easily reverse a string!
 * */