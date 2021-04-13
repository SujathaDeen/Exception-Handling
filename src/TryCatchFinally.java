/* Program for find the positon through its element value and find an element through its position */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class TryCatchFinally {
    public static void main(String[] args) {
        Logger logger =Logger.getLogger(TryCatchFinally.class.getName());
        Scanner input =new Scanner(System.in);

        try
        {
            System.out.println("Matrix");
            System.out.println("Enter the No of Rows and Columns for a matrix : ");
            int row=input.nextInt();
            int column=input.nextInt();
            int[][] matrix =new int[row][column];
            System.out.println("Enter the elements for a matrix : ");
            for (int i=0;i<row;i++){
                for (int j=0;j<column;j++){
                    matrix[i][j]=input.nextInt();
                }
            }

            System.out.println("Enter the Search Element : ");
            int searchElement=input.nextInt();
            int count=0;
            for (int i=0;i<row;i++){
                for (int j=0;j<column;j++){
                    if(searchElement==matrix[i][j])
                    {
                        System.out.println("The Searched Element "+searchElement+" Positioned in the row "+i+" and the column "+j);
                        count++;
                    }
                }
            }
            if(count==0){
                System.out.println("Element Not Found");
            }

            System.out.println("Enter the Search Position of Row and Column : ");
            int searchPositionRow=input.nextInt();
            int searchPositionColumn=input.nextInt();
            System.out.println("The Searched Positioned Element is : "+matrix[searchPositionRow][searchPositionColumn]);
        }
        catch(InputMismatchException e)
        {
            logger.log(Level.WARNING, "Please Enter Proper Input");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            logger.log(Level.WARNING, "Please Enter Within the Bound");
        }
        //catch ( Exception e){
            //logger.log(Level.WARNING, "Please Enter Within the Bound");
        //}
        finally {
            logger.log(Level.INFO, "Program Terminated");
        }


    }

}








