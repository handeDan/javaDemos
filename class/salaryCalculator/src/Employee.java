public class Employee {
    //instance variables:
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    //constructor:
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //methods:
    public double tax(){
        if(salary < 1000) {
            return 0;
        }
        return salary*0.03;
    }

    public double bonus(){
        if(workHours > 40) {
            int overWork = workHours - 40;
            return overWork*30;
        }
        return 0;
    }

    public double raiseSalary(){
        int yearsWorked = 2021 - hireYear;
        double increaseRate = 0;

        if (yearsWorked < 10) {
            increaseRate = 0.05;
        } else if (yearsWorked < 20) {
            increaseRate = 0.10;
        } else {
            increaseRate = 0.15;
        }

        return salary * increaseRate;
    }

    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxBonus = salary - tax + bonus;
        double totalSalary = salaryWithTaxBonus + raise;

        return "Adı: " + name + "\n" +
                "Maaşı: " + salary + " TL\n" +
                "Çalışma Saati: " + workHours + "\n" +
                "Başlangıç Yılı: " + hireYear + "\n" +
                "Vergi: " + tax + " TL\n" +
                "Bonus: " + bonus + " TL\n" +
                "Maaş Artışı: " + raise + " TL\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + salaryWithTaxBonus + " TL\n" +
                "Toplam Maaş: " + totalSalary + " TL";
    }
}
