package company.thread;

import java.util.Scanner;

class Demo extends Thread {
    public static int amount;
    public static boolean flag;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");
        amount = scan.nextInt();
        Demo thread = new Demo();
        thread.start();
        amount ++;
        if (flag){
            System.out.println("The number is even! ");
        }
        else {
            System.out.println("The number is odd! ");
        }
    }
    public void run() {
        amount+= 2;
        if(amount % 2 == 0){
            flag = true;
        }
    }
}