import java.util.HashMap;
import java.util.Map;

public class OopsBannerApp{

    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patternMap = initializePatterns();

        printBanner("OOPS", patternMap);
    }

    public static Map<Character, CharacterPattern> initializePatterns() {

        Map<Character, CharacterPattern> map = new HashMap<>();

        map.put('O', new CharacterPattern('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        }));

        map.put('P', new CharacterPattern('P', new String[]{
                " ******* ",
                " *     * ",
                " *     * ",
                " ******* ",
                " *       ",
                " *       ",
                " *       "
        }));

        map.put('S', new CharacterPattern('S', new String[]{
                " ******* ",
                " *       ",
                " *       ",
                " ******* ",
                "       * ",
                "       * ",
                " ******* "
        }));

        return map;
    }

    public static void printBanner(String text, Map<Character, CharacterPattern> map) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : text.toCharArray()) {

                CharacterPattern cp = map.get(ch);

                if (cp != null) {
                    lineBuilder.append(cp.getPattern()[row]).append("   ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }
}