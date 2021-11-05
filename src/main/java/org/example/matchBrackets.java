package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class matchBrackets {

    public static HashMap<Character, Character> getBracketPairs() {
        HashMap<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put('[', ']');
        bracketPairs.put('{', '}');
        bracketPairs.put('(', ')');
        return bracketPairs;
    }

    private static String cleanInput(String input) {
        return input.replaceAll("[^{}()\\[\\]]", "");
    }

    public static int validateString(String toValidate) {
        if (toValidate.equals("")) {
            return 0;
        }

        HashMap<Character, Character> bracketPairs = getBracketPairs();
        char[] characters = cleanInput(toValidate).toCharArray();
        ArrayList<Character> toFind = new ArrayList<>();

        for (char character : characters) {
            int lastIndex = toFind.size() - 1;

            if (lastIndex < 0) {
                toFind.add(character);
                continue;
            }

            char lastBracket = toFind.get(lastIndex);

            if (!bracketPairs.containsKey(lastBracket)) {
                break;
            }

            if (bracketPairs.get(lastBracket) == character) {
                toFind.remove(lastIndex);
            } else {
                toFind.add(character);
            }

        }

        return toFind.size() == 0 ? 1 : 0;
    }
}
