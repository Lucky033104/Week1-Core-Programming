package Day3.Level2;
import java.util.Scanner;

public class YoungestTallestFriendFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] friends = {"Amar", "Akbar", "Anthony"};
        for (int i = 0; i < 3; i++){
            System.out.println("Enter age of " + friends[i] + ": ");
            ages[i] = input.nextInt();
            System.out.println("Enter height of " + friends[i] + ": ");
            heights[i] = input.nextDouble();
        }
        int minimumAge = ages[0];
        String youngest = friends[0];
        for (int i = 1; i < 3; i++){
            if(ages[i] < minimumAge){
                minimumAge = ages[i];
                youngest = friends[i];
            }
            else if (minimumAge == ages[i]){
                youngest += " & " + friends[i];
            }
        }
        double maximumHeight = heights[0];
        String tallest = friends[0];
        for (int i = 1; i < 3; i++){
            if(heights[i] > maximumHeight){
                maximumHeight = heights[i];
                tallest = friends[i];
            }
            else if(heights[i] == maximumHeight){
                tallest += " & " + friends[i];
            }
        }
        System.out.println("Youngest: " + youngest + "\nTallest: " +
                tallest);
        input.close();
    }
}
