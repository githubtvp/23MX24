//import java.sql.ResultSet;
import java.util.ArrayList;

public class DBData extends DBInterface{
    public DBData()
    {
        super();
    }
    ArrayList<StudRec> selectQry()
    {
         ArrayList<StudRec> st = new ArrayList<StudRec>();
    //    System.out.println("\n1. In DBData : \n");
        try {
            String query = "select * from student";
             st = getQryRes(query);
        } catch (Exception e) {
            pr(e.getMessage());
        }
        return st;
    }

    void insertRec()
    {
        String name ="Hemant";
        int age = 24;
        double marks = 87.09;
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

    void updateRec()
    {
        int id = 3;
        double marks = 79.09;
        String query = String.format("Update student Set marks = %f where id = %d", marks, id);
        int rowsUpdated = 0;
        try {
            rowsUpdated = executeUpdate(query);
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

    void deleteRec()
    {
        int id = 2;
        String query = String.format("Delete from student where id = %d", id);
        int rowsDeleted = 0;
        try {
            rowsDeleted = executeInsert(query);
        } catch (Exception e) {
            pr(e.getMessage());
        }
        if(rowsDeleted > 0)
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
    private void prn()
    {
        pr("\n");
    }
}
