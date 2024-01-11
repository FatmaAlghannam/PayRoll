// import java.util.ArrayList;
// import java.util.Date;
// import java.util.List;

public class Employee {
    private int employeeID;
    private String name;
    private String position;
    private double basicSalary;
    private double bonus;
    private double deductions;
    private double overtimeHours;
    // private List<PaymentRecord> paymentHistory;

    public Employee(int employeeID, String name, String position, double basicSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
        this.overtimeHours = 0;
        this.bonus = 0;
        this.deductions = 0;
        // this.paymentHistory = new ArrayList<>();
        // salary calculateTotalSalary- salary alone;
    }

    // getter-setter
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getovertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double calculateTotalSalary(double deductions, double bonus, double overtimePay) {
        return basicSalary + bonus - deductions + overtimePay;
        // double overtimePay = calculateOvertimePay(1.6);

    }

    // public List<PaymentRecord> getPaymentHistory() {
    // return paymentHistory;
    // }

    // public void setPaymentHistory(List<PaymentRecord> paymentHistory) {
    // this.paymentHistory = paymentHistory;
    // }

    public double calculateOvertimePay(double OvertimeRate) {
        return overtimeHours * OvertimeRate;

        // overtime rate is 1.6 times ^
    }

    // public double calculateTotalSalary() {
    // double overtimePay = calculateOvertimePay(1.6);
    // return basicSalary + bonus - deductions + overtimePay;

    // }
    // //payment history
    // public void addPaymentRecord(double amount , Date paymentDate, String
    // paymentMethod){
    // PaymentRecord= new PaymentRecord(amount , paymentDate, paymentMethod);

}
