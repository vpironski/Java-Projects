public class BitwiseCalculations {
    public static void main(String[] args) {
        // A
        int result_a1 = 34 | 18;
        int result_a2 = 100 | 30;
        int result_a3 = 127 | 1;

        // B
        int result_b1 = 12 & 55;
        int result_b2 = 20 & 87;
        int result_b3 = 9 & 90;

        // C
        int result_c1 = 10 ^ 15;
        int result_c2 = 39 ^ 21;
        int result_c3 = 46 ^ 12;

        // D
        int result_d1 = ~101;
        int result_d2 = ~93;
        int result_d3 = ~64;

        // E
        int result_e1 = 101 >> 3;
        int result_e2 = 34 << 2;
        int result_e3 = 8 << 1;
        int result_e4 = 20 >> 4;

        // Displaying results
        System.out.println("A: " + result_a1 + " " + result_a2 + " " + result_a3);
        System.out.println("B: " + result_b1 + " " + result_b2 + " " + result_b3);
        System.out.println("C: " + result_c1 + " " + result_c2 + " " + result_c3);
        System.out.println("D: " + result_d1 + " " + result_d2 + " " + result_d3);
        System.out.println("E: " + result_e1 + " " + result_e2 + " " + result_e3 + " " + result_e4);
    }
}


