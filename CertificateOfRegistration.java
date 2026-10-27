import java.util.Scanner;

public class CertificateOfRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Portal Header & Student Info
        System.out.println("==================================================================================");
        System.out.println("                  FEU INSTITUTE OF TECHNOLOGY - STUDENT PORTAL                    ");
        System.out.println("==================================================================================");
        System.out.println("Enrollment Status: ENROLLED                          College: COMPUTER STUDIES");
        System.out.println("Student #: 202510960                                 Program: BSCSAI");
        System.out.println("Name: TAMAR, MARIAN BUA                              Year Level: 2 (1st Term, SY 26-27)");
        System.out.println("Section: TA21                                        Address: PUROK 2 G. ALIÑO, MASBATE");
        System.out.println("==================================================================================");
        System.out.println("\n[ ENROLLED COURSES SCHEDULE - SECTION TA21 ]");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("%-10s %-38s %-8s %-6s %-8s %-15s %-12s%n", 
                          "Course", "Title", "Section", "Units", "Days", "Time", "Room");
        System.out.println("----------------------------------------------------------------------------------");

        // Course List Array
        String[][] courses = {
            {"CCS0021", "INFORMATION MANAGEMENT (LEC)", "TA21", "2", "T", "13:00-15:40", "ONLINE"},
            {"CCS0021L", "INFORMATION MANAGEMENT (LAB)", "TA21", "1", "F", "13:00-15:50", "ONLINE"},
            {"CS0001", "DISCRETE STRUCTURES 1", "TA21", "3", "M / TH", "15:00-16:50", "F710 / F710"},
            {"CS0003", "COMPUTER SYSTEMS & ARCHITECTURE", "TA21", "2", "F", "07:00-09:40", "ONLINE"},
            {"CS0003L", "COMPUTER SYSTEMS & ARCHITECTURE (LAB)", "TA21", "1", "S", "07:00-09:50", "E610"},
            {"CS0070", "OBJECT ORIENTED PROGRAMMING", "TA21", "2", "T", "10:00-12:40", "ONLINE"},
            {"CS0070L", "OBJECT ORIENTED PROGRAMMING-LAB", "TA21", "1", "M", "10:00-12:50", "E609"},
            {"GED0021", "SPECIALIZED ENGLISH PROGRAM 2", "TA21", "3", "M / TH", "07:00-08:50", "F607 / F607"},
            {"GED0075", "MATHEMATICAL ANALYSIS", "TA21", "3", "F / T", "17:00-18:50", "ONLINE"},
            {"GED0081", "COLLEGE PHYSICS 1 LECTURE", "TA21", "2", "F", "10:00-12:40", "ONLINE"},
            {"GED0081L", "COLLEGE PHYSICS 1 LABORATORY", "TA21", "1", "W", "13:00-15:50", "F1003"}
        };

        for (String[] c : courses) {
            System.out.printf("%-10s %-38s %-8s %-6s %-8s %-15s %-12s%n", 
                              c[0], c[1], c[2], c[3], c[4], c[5], c[6]);
        }
        System.out.println("----------------------------------------------------------------------------------");

        // 2. Assessment Fees & Interactive Tuition Computation
        System.out.println("\n[ FINANCIAL ASSESSMENT & TUITION COMPUTATION ]");
        
        double miscFee = 12305.00;
        double idFee = 80.00;
        double compLabFee = 12024.00;
        double sciLabFee = 4104.00;
        double ratePerUnit = 2108.00; // Base rate per unit

        System.out.print("Enter total enrolled units to compute (Default is 21): ");
        int units = 21;
        try {
            String input = scanner.nextLine();
            if (!input.trim().isEmpty()) {
                units = Integer.parseInt(input.trim());
            }
        } catch (Exception e) {
            System.out.println("Invalid input received. Using default 21 units.");
        }

        double tuitionFee = units * ratePerUnit;
        double totalAssessment = tuitionFee + miscFee + idFee + compLabFee + sciLabFee;

        System.out.println("\n----------------------------------------------------------------------------------");
        System.out.printf("  TOTAL UNITS                             : %d%n", units);
        System.out.printf("  Tuition Fee (%d units @ PHP %.2f)       : PHP %,.2f%n", units, ratePerUnit, tuitionFee);
        System.out.printf("  Miscellaneous Fee                       : PHP %,.2f%n", miscFee);
        System.out.printf("  ID Validation Fee                       : PHP %,.2f%n", idFee);
        System.out.printf("  ITE Computer Lab Fee                    : PHP %,.2f%n", compLabFee);
        System.out.printf("  Science Lab Fee (GED0081)               : PHP %,.2f%n", sciLabFee);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("  TOTAL ASSESSMENT                        : PHP %,.2f%n", totalAssessment);
        System.out.println("==================================================================================");
        System.out.println("Status: Officially Enrolled for 1st Term, SY 26-27.");
        
        scanner.close();
    }
}