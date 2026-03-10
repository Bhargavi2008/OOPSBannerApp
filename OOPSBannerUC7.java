 /**
 * OOPS Banner Application
 * Demonstrates storing character patterns using a class
 * and printing banner text using object mappings.
 */
public class OOPSBannerUC7 {

    /**
     * Inner Static Class to store character and its banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character character to store
         * @param pattern 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates CharacterPatternMap objects for O, P, S and space
     * @return array of CharacterPatternMap objects
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
                "  ***  ",
                " ** ** ",
                "**   **",
                "**   **",
                "**   **",
                " ** ** ",
                "  ***  "
        };

        String[] pPattern = {
                "*****  ",
                "**  ** ",
                "**  ** ",
                "*****  ",
                "**     ",
                "**     ",
                "**     "
        };

        String[] sPattern = {
                " ***** ",
                "**     ",
                "**     ",
                " ****  ",
                "     **",
                "     **",
                " ***** "
        };

        String[] spacePattern = {
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        };

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        charMaps[0] = new CharacterPatternMap('O', oPattern);
        charMaps[1] = new CharacterPatternMap('P', pPattern);
        charMaps[2] = new CharacterPatternMap('S', sPattern);
        charMaps[3] = new CharacterPatternMap(' ', spacePattern);

        return charMaps;
    }

    /**
     * Retrieves pattern for a given character
     * @param ch character to find
     * @param charMaps array of pattern maps
     * @return pattern array
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return null;
    }

    /**
     * Prints banner message
     * @param message message to print
     * @param charMaps pattern map
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int bannerHeight = 7;

        for (int i = 0; i < bannerHeight; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, charMaps);

                if (pattern != null) {
                    lineBuilder.append(pattern[i]).append(" ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}
