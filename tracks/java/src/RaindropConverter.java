public class RaindropConverter {

    StringBuilder rainSounds = new StringBuilder();

    String convert(int number) {
        if (number % 3 == 0) {
            rainSounds.append("Pling");
        }

        if (number % 5 == 0) {
            rainSounds.append("Plang");
        }

        if (number % 7 == 0) {
            rainSounds.append("Plong");
        }

        if (rainSounds.length() == 0) {
            rainSounds.append(number);
        }
        
        return rainSounds.toString();
    }

    public static void main(String[] args) {
        RaindropConverter raindropConverter = new RaindropConverter();
        System.out.println(raindropConverter.convert(45));
    }
}
