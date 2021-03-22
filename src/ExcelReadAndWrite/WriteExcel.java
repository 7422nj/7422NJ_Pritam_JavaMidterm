package ExcelReadAndWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) throws IOException {

        //This is the root class to handle XLSX.
        //This is the first object most users will construct whether they are reading or writing a workbook.
        XSSFWorkbook workbook = new XSSFWorkbook();

        //An excel file can have more than one sheet. This class owns an excel sheet which is obtained by XSSFWorkbook
        //In this instance we are creaating a worksheet with name of JavaBooks
        XSSFSheet sheet = workbook.createSheet("JavaBooks");

        //Created a 2D Array
        Object[][] bookData = { //Object Array
                //Entered The Elements We Want In Our 2D Array
                {"Head First Java", "Kathy Serria", 79},
                {"Effective Java", "Joshua Bloch", 36},
                {"Clean Code", "Robert martin", 42},
                {"Thinking in Java", "Bruce Eckel", 35},
        };

        //Initilizing Value of Rows at Start Point 0
        int rowCount = 0;

        //Converting 2D Array bookData into 1D Array aBook
        for (Object[] aBook : bookData) {

            //Now We Want To Create Rows
            //Enter classType reference = worksheet should create rows <- as many rows, depending on what is fetched
            //Row class is now like an object and we are asking the object/class Row to create rows in the worksheet++
            Row row = sheet.createRow(++rowCount);

            //Initilizing Value of Columns at Start Point 0
            int columnCount = 0;

            //Convert the 1D Array aBook into the fields in the ExcelSheet
            //In Other Words, We Want To Receive All Data from 1D Array aBook than send it to a field in Excel
            //According to bookTitle,arthurName and bookNumber
            for (Object field : aBook) {

                //Now We Want To Create Columns And Enter Value in Each Cell of The Columns
                //Enter classType reference = Under each row we want to enter value in each cell <- will make our columns
                //Row class is now like an object and we are asking the object/class Row to create rows in the worksheet++
                Cell cell = row.createCell(++columnCount);

                //If the field fetched is String <- set the value in String Format
                if (field instanceof String) { //Returns true or false if instance is of specified type <-String
                    cell.setCellValue((String) field); //Sets value as String in Excel File's cell

                    //Or else, if the field fetched is Integer <- set the value in Integer Format
                } else if (field instanceof Integer) { //Returns true or false if instance is of specified type <-Integer
                    cell.setCellValue((Integer) field); //Sets value as Integer in Excel File's cell
                }
            }
        }
        //In Read Excel Since We Are Trying Receive A ExcelSheet We Used FileInputStream <- To Receive Data
        //In Write Excel Since We Are Trying To Send Out The Data To ExcelSheet We Will Use FileOutputStream <- To Send Data
        try (FileOutputStream outputStream = new FileOutputStream("DataTest/WriteExcel201.xlsx")) {

            //In the excel workbook write the data that we are sending out to the excel file from the Array
            workbook.write(outputStream);
            System.out.println("\n *** Path Found *** "+"\n *** Excel Sheet Created Successfully *** ");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("\n *** Path Not Found *** "+"\n *** Refer To Correct Path *** ");
        }
    }
}
