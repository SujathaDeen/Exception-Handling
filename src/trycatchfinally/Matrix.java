package trycatchfinally;

import java.util.Scanner;
import java.util.logging.Logger;

public class Matrix extends PreMatrix{
    Logger log=Logger.getLogger(Matrix.class.getName());
    Scanner input =new Scanner(System.in);

    public void insertMatrix(){
        log.info("Matrix");
        log.info("Enter the No of Rows and Columns for a matrix : ");
        int row = input.nextInt();
        setRow(row);
        int column = input.nextInt();
        setColumn(column);
        int[][] matrix =new int[row][column];
        log.info("Enter the elements for a matrix : ");
        for (int i=0; i<row; i++)
        {
            for (int j=0;j<column;j++)
            {
                matrix[i][j]=input.nextInt();
            }
        }
        setMatrix(matrix);
    }
    public void searchThroughElement(){
        log.info("Enter the Search Element : ");
        int searchElement=input.nextInt();
        boolean count=true;
        for (int i=0;i<getRow();i++){
            for (int j=0;j<getColumn();j++){
                int[][] searchMatrix=getMatrix();
                if(searchElement==searchMatrix[i][j])
                {
                    log.info("The Searched Element "+searchElement+" Positioned in the row "+i+" and the column "+j);
                    count=false;
                }
            }
        }
        if(count){
            log.info("Element Not Found");
        }
    }

    public void searchThroughPosition(){
        System.out.println("Enter the Search Position of Row and Column : ");
        int searchPositionRow=input.nextInt();
        int searchPositionColumn=input.nextInt();
        int[][] searchMatrix=getMatrix();
        log.info("The Searched Positioned Element is : "+searchMatrix[searchPositionRow][searchPositionColumn]);
    }


}
