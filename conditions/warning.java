import java.util.Scanner;

class Warning {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type your number: ");
        int scan = in.nextInt();
        showWarning(scan);
        in.close();
    }
     static void showWarning(int numOfWarnings) {
         int i = 1;
         while(i <= numOfWarnings){
            System.out.println("Warning!");
            i++;
        }
    }
}