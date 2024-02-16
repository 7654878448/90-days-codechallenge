package exception_handling;

import java.util.ArrayList;
import java.util.Scanner;

import collectionFramework.Cricketer;

public class Launch {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Cricketer> al = new ArrayList<Cricketer>();

    public static void main(String[] args) {
        try {
            System.out.println("p1->insert\np2->read\np3->delete\np4->update\np5->exit\nEnter choice:");
            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Thanks for watching");
            }
            switch (choice) {
                case 1:
                    insert();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    exit();
                    break;
                default:
                    System.out.println("enter valid choice");
                    break;
            }
        } catch (Exception E) {
            E.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static void exit() {
		// TODO Auto-generated method stub
		
	}

	private static void update() {
        System.out.println("enter the choice");
        int jn = scanner.nextInt();
        for (int i = 0; i < al.size(); i++) {
            Cricketer c = al.get(i);
            int getJn = c.getjn();
            if (jn == getJn) {
                System.out.println("enter new salary");
                int newSalary = scanner.nextInt();
                c.setSalary(newSalary);
                System.out.println("salary updated");
            }
        }
    }

    public static void delete() {
        System.out.println("enter jn");
        int jn = scanner.nextInt();
        for (int i = 0; i < al.size(); i++) {
            Cricketer c = al.get(i);
            int getJn = c.getjn();
            if (jn == getJn) {
                al.remove(i);
                System.out.println("data deleted successfully");
            }
        }
    }

    private static void read() {
        for (Cricketer c : al) {
            System.out.println(c.toString());
        }
    }

    private static void insert() {
        System.out.println("enter jn");
        int jn = scanner.nextInt();
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("enter the address");
        String address = scanner.next();
        System.out.println("enter the salary");
        int salary = scanner.nextInt();
        Cricketer c = new Cricketer(jn, name, address, salary);
        al.add(c);
    }
}
