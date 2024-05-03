public class ConverterTest {
    public static void main(String[] args) {
        String[] hexArr = new String[]{"3F", "AA", "14", "A", "E"};
        int[] decArr = {63,170,20,10,14};
        long[] binArr = new long[]{1010,0,1,1011,100};
        for (String hex: hexArr){
            System.out.println(HexDecConverter.hexDec(hex));
        }
        System.out.println("######################");

        for(int num:decArr){
            System.out.println(HexDecConverter.decHex(num));
        }
        System.out.println("######################");

        for(long bin:binArr){
            System.out.println(HexBinConverter.binHex(bin));
        }

        System.out.println("######################");

        for(String hex:hexArr){
            System.out.println(HexBinConverter.hexBin(hex));
        }


    }
}