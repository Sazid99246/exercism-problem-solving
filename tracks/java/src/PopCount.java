public class PopCount {
    public int eggCount(int number) {
        int eggs = 0;
        
        char[] binary = Integer.toBinaryString(number).toCharArray();

        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == '1') {
                eggs++;
            }
        }

        return eggs;
    }
}
