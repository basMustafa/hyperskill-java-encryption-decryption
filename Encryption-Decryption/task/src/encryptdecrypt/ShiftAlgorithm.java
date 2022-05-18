package encryptdecrypt;

public class ShiftAlgorithm implements Algorithm {


    @Override
    public String cipher(String mode, String text, int key) {
        char[] charArray = text.toCharArray();
        if ("enc".equals(mode)) {

            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] < 97 || charArray[i] > 122)
                    continue;
                if (charArray[i] >= 122 - key) {
                    charArray[i] = (char) (charArray[i] + key - 26);
                } else {
                    charArray[i] = (char) (charArray[i] + key);
                }
            }
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] < 65 || charArray[i] > 90)
                    continue;
                if (charArray[i] >= 90 - key) {
                    charArray[i] = (char) (charArray[i] + key - 26);
                } else {
                    charArray[i] = (char) (charArray[i] + key);
                }
            }
        } else {
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] < 97 || charArray[i] > 122)
                    continue;
                if (charArray[i] < 97 + key) {
                    charArray[i] = (char) (charArray[i] - key + 26);
                } else {
                    charArray[i] = (char) (charArray[i] - key);
                }
            }
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] < 65 || charArray[i] > 90)
                    continue;
                if (charArray[i] < 65 + key) {
                    charArray[i] = (char) (charArray[i] - key + 26);
                } else {
                    charArray[i] = (char) (charArray[i] - key);
                }
            }
        }
        return String.valueOf(charArray);
    }
}
