import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataTable {
    private JFrame fr;
    private JTable tbData;
    public DataTable() {
        fr = new JFrame("Product Stock");
        tbData = new JTable();
        fr.setSize(900, 1200);
        tbData.setPreferredScrollableViewportSize(new Dimension(600, 300));
        
        DefaultTableModel tableModel = new DefaultTableModel();
        try (FileInputStream file = new FileInputStream
            (new File("C:\\Users\\Phakawat\\Desktop\\Book1.xlsx"));){

            Workbook bookData = new XSSFWorkbook(file);
            Sheet sheet = bookData.getSheet("AddPD");

            Row headRow = sheet.getRow(0);
            for (Cell cell : headRow) {
                tableModel.addColumn(cell.getStringCellValue());
            }
            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) { //getLastRowNum() = getNumLastInRow
                Row dataRow = sheet.getRow(rowIndex);
                Object[] rowData = new Object[dataRow.getLastCellNum()];
                for (Cell cell : dataRow) {
                    int columnIndex = cell.getColumnIndex();
                    switch (cell.getCellType()) {
                        case STRING:
                            rowData[columnIndex] = cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            rowData[columnIndex] = cell.getNumericCellValue();
                            break;
                        default:
                            rowData[columnIndex] = "";
                            break;
                    }
                }

                tableModel.addRow(rowData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        tbData.setModel(tableModel);
        tbData.setEnabled(false);

        JScrollPane scrollPane = new JScrollPane(tbData);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.add(scrollPane);
        fr.pack();
        fr.setVisible(true);
    }
}