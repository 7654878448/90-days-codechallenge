package array;
import java.util.Scanner;
import java.io.*;

public class company {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter username: ");
        String usn = br.readLine();
        System.out.print("Enter password: ");
        String pwd = br.readLine(); // Use BufferedReader for password input as well

        if (usn.equalsIgnoreCase("sumit") && pwd.equals("s")) {
            Project1 pro = new Project1();

            // Handle employee number input
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter employee number: ");
                    pro.eno = Integer.parseInt(br.readLine());
                    validInput = true; // Break the loop if parsing is successful
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid integer for employee number.");
                }
            }

            // Continue with the rest of the inputs...
            System.out.print("Enter employee name: ");
            pro.ename = br.readLine();
            System.out.print("Enter the department: ");
            pro.dept = br.readLine();
            System.out.print("Enter the salary: ");
            pro.sal = Double.parseDouble(br.readLine());
            System.out.print("Enter the mobile number: ");
            pro.mobile = Long.parseLong(br.readLine());
            System.out.print("Enter the email: ");
            pro.email = br.readLine();
            System.out.print("Enter the gender: ");
            pro.gender = br.readLine().charAt(0);
            System.out.print("Enter the working status (true/false): ");
            pro.workingStatus = Boolean.parseBoolean(br.readLine());

            System.out.println("Employee details are:");
            System.out.println("eno\t\t\t:" + pro.eno);
            System.out.println("ename\t\t\t:" + pro.ename);
            System.out.println("dept\t\t\t:" + pro.dept);
            System.out.println("sal\t\t\t:" + pro.sal);
            System.out.println("mobile\t\t\t:" + pro.mobile);
            System.out.println("email\t\t\t:" + pro.email);
            System.out.println("gender\t\t\t:" + pro.gender);
            System.out.println("workingStatus\t\t:" + pro.workingStatus);
        } else {
            System.out.println("Error: The given username and password are invalid.");
        }
    }
}

class Project1 {
    int eno;
    String ename;
    String dept;
    double sal;
    long mobile;
    String email;
    char gender;
    boolean workingStatus;
}
