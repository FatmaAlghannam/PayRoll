public class App {
    public static void main(String[] args) throws Exception {
        Employee employment = new Employee(324, "FATMA", "IT-DEVELOPER", 4000);
        System.out.println("Employee ID:" + employment.getEmployeeID());
        System.out.println("Name:" + employment.getName());
        System.out.println(" Position:" + employment.getPosition());
        System.out.println("Basic Salary:" + employment.getBasicSalary());

        employment.setName("FATMA");
        employment.setPosition("IT");

        System.out.println("\nUpdated Details:");
        System.out.println("Name :" + employment.getName());
        System.out.println("Position:" + employment.getPosition());

        double bonus = 200.0;
        double deductions = 1000.0;
        double totalSalary = employment.calculateTotalSalary(deductions, bonus, deductions);
        System.out.println("\nTotal salary with bonus and the deduction : " + totalSalary);
        // System.out.println("\nPayment History :" + employment.getPaymentHistory);

    }
}
