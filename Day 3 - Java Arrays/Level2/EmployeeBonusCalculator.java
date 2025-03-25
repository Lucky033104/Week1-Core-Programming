package Day3.Level2;
import java.util.Scanner;
public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Employees = 10;
        double[] salary = new double[Employees];
        double[] YearofSer = new double[Employees];
        double[] newSalary = new double[Employees];
        double[] bonus = new double[Employees];
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        for (int i = 0; i < Employees; i++){
            System.out.println("Salary: ");
            salary[i] = input.nextDouble();
            System.out.println("Experience: ");
            YearofSer[i] = input.nextDouble();
            if (salary[i] < 0 || YearofSer[i] < 0){
                System.out.println("Invalid, Enter again!");
                i--;
            }
        }
        for (int i = 0; i < Employees; i++){
            double bonusPercentage = (YearofSer[i] > 5) ? 0.05 : 0.02;
            bonus[i] = salary[i] * bonusPercentage;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Employee bonus and new salary: ");
        for(int i = 0; i < Employees; i++){
            System.out.println("Employee: " + (i + 1) + " | Old Salary = "
                    + salary[i] + " | Bonus = " + bonus[i] + " | New Salary = " + newSalary[i]);
        }
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        input.close();
    }
}