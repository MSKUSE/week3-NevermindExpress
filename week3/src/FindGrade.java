public class FindGrade{

    public static void main(String[] args){

        //Get the score from the user as a file parameter
        //Calculate the grade based on the score
        //Print the grade to the console
        // 90 - 100 -> A
        // 80 - 89 -> B
        // 70 - 79 -> C
        // 60 - 69 -> D
        // 0 - 59 -> F
        if (args.length == 0) {
            System.out.println("Please provide a number!"); return;
        }

        int score = Integer.parseInt(args[0]);

        if (score > 100) {
            System.out.println("Invalid value.");
        } else if (score >= 90){
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else if (score >= 0) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid value.");
        }


    }



}