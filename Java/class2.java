

// class student{
//     String name ;
//     void display(){
//         System.out.println("Name : "+name);
//     }
// }

// public class class2 {
//     public static void main(String[]args){

// USE OF OBJECTS

        // student s1 = new student();
        // s1.name = "prajwal";
        // s1.display();


//     }
    
// }

// Encapuslation

// class employee{
//     private int salary;

//     public void setSalary(int s){
//         if(s>0){
//             salary = s;
//         }
//         else{
//             System.out.println("Enter valid salary");
//         }
//     }
//     public int getSalary(){
//         return salary;
//     }

// }

// public class class2 {
//     public static void main(String[] args) {
//         employee e = new employee();    
//         e.setSalary(100000);
//         System.out.println("your salary is : "+ e.getSalary());
        
//     }
// }

// ABSTRACTION


// abstract class Calculator {
//     int a;
//     int b;

//     Calculator(int a, int b) {
//         this.a = a;
//         this.b = b;
//     }

//     abstract int add();
//     abstract int sub();
//     abstract int mul();
//     abstract int div();
// }

// class Operations extends Calculator {
//     Operations(int a, int b) {
//         super(a, b);
//     }

//     int add() {
//         return a + b;
//     }
//     int sub() {
//         return a - b;
//     }
//     int mul() {
//         return a * b;
//     }
//     int div() {
//         if (b == 0) {
//             System.out.println("Division by zero error.");
//             return 0;
//         } else {
//             return a / b;
//         }
//     }
// }

// public class class2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Take input from user for a and b
//         System.out.print("Enter first number (a): ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number (b): ");
//         int b = sc.nextInt();

//         // Create Operations object with user input
//         Operations cal = new Operations(a, b);

//         // Ask which operation to perform
//         System.out.println("Choose operation:");
//         System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
//         System.out.print("Enter choice (1-4): ");
//         int choice = sc.nextInt();

//         switch (choice) {
//             case 1:
//                 System.out.println("Addition: " + cal.add());
//                 break;
//             case 2:
//                 System.out.println("Subtraction: " + cal.sub());
//                 break;
//             case 3:
//                 System.out.println("Multiplication: " + cal.mul());
//                 break;
//             case 4:
//                 System.out.println("Division: " + cal.div());
//                 break;
//             default:
//                 System.out.println("Invalid choice!");
//         }
//         sc.close();
//     }
// }

// ABSTRACTION AND ENCAPSULATION


// abstract class Calculator {
//     private int a;
//     private int b;

//     Calculator(int a, int b) {
//         this.a = a;
//         this.b = b;
//     }

//     // Getters
//     public int getA() { return a; }
//     public int getB() { return b; }

   
//     public void setA(int a) { this.a = a; }
//     public void setB(int b) { this.b = b; }


//     abstract int add();
//     abstract int sub();
//     abstract int mul();
//     abstract int div();
// }


// class Operations extends Calculator {
//     Operations(int a, int b) {
//         super(a, b);
//     }

//     int add() {
//         return getA() + getB();
//     }

//     int sub() {
//         return getA() - getB();
//     }

//     int mul() {
//         return getA() * getB();
//     }

//     int div() {
//         if (getB() == 0) {
//             System.out.println("Division by zero error.");
//             return 0;
//         } else {
//             return getA() / getB();
//         }
//     }
// }


// public class class2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter first number (a): ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number (b): ");
//         int b = sc.nextInt();

    
//         Operations cal = new Operations(a, b);

      
//         System.out.println("Choose operation:");
//         System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
//         System.out.print("Enter choice (1-4): ");
//         int choice = sc.nextInt();

//         switch (choice) {
//             case 1:
//                 System.out.println("Addition: " + cal.add());
//                 break;
//             case 2:
//                 System.out.println("Subtraction: " + cal.sub());
//                 break;
//             case 3:
//                 System.out.println("Multiplication: " + cal.mul());
//                 break;
//             case 4:
//                 System.out.println("Division: " + cal.div());
//                 break;
//             default:
//                 System.out.println("Invalid choice!");
//         }
//         sc.close();
//     }
// }

//CONSTRUCTOR AND ABSTRACTION

// abstract class Salary {
//     // Encapsulated variables
//     private int a;
//     private int b;

//     // Constructor
//     Salary(int a) {
//         this.a = a;
//         System.out.println("Before tax your salary is : "+getSalary());
//     }

//     // Getter for original salary
//     public int getSalary() {
//         return a;
//     }

    
//     protected void setAfterTax(int b) {
//         this.b = b;
//     }
//     public int getAfterTax() {
//         return b;
//     }

//     // Abstract methods
//     abstract int tax();
//     abstract void display();
// }

// // Implementing abstract class
// class Operations extends Salary {
//     Operations(int a) {
//         super(a);
//     }

//     int tax() {
        
//         // Calculate after-tax salary and set b
//         int afterTaxSalary = (int)(getSalary() * 0.9); //result in doubl convert into int by (int)(.....)
//         setAfterTax(afterTaxSalary);

//         return afterTaxSalary;
//     }

//     void display() {
//         System.out.println("After taxes your salary is: " + getAfterTax());
//     }
// }

// public class class2 {
//     public static void main(String[] args) {
//         Operations a = new Operations(20000);
//         a.tax();
//         a.display();
//     }
// }

