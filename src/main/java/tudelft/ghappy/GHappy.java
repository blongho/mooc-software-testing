package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        if (str.isEmpty())
            return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (str.charAt(i - 1) == 'g') {
                    continue;
                }
                if (i + 1 < str.length() && str.charAt(i + 1) == 'g') {
                    continue;
                }
                return false;
            }
        }

        return true;

    }
}
