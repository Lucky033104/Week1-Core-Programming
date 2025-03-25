public class PenDistributionCalculator {
    public static void main(String[] args) {
        int Pens = 14;
        int Students = 3;
        int Reminder = Pens % Students;
        int Divide = Pens / Students;
        System.out.println("The Pen Per Student is " + Divide +" and the remaining pen not distributed is "+ Reminder);
    }
}
