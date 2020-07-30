public class Main {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(23000);
        employee.getBaseSalary();
        employee.setHourlyRate(20);
        employee.getHourlyRate();
        int wage = employee.calculateWage(200);

        System.out.println(wage);
        System.out.println(employee.getBaseSalary());
        System.out.println(employee.getHourlyRate());
    }

}
