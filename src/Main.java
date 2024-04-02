import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\mnj\\Desktop\\Groceries.txt";
        double totalPrice = 0.0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                
                // Ensure that the line has all four elements
                if (parts.length == 4) {
                    String id = parts[0].trim();
                    String itemName = parts[1].trim();
                    String quantity = parts[2].trim();
                    double price = Double.parseDouble(parts[3].trim());

                    System.out.println("ID: " + id);
                    System.out.println("Item Name: " + itemName);
                    System.out.println("Quantity: " + quantity);
                    System.out.println("Price: " + price);

                    totalPrice += Double.parseDouble(quantity) * price;
                }
            }

            System.out.println("Total Price: " + totalPrice);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
