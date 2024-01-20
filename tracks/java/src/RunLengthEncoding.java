public class RunLengthEncoding {

    String encode(String data) {
        if (data.equals("")) {
            return "";
        }

        int count = 1;
        char lastChar = data.charAt(0);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < data.length(); i++) {
            char currentChar = data.charAt(i);
            if (currentChar == lastChar) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(Integer.toString(count));
                }
                sb.append(lastChar);
                lastChar = currentChar;
                count = 1;
            }
        }

        if (count > 1) {
            sb.append(Integer.toString(count));
        }
        sb.append(lastChar);

        return sb.toString();
    }

    public String decode(String data) {
        int runlength = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            if (Character.isDigit(ch)) {
                runlength = runlength * 10 + Character.getNumericValue(ch);
            } else {
                if (runlength == 0) {
                    sb.append(ch);
                } else {
                    for (int j = 0; j < runlength; j++) {
                        sb.append(ch);
                    }
                    runlength = 0;
                }
            }
        }
        return sb.toString();
    }
}
