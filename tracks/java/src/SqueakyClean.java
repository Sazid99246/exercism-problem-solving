public class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder newStr = new StringBuilder();
        boolean toUpper = false;
        for (int i = 0;i<identifier.length();i++){
            char character = identifier.charAt(i);
            if (Character.isSpaceChar(character)){
                newStr.append('_');
            } else if(Character.isISOControl(character)){
                newStr.append("CTRL");
            } else if(character == '-'){
                toUpper = true;
            } else if(Character.isLetter(character)==false){
                continue;
            } else if(character >= '\u03B1' && character <= '\u03C9'){
                continue;
            } else{
                if (toUpper){
                    newStr.append(Character.toUpperCase(character));
                    toUpper = false;
                }else{
                    newStr.append(character);
                }
            }
        }
        return newStr.toString();
    }
}