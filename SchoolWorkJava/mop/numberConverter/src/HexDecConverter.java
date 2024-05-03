public class HexDecConverter {
    public static int hexDec(String hexValue) {
        int len = hexValue.length();
        int base = 1;
        int decValue = 0;

        for (int i = len - 1; i >= 0; i--) {
            if (hexValue.charAt(i) >= '0'
                    && hexValue.charAt(i) <= '9') {
                decValue += (hexValue.charAt(i) - 48) * base;

                base = base * 16;
            }

            else if (hexValue.charAt(i) >= 'A'
                    && hexValue.charAt(i) <= 'F') {
                decValue += (hexValue.charAt(i) - 55) * base;

                base = base * 16;
            }
        }
        return decValue;
    }

    public static String decHex(int decimal) {
        int rem;
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(decimal>0)
        {
            rem=decimal%16;
            hex=hexchars[rem]+hex;
            decimal=decimal/16;
        }
        return hex;
    }

}

