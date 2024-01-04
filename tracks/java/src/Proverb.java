public class Proverb {
    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {

        if (words.length == 0) {
            return "";
        }
        
        StringBuilder proverb = new StringBuilder();
        
        for (int i = 0; i < words.length - 1; i++) {
            proverb.append(String.format("For want of a %s the %s was lost.%n", words[i], words[i + 1]));
        }
        
        proverb.append(String.format("And all for the want of a %s.", words[0]));
        
        return proverb.toString();
    }

}