// INHERITANCE AND INTERFACES

// class Vehicles{
//      String Car;
//      String Bike;
//      String a = "bmw";
// }
// class Cars extends Vehicles{
//    Cars(String Car){
//      this.Car = Car;
//  }


//     public void Display(){
//          String a = "mercedes";
//          System.out.println("You are going to purchase a : "+Car);
//          System.out.println("My favourite car is BMW M5");
//          System.out.println("first car : "+a);
//          System.out.println("Second car : "+super.a);

//     }
// }
// class Bikes extends Vehicles{
//     Bikes(String Bike){
//         this.Bike = Bike; 
//     }
//      public void Display(){
        
//          System.out.println("You are going to purchase a : "+Bike);
//          System.out.println("My favourite car is BMW M1000R");
//          System.out.println("Second Car was : "+a);
// }
// }

// public class class2{
//     public static void main(String[] args) {
//         Cars c = new Cars("Defender");
//         Bikes b = new Bikes("Ninja");
//         c.Display();
//         b.Display();
//     }
// }

//INTERFACES

// interface Payable {
//     double calculatePay();
// }

// class HourlyEmployee implements Payable {
//     double hoursWorked, hourlyRate;

//     HourlyEmployee(double hoursWorked, double hourlyRate) {
//         this.hoursWorked = hoursWorked;
//         this.hourlyRate = hourlyRate;
//     }

//     public double calculatePay() {
//         return hoursWorked * hourlyRate;
//     }
// }

// class SalariedEmployee implements Payable {
//     double monthlySalary;

//     SalariedEmployee(double monthlySalary) {
//         this.monthlySalary = monthlySalary;
//     }

//     public double calculatePay() {
//         return monthlySalary;
//     }
// }

// public class class2 {
//     public static void main(String[] args) {
//         Payable[] employees = new Payable[3];

//         employees[0] = new HourlyEmployee(100, 15);       // 1500
//         employees[1] = new SalariedEmployee(25000);       // 25000
//         employees[2] = new HourlyEmployee(80, 20);        // 1600

//         for (Payable employee : employees) {
//             System.out.println("Employee Pay: " + employee.calculatePay());
//         }
//     }
// }

//POLYMORPHISM

// interface Payable {
//     double calculatePay();
// }

// class HourlyEmployee implements Payable {
//     // ...
//     public double calculatePay() { return 1000.0; }
// }

// class SalariedEmployee implements Payable {
//     // ...
//     public double calculatePay() { return 25000.0; }
// }

// public class class2 {
//         public static void main(String[] args) {
//                 Payable[] employees = {
//     new HourlyEmployee(),
//     new SalariedEmployee()
// };

// for (Payable emp : employees) {
//     System.out.println("Pay: " + emp.calculatePay());
// }
//         }
// }

// INTERFACES POLYMORPHISM ENCAPSULATION CONSTRUCTORS

// // Interface
// interface Payable {
//     double calculatePay();
// }

// // HourlyEmployee Class (Encapsulated)
// class HourlyEmployee implements Payable {
//     private double hoursWorked;
//     private double hourlyRate;

//     // Constructor
//     public HourlyEmployee(double hoursWorked, double hourlyRate) {
//         this.hoursWorked = hoursWorked;
//         this.hourlyRate = hourlyRate;
//     }

//     // Getters
//     public double getHoursWorked() {
//         return hoursWorked;
//     }

//     public double getHourlyRate() {
//         return hourlyRate;
//     }

//     // Setters
//     public void setHoursWorked(double hoursWorked) {
//         if (hoursWorked >= 0) {
//             this.hoursWorked = hoursWorked;
//         }
//     }

//     public void setHourlyRate(double hourlyRate) {
//         if (hourlyRate >= 0) {
//             this.hourlyRate = hourlyRate;
//         }
//     }

//     // Interface method implementation
//     public double calculatePay() {
//         return hoursWorked * hourlyRate;
//     }
// }

// // SalariedEmployee Class (Encapsulated)
// class SalariedEmployee implements Payable {
//     private double monthlySalary;

//     // Constructor
//     public SalariedEmployee(double monthlySalary) {
//         this.monthlySalary = monthlySalary;
//     }

//     // Getter
//     public double getMonthlySalary() {
//         return monthlySalary;
//     }

//     // Setter
//     public void setMonthlySalary(double monthlySalary) {
//         if (monthlySalary >= 0) {
//             this.monthlySalary = monthlySalary;
//         }
//     }

//     // Interface method implementation
//     public double calculatePay() {
//         return monthlySalary;
//     }
// }

// // Main Class
// public class class2 {
//     public static void main(String[] args) {
//         // Create employee objects
//         HourlyEmployee h = new HourlyEmployee(120, 15);     // 120 hrs × ₹15 = ₹1800
//         SalariedEmployee s = new SalariedEmployee(25000);   // Fixed ₹25000

//         // Encapsulated data usage with getters
//         System.out.println("Hourly Employee Pay: " + h.calculatePay());
//         System.out.println("Salaried Employee Pay: " + s.calculatePay());

//         // Using interface reference for polymorphism
//         Payable[] employees = { h, s };
//         System.out.println("\n-- Using Payable interface reference --");
//         for (Payable emp : employees) {
//             System.out.println("Pay: " + emp.calculatePay());
//         }
//     }
// }
