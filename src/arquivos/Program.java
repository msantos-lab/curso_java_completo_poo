package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        // System.out.println("Enter file path");
        // String sourceFileStr = sc.nextLine();

        String sourceFileStr = "C:\\Arquivos_java\\input.csv";

        File sourceFile = new File(sourceFileStr);

        String folder = sourceFile.getParent();
        // System.out.println(folder);
        boolean folderOut = new File(folder + "\\out").mkdir();

        System.out.println("criada: " + folderOut);

        String targetFile = folder + "\\out\\sumary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                
                String[] fields = itemCsv.split(";");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);

                products.add(new Product(name, price, quantity));
                
                itemCsv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
                for(Product item : products){
                    //bw.write(item.getName() + ", " + item.total());
                    bw.write(item.toString());
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}
