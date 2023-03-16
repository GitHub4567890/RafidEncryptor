public class Encryptor {
    /** A two-dimensional array of single-character strings, instantiated in the constructor */
    private String[][] letterBlock;

    /** The number of rows of letterBlock, set by the constructor */
    private int numRows;

    /** The number of columns of letterBlock, set by the constructor */
    private int numCols;

    /** Constructor*/
    public Encryptor(int r, int c) {
        letterBlock = new String[r][c];
        numRows = r;
        numCols = c;
    }

    public String[][] getLetterBlock() {
        return letterBlock;
    }

    /** Places a string into letterBlock in row-major order.
     *
     *   @param str  the string to be processed
     *
     *   Postcondition:
     *     if str.length() < numRows * numCols, "A" in each unfilled cell
     *     if str.length() > numRows * numCols, trailing characters are ignored
     */
    public void fillBlock(String str) {
        int count = 0;
        for (int i = 0; i <= letterBlock.length - 1; i++) {
            for (int c = 0; c <= letterBlock[0].length - 1; c++) {
                if (count <= str.length() - 1) {
                    letterBlock[i][c] = str.substring(count, count + 1);
                    count++;
                } else {
                    letterBlock[i][c] = "A";
                }
            }
        }
    }

    /** Extracts encrypted string from letterBlock in column-major order.
     *
     *   Precondition: letterBlock has been filled
     *
     *   @return the encrypted string from letterBlock
     */
    public String encryptBlock() {
        String result = "";
        for (int i = 0; i <= letterBlock[0].length - 1; i++) {
            for (int c = 0; c <= letterBlock.length - 1; c++) {
                result += letterBlock[c][i];
            }
        }
        return result;
    }

    /** Encrypts a message.
     *
     *  @param message the string to be encrypted
     *
     *  @return the encrypted message; if message is the empty string, returns the empty string
     */
    public String encryptMessage(String message) {
        int spaces = numCols * numRows;
        String result = "";
        String msgTemp = message;
        while (msgTemp.length() > spaces) {
            fillBlock(msgTemp);
            msgTemp = msgTemp.substring(spaces);
            result += encryptBlock();
        }
        fillBlock(msgTemp);
        result += encryptBlock();
        return result;
    }

    /**  Decrypts an encrypted message. All filler 'A's that may have been
     *   added during encryption will be removed, so this assumes that the
     *   original message (BEFORE it was encrypted) did NOT end in a capital A!
     *
     *   NOTE! When you are decrypting an encrypted message,
     *         be sure that you have initialized your Encryptor object
     *         with the same row/column used to encrypted the message! (i.e.
     *         the “encryption key” that is necessary for successful decryption)
     *         This is outlined in the precondition below.
     *
     *   Precondition: the Encryptor object being used for decryption has been
     *                 initialized with the same number of rows and columns
     *                 as was used for the Encryptor object used for encryption.
     *
     *   @param encryptedMessage  the encrypted message to decrypt
     *
     *   @return  the decrypted, original message (which had been encrypted)
     *
     *   TIP: You are encouraged to create other helper methods as you see fit
     *        (e.g. a method to decrypt each section of the decrypted message,
     *         similar to how encryptBlock was used)
     */
    public String decryptMessage(String encryptedMessage) {
        int count = 0;
        int spaces = numCols * numRows;
        String result = "";
        String msgTemp = encryptedMessage;
        boolean cont = false;
        while (!cont) {
            for (int i = 0; i <= letterBlock[0].length - 1; i++) {
                for (int c = 0; c <= letterBlock.length - 1; c++) {
                    if (count <= msgTemp.length() - 1) {
                        letterBlock[c][i] = msgTemp.substring(count, count + 1);
                        count++;
                    }
                    if (letterBlock[c][i].equals("A") && msgTemp.substring(spaces).length() == 0) {
                        letterBlock[c][i] = "";
                    }
                }
            }
            count = 0;
            for (int i = 0; i <= letterBlock.length - 1 ; i++) {
                for (int c = 0; c <= letterBlock[i].length - 1; c++) {
                    result += letterBlock[i][c];
                }
            }
            msgTemp = msgTemp.substring(spaces);
            if (msgTemp.length() == 0) {
                cont = true;
            }
        }
        return result;
    }
}