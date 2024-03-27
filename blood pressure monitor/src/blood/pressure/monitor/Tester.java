package blood.pressure.monitor;

import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    static int id;
    static String name;
    static String yob;
    static int systolic;
    static int diastolic;
    static ArrayList<BloodPressure> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static BloodPressure bloodPressure;

    public static void main(String args[]) {

        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    index();
                    break;
                case 3:
                    System.out.println("Enter user id: ");
                    int uid = scanner.nextInt();
                    view(uid);
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    exit();
                    break;
                default:
      
                    ;
            }
        } while (true);

    }

    public static void create() {
        System.out.println("Enter id:");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter  year of birth:");
        yob = scanner.nextLine();
        System.out.println("Enter systolic:");
        systolic = scanner.nextInt();
        System.out.println("Enter diastolic:");
        diastolic = scanner.nextInt();
        System.out.println("");
        if (id <= 0 || id >= 6) {
            System.out.println("Id must be greater than 0 and less than 5");
            System.out.println("Enter your id:");
            id = scanner.nextInt();

            if (Integer.parseInt(yob) > Year.now().getValue()) {
                System.out.println("Year of birth must be can't be greater than current year");
                System.out.println("Enter your yob:");
                int yobnum = scanner.nextInt();
                yob = String.valueOf(yobnum);
                bloodPressure = new BloodPressure(id, name, yob, systolic, diastolic);
                bloodPressure.calculate();
                bloodPressure.display();
                list.add(bloodPressure);
            } else {
                bloodPressure = new BloodPressure(id, name, yob, systolic, diastolic);
                bloodPressure.calculate();
                bloodPressure.display();
                list.add(bloodPressure);

            }

        } else if (Integer.parseInt(yob) > Year.now().getValue()) {
            System.out.println("Year of birth must be less than 2025");
            System.out.println("Enter your yob:");
            int yobnum = scanner.nextInt();
            yob = String.valueOf(yobnum);
            bloodPressure = new BloodPressure(id, name, yob, systolic, diastolic);
            bloodPressure.calculate();
            bloodPressure.display();
            list.add(bloodPressure);

        } else {
            bloodPressure = new BloodPressure(id, name, yob, systolic, diastolic);
            bloodPressure.calculate();
            bloodPressure.display();
            list.add(bloodPressure);
        }

    }

    public static void index() {
        if (!String.valueOf(list.size()).equalsIgnoreCase("0")) {
            for (BloodPressure user : list) {
                System.out.println("Showind all data of " + user.getName());
                System.out.println("User id: " + user.getId());
                System.out.println("User name: " + user.getName());
                System.out.println("User age: " + user.getAge());
                System.out.println("User BP: " + user.getBloodpressure());
                System.out.println("Range :" + user.getRange());
                System.out.println("BP category : " + user.getCategory());
                System.out.println("");
            }
        } else {
            System.out.println("No users found.Please create a record first.");
        }
        bloodPressure = new BloodPressure(id, name, yob, systolic, diastolic);
        list.add(bloodPressure);
        bloodPressure.display();

    }

    public static void view(int uid) {
        String stringId = String.valueOf(uid);

        for (BloodPressure user : list) {
            if (String.valueOf(user.getId()).equals(stringId)) {
                System.out.println("User name: " + user.getName());
                System.out.println("User year of birth: " + user.getYob());
                System.out.println("User height: " + user.getSystolic());
                System.out.println("User weight: " + user.getDiastolic());
                System.out.println("Range :" + user.getRange());
                System.out.println("BP category : " + user.getCategory());
            } else {
                System.out.println("No user for this id");
            }
        }

        bloodPressure.display();
    }

    public static void displayMenu() {
        System.out.println("Blood Pressure Monitor");
        System.out.println("1.Create a record");
        System.out.println("2.Show all records ");
        System.out.println("3.Show one record for given id");
        System.out.println("4.Delete all records ");
        System.out.println("5.Exit to system");
        System.out.println(" Enter Your choice ");
    }

    public static void delete() {
        list.clear();
    }

    public static void exit() {
        System.exit(0);
    }
}
