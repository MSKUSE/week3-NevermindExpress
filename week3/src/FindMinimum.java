public class FindMinimum {
    public static void main(String[] args) {
        if(args.length < 3) {
            System.out.println("Please provide 3 parameters."); return;
        }

        int n0 = Integer.parseInt(args[0]);
        int n1 = Integer.parseInt(args[1]);
        int n2 = Integer.parseInt(args[2]);
        boolean cond = n0 < n1;
        boolean cond2 = (cond) ? n2 < n0 : n2 < n1;
        int min = (cond2) ? n2 : ((cond) ? n0 : n1);
        System.out.println(min);
    }
}
