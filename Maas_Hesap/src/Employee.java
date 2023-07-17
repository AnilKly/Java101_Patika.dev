import java.time.LocalDate;
import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        int extraHours = Math.max(workHours - 40, 0);
        return extraHours * 30;
    }

    public double raiseSalary() {
        int yearsWorked = LocalDate.now().getYear() - hireYear;
        double raisePercentage;

        if (yearsWorked < 10) {
            raisePercentage = 0.05;
        } else if (yearsWorked < 20) {
            raisePercentage = 0.1;
        } else {
            raisePercentage = 0.15;
        }

        return salary * raisePercentage;
    }

    @Override
    public String toString() {
        double totalSalary = salary + bonus() - tax() + raiseSalary();

        return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax() +
                "\nBonus: " + bonus() +
                "\nMaaş Artışı: " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş: " + totalSalary +
                "\nToplam Maaş: " + (salary + bonus());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Çalışanın adı ve soyadı: ");
        String name = scanner.nextLine();

        System.out.print("Çalışanın maaşı: ");
        double salary = scanner.nextDouble();

        System.out.print("Haftalık çalışma saati: ");
        int workHours = scanner.nextInt();

        System.out.print("İşe başlangıç yılı: ");
        int hireYear = scanner.nextInt();

        Employee employee = new Employee(name, salary, workHours, hireYear);
        System.out.println(employee.toString());

        scanner.close();
    }
}
