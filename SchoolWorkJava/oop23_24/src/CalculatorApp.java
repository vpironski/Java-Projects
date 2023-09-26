import java.util.Scanner;

class CalculatorApp {

    public static void cv(){
        String[] info = new String[6];
        String input;
        Scanner scan = new Scanner(System.in);

        int counter = 0;
        System.out.println("Zdr kp, intruduce yourself: ");

        System.out.print("Kyv ti e prqkora(name): ");
        input = scan.nextLine();
        info[counter] = input;
        counter++;

        System.out.print("Koj nabor si(age): ");
        input = scan.nextLine();
        info[counter] = input;
        counter++;

        System.out.print("Ot kadq si(adress): ");
        input = scan.nextLine();
        info[counter] = input;
        counter++;

        System.out.print("Kadq da ta tyrsq (email ili фацебук): ");
        input = scan.nextLine();
        info[counter] = input;
        counter++;

        System.out.print("Kyde si zagubil 12 godini (school): ");
        input = scan.nextLine();
        info[counter] = input;
        counter++;

        System.out.print("Ko si bachkal (experience): ");
        input = scan.nextLine();
        info[counter] = input;
        counter++;

        for (int i = 0; i < info.length; i++) {
            System.out.print(info[i] + " ");
        }
    }
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         boolean flag = true;
         double a = 0.00;
         double b = 0.00;
         while(flag){
             scan.nextLine();
             System.out.println("Choose operation('+''-''*''/') or END: ");
             String operation = scan.nextLine();
             System.out.println("Input a: ");
             try{
                 a = scan.nextDouble();

             }
             catch (Exception e){
                 a = 0;
                 b = 0;
                 operation = " ";
                 System.out.println("Error: invalid input");
             }

             System.out.println("Input b: ");
             try{
                 b = scan.nextDouble();
             }
             catch (Exception e){
                 a = 0;
                 b = 0;
                 operation = " ";
                 System.out.println("Error: invalid input");
             }

             switch (operation){
                 case "+":
                     Calculator.addition(a,b);
                     break;
                 case "-":
                     Calculator.subtraction(a,b);
                     break;
                 case "*":
                     Calculator.multiplication(a,b);
                     break;
                 case "/":
                     Calculator.division(a,b);
                     break;
                 case "END":
                     flag = false;
                     break;
                 case " ":
                     break;
                 default:
                     System.out.println("Error: Wrong or incorrect operation");
             }
         }

    }
}