import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER = "root";
    private static final String PWD = "rootmysql";
    private static DBData DB;
    public static void main(String[] args) {
       // InsertRec();
        getResultSet();
        updateRec();
        prn();
        getResultSet();
        deleteRec();
        prn();
        getResultSet();
    }
    static void getResultSet() {
        DB = new DBData();
        ArrayList<StudRec> st = new ArrayList<StudRec>();
        int i = 0;
        try {
            st = DB.selectQry();
            for (StudRec s : st) {
                pr("\n Id : " + s.getId());
                pr("\tName : " + s.getName());
                pr("\tAge : " + s.getAge());
                pr("\tMarks : " + s.getMarks());
            }
        } catch (Exception e) {
            pr(e.getMessage());
        }
    }

    static void InsertRec()
    {
        DB = new DBData();
        try{
            DB.insertRec();
        }
        catch(Exception e)
        {
            pr(e.getMessage());
        }
    }
    static void updateRec()
    {
        DB = new DBData();
        try{
            DB.updateRec();
        }
        catch(Exception e)
        {
            pr(e.getMessage());
        }
    }

    static void deleteRec()
    {
        DB = new DBData();
        try{
            DB.deleteRec();
        }
        catch(Exception e)
        {
            pr(e.getMessage());
        }
    }
    static public void pr(String msg)
    {
        System.out.print(msg);
    }

    static public void prn()
    {
        pr("\n");
    }
}