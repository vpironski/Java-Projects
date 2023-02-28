public class Bitwise {
    public static void AND(){
        System.out.println(10&8);
    }
    public static void OR(){
        System.out.println(10|8);
    }
    public static void XOR(){
        System.out.println(10^8);
    }
    public static void Complement(){
        System.out.println(~10);
    }
    public static void LeftShift(){
        System.out.println(10 >> 8);
    }
    public static void RightShift(){
        System.out.println(10 << 8);
    }

    public static void main(String[] args) {
        AND();
        OR();
        XOR();
        Complement();
        LeftShift();
        RightShift();
    }
}
