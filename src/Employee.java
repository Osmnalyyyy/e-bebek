public class Employee {

    private String name;
    private Double salary;
    private Integer workHours;
    private Integer hireYear;

    public Employee() {
    }

    public Employee(String name, Double salary, Integer workHours, Integer hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    @Override
    public String toString() {
        return
                "Adi: " + name + "\n" +
                        "Maas: " + salary +"\n" +
                        "Calisma Saati: " + workHours +"\n" +
                        "Baslangic Yili: " + hireYear
                ;
    }

    public static double tax(Double salary) {
        double tax = 0;
        if (salary >= 0.0) {
            if (salary == 0.0) {
                //     System.out.println("Maas 0 olamaz");
            } else if (salary > 0 && salary <= 1000) {
                //      System.out.println("Maasin vergisi yok");
                tax = 0;
            } else {
                tax = salary * 3 / 100;
            }
        } else System.out.println("Calisan maasi negatif olamaz");
        return tax;
    }

    public static double bonus(Integer workHours) {
        double bonusUcreti = 0.0;
        if (workHours >= 40) {
            bonusUcreti = (workHours - 40) * 30;
        } else System.out.println("Bonus hesaplanmadı");
        return bonusUcreti;
    }

    public static double raiseSalary(Integer hireYear, Double salary) {
        double zamMiktari = 0;
        if (hireYear < 10) {
            zamMiktari = (salary * 5 / 100);
        } else if (hireYear < 20) {
            zamMiktari = salary * 10 / 100;
        } else {
            zamMiktari = salary * 15 / 100;
        }
        return zamMiktari;
    }







    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }

    public Integer getHireYear() {
        return hireYear;
    }

    public void setHireYear(Integer hireYear) {
        this.hireYear = hireYear;
    }
}



