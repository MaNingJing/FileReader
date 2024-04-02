import java.io.*;
    public class Main {
    public static void main(String[] args) throws IOException {
    String filePath = "C:\\Users\\mnj\\Desktop\\Groceries.txt";
    String fileToWrite ="C:\\Users\\mnj\\Desktop\\mnj.txt";

    String [] array = new String[4];
    String id;
    String itemName;
    String quantity;
    double price;
    String separator =",";
    double total =0;
    FileReader fileReader = new FileReader(filePath);
    FileWriter fileWriter = new FileWriter(filePath); 

    BufferedReader reader = new BufferedReader(fileReader);
    BufferedWriter writer = new BufferedWriter(fileWriter);

    String line;
    while((line = reader.readLine())!= null){
    array = line.split(separator);
    price = Double.parseDouble(array[3]);
    total += price;
    System.out.println(line);
    writer.write(line);
    writer.newLine();
}
    System.out.println("\n"+ "Total price of groceries: " + Math.round(total));
    writer.write("\n"+"Total price of groceries" + Math.round(total));


    reader.close();
    writer.flush();
    writer.close();
}
}
