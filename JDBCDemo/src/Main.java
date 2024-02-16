import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER = "root";
    private static final String PWD = "rootmysql";
    private static DBData DB;

    public static void main(String[] args) {

        InsertRec();
        getRecords();
        updateRec();
        pr();
        //   getRecords();
        deleteRec();
        pr();
        getRecords();
    }

    static void getRecords() {
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

    static void InsertRec() {
        String name = "Priya";
        int age = 23;
        double marks = 90.09;
        DB = new DBData();
        try {
            DB.insertRec2(name, age, marks);
        } catch (Exception e) {
            pr(e.getMessage());
        }
    }

    static void updateRec() {
        int id = 3;
        double marks = 65.09;
        DB = new DBData();
        try {
            DB.updateRec(id, marks);
        } catch (Exception e) {
            pr(e.getMessage());
        }
    }

    static void deleteRec() {
        int[] stId = {5, 6,7};
        DB = new DBData();
        try {
            DB.deleteRec(stId);
        } catch (Exception e) {
            pr(e.getMessage());
        }
    }

    static public void pr(String msg) {
        System.out.print(msg);
    }
    static public void pr() {
        pr("\n");
    }
}