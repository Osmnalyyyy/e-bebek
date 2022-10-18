public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Kemal", 2000.0, 45, 1985);
        Double tax = Employee.tax(employee.getSalary());
        Double raiseSalary = Employee.raiseSalary(employee.getHireYear(), employee.getSalary());
        Double bonus=Employee.bonus(employee.getWorkHours());


        String yaz="Vergi: "+tax+"\n"+
                "Bonus: "+bonus+"\n"+
                "Maas Artisi: "+raiseSalary+"\n"+
                "Vergi ve Bonuslar ile Birlikte Maas: "+(employee.getSalary()+bonus-tax)+
                "\n"+"Toplam Maas: "+(employee.getSalary()+bonus-tax+raiseSalary);

        System.out.println(employee);
        System.out.println(yaz);

    }
}