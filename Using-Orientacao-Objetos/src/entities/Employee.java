package entities;

public class Employee {

    private String office;
    private double salary;
    private double tax;

    public Employee() {
    }

    public Employee(String office, double salary, double tax) {
        this.office = office;
        this.salary = salary;
        this.tax = tax;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double netSalary(){
        return salary - tax;
    }

    public void totalSalary(double percentage){
        salary += salary * percentage / 100.0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "office='" + office + '\'' +
                ", salary=" + String.format("%.2f", netSalary()) +
                '}';
    }
}
