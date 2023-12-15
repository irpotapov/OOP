public class InputDigit {
    public static Multiply createMultiply(String input) {
        String[] parts = input.split("/");
        int chislitel = Integer.parseInt(parts[0]);
        int znamenatel = Integer.parseInt(parts[1]);
        return new Multiply(chislitel, znamenatel);
    }
}