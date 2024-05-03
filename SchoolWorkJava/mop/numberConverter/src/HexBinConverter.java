import java.util.HashMap;

public class HexBinConverter {
    public static String hexBin(String hexValue){

        String binary = "";

        hexValue = hexValue.toUpperCase();

        HashMap<Character, String> hashMap
                = new HashMap<Character, String>();

        hashMap.put('0', "0000");
        hashMap.put('1', "0001");
        hashMap.put('2', "0010");
        hashMap.put('3', "0011");
        hashMap.put('4', "0100");
        hashMap.put('5', "0101");
        hashMap.put('6', "0110");
        hashMap.put('7', "0111");
        hashMap.put('8', "1000");
        hashMap.put('9', "1001");
        hashMap.put('A', "1010");
        hashMap.put('B', "1011");
        hashMap.put('C', "1100");
        hashMap.put('D', "1101");
        hashMap.put('E', "1110");
        hashMap.put('F', "1111");

        int i;
        char ch;

        for (i = 0; i < hexValue.length(); i++) {
            ch = hexValue.charAt(i);

            if (hashMap.containsKey(ch))

                binary += hashMap.get(ch);

            else {
                binary = "Invalid Hexadecimal String";
                return binary;
            }
        }

        return binary;
    }

    public static String binHex(long binary)
    {

        int decimalNumber = 0, i = 0;

        while (binary > 0) {

            decimalNumber += Math.pow(2, i++) * (binary % 10);

            binary /= 10;
        }

        String hexNumber = Integer.toHexString(decimalNumber);

        hexNumber = hexNumber.toUpperCase();

        return hexNumber;
    }


}
