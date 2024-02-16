//import java.sql.ResultSet;
import java.util.ArrayList;

public class DBData extends DBInterface{

   // public static String TAB; // = "student";
    public DBData()
    {
        super();
    }
    ArrayList<StudRec> selectQry()
    {
         ArrayList<StudRec> st = new ArrayList<StudRec>();
        try {
             st = getQryRes();
        } catch (Exception e) {
            pr(e.getMessage());
        }
        return st;
    }

    void insertRec()
    {
        String name ="Maha";
        int age = 22;
        double marks = 85.09;
        String query = String.format("Insert into student(name, age, marks) values('%s', %o, %f)", name, age, marks);
        int rowsInserted = 0;
        try {
            rowsInserted = executeInsert(query);
        } catch (Exception e) {
            pr(e.getMessage());
        }
        if(rowsInserted > 0)
        {
            pr("\nRecord inserted successfully!");
        }
        else {
            pr("\nInsert Rec : Error!");
        }
    }


    void insertRec2(String name, int age, double marks)
    {
       // String query = String.format("Insert into student(name, age, marks) values(?, ?, ?)");
        int rowsInserted = 0;
        try {
            rowsInserted = executeInsert2(name, age, marks);
        } catch (Exception e) {
            pr(e.getMessage());
        }
        if(rowsInserted > 0)
        {
            pr("\nRecord inserted successfully!");
        }
        else {
            pr("\nInsert Rec : Error!");
        }
    }

    void updateRec(int id, double marks)
    {
        int rowsUpdated = 0;
        try {
            rowsUpdated = executeUpdate(id, marks);
        } catch (Exception e) {
            pr(e.getMessage());
        }
        if(rowsUpdated > 0)
        {
            pr("\nRecord updated successfully!");
        }
        else {
            pr("\nUpdate Rec : Error!");
        }
    }

    void deleteRec(int[] stId)
    {
        int[] rowsDeleted = {0};
        try {
            rowsDeleted = executeDelete(stId);
        } catch (Exception e) {
            pr(e.getMessage());
        }
        if(rowsDeleted[0] > 0)
        {
            pr("\nRecord deleted successfully!");
        }
        else {
            pr("\nDelete Rec : Error!");
        }
    }

    private void pr(String msg)
    {
        System.out.print(msg);
    }
    private void pr()
    {
        pr("\n");
    }
}
