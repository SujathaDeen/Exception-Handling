import trycatchfinally.*;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TryCatchFinallyMain {
    public static void main(String[] args) {
       Logger log=Logger.getLogger(TryCatchFinally.class.getName());
       try {
           Matrix matrix = new Matrix();
           matrix.insertMatrix();
           matrix.searchThroughElement();
           matrix.searchThroughPosition();
       }
       catch(InputMismatchException e)
       {
           log.log(Level.WARNING, "Please Enter Proper Input");
       }
       catch (ArrayIndexOutOfBoundsException e)
       {
           log.log(Level.WARNING, "Please Enter Within the Bound");
       }
       catch ( Exception e){
           log.log(Level.WARNING, "Please Enter Within the Bound");
       }
       finally {
           log.log(Level.INFO, "Program Terminated");
       }

    }
}
