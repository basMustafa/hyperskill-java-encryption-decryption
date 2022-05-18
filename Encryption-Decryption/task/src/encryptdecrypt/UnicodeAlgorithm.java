package encryptdecrypt;

public class UnicodeAlgorithm implements Algorithm {

    @Override
    public String cipher(String mode, String text, int key) {
        char[] charArray = text.toCharArray();
        if ("enc".equals(mode)) {
            for (int i = 0; i < charArray.length; i++) {
                charArray[i] = (char) (charArray[i] + key);
            }
        } else {
            for (int i = 0; i < charArray.length; i++) {
                charArray[i] = (char) (charArray[i] - key);
            }
        }
        return String.valueOf(charArray);

    }
}
