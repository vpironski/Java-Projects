import java.util.*;
public class IPHesh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ipInput = scan.nextLine();
        System.out.println(ipHash(ipInput));
    }

    private static String ipHash(String ipString) {
        String[] ipChars = ipString.split("\\.");
        StringBuilder hashIp = new StringBuilder();
        int size = ipChars.length;
        int[] ipInts = new int[size];


        for (int i = 0; i < size; i++) {
            ipInts[i] = Integer.parseInt(ipChars[i]);
        }

        for (int i = 0; i < size; i++) {
            ipInts[i] = ipInts[i] | 123;
            ipInts[i] = ipInts[i] & 65;
            ipInts[i] = ipInts[i] ^ 4453;
            ipInts[i] = ipInts[i] | 1765;
            ipInts[i] = ipInts[i] & 432;
            ipInts[i] = ipInts[i] ^ 543;
        }

        for (int i = 0; i < size; i++) {
            hashIp.append(String.valueOf(ipInts[i]));
        }
        return hashIp.toString();
    }
}