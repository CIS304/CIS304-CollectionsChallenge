package collections.io;

import collections.data.Stock;
import static collections.data.StockCSVFormat.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Reads a CSV file with stock data and makes the data available in an
 * ArrayList of Stock objects
 * @author JAM
 * @version 150721
 */
public class StockDataFile {
    
    /**
     * Filename of the stock data CSV file for this application challenge.
     */
    public static final String STOCK_FILENAME = "CollectionsChallengeStocks.csv";
    
    /**
     * Reads the specified stock (CSV) file and loads the  data into
     * memory.
     * @return ArrayList of Stock objects
     */    
    public static ArrayList <Stock> getData () {
        ArrayList<Stock> stocks = new ArrayList<> ();
        Path dataPath = getDocFilesPath ();
        Path inputPath = Paths.get (dataPath.toString (),
                                    STOCK_FILENAME);
        try (Scanner inputData = new Scanner (
                                 new BufferedReader (
                                 new FileReader (inputPath.toFile())))) {

            // Flush stock file header before proceeding.
            inputData.nextLine();
            while (inputData.hasNext()) {
                String line = inputData.nextLine();
                String [] parsedLine = line.split(",");
                Stock stock = new Stock (parsedLine [TICKER.ordinal()],
                                         parsedLine [PRICE.ordinal()]);
                stocks.add(stock);
            }
            return stocks;
        } catch (IOException ioe) {
            System.out.println ("\nERROR reading stock file:\n" + ioe.getMessage());
            JOptionPane.showMessageDialog(null,
                "\nERROR reading stock file:\n" + ioe.getMessage(),
                "Invalid CSV File", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    /**
     * Determines the path to the doc-files folder of the current NetBeans
     * project. If the doc-files folder doesn't exist, this method still
     * determines the path to where it should be.
     * @return Path to the doc-files folder of the current NetBeans project.
     */
    private static Path getDocFilesPath () {
        Path classPath = Paths.get(System.getProperty("java.class.path"));
        Path workingDirRelBase = Paths.get ("src", "doc-files");
        Path baseDir = classPath.getParent().getParent();
        return Paths.get (baseDir.toString(), workingDirRelBase.toString());
    }
   
}
