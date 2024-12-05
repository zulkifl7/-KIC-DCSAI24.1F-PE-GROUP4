package senario1;

class Employee {

    // Fields
    private int id;
    private String name;
    private String department;
    private double salary;

    // Getter and Setter for ID with validation
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.err.println("Invalid ID! ID must be a positive integer.");
        }
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Setter for Salary with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.err.println("Invalid Value for Salary! Salary cannot be less than zero.");
        }
    }

    // Method to calculate bonus
    public double calculateBonus() {
        return salary * 0.1; // Bonus is 10% of the salary
    }
}

class EmployeeManagementSystem {

    public static void main(String[] args) {
        Employee emp1 = new Employee();

        // Setting employee details
        emp1.setId(1);
        emp1.setName("Kasun");
        emp1.setDepartment("IT");
        emp1.setSalary(50000);

        // Displaying employee details and calculated bonus
        System.out.println("Employee ID: " + emp1.getId());
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Employee Department: " + emp1.getDepartment());
        System.out.println("Calculated Bonus: " + emp1.calculateBonus());
    }
}
