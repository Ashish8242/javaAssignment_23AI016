import java.util.Scanner;

public class MovieTheaterProfit {
    
    public static double calculateProfit(int attendees) {
       
        double ticketPrice = 5.0;

        
        double fixedCost = 20.0; 
        double variableCostPerAttendee = 0.50; 

        
        double totalIncome = attendees * ticketPrice;
        double totalCost = fixedCost + (attendees * variableCostPerAttendee);

        
        return totalIncome - totalCost;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of attendees: ");
        int attendees = scanner.nextInt();

        
        double totalProfit = calculateProfit(attendees);

        
        System.out.printf("The total profit for %d attendees is: $%.2f%n", attendees, totalProfit);
        
        scanner.close();
    }
}
