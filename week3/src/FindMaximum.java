import javax.swing.*;

public class FindMaximum {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Please provide 2 numbers!"); return;
        }

        int n0 = Integer.parseInt(args[0]);
        int n1 = Integer.parseInt(args[1]);
        boolean condition = n0 > n1;
        int max = (condition) ? n0 : n1;

        System.out.println(max);
    }
}
