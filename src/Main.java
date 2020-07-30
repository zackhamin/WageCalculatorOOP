public class Main {

    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHouse = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary,extraHouse,hourlyRate);
        System.out.println(wage);
    }

    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate){
        return baseSalary + (extraHours * hourlyRate);
    }
}
