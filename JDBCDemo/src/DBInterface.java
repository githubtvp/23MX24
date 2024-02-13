import java.sql.ResultSet;
import java.util.ArrayList;

public class DBInterface extends DBConnect {
    public DBInterface() {
        super();
    }

    ArrayList<StudRec> getQryRes(String qry) {
        ResultSet resSet = null; // = new ResultSet();
        ArrayList<StudRec> st = new ArrayList<StudRec>();
        //  System.out.println("\n2. In DBInteface : \n");
        try {
            resSet = stmt.executeQuery(qry);
            while (resSet.next()) {
                int id = resSet.getInt("id");
                String name = resSet.getString("name");
                int age = resSet.getInt("age");
                double marks = resSet.getDouble("marks");
                StudRec newSt = new StudRec();
                newSt = new StudRec(id, name, age, marks);
                st.add(newSt);
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return st;
    }

    int executeInsert(String qry) {
        int rowsInserted = 0;
        try {
            rowsInserted = stmt.executeUpdate(qry);
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rowsInserted;
    }

    int executeUpdate(String qry){
        int rowsUpdated = 0;
        try {
            rowsUpdated = stmt.executeUpdate(qry);
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rowsUpdated;
    }

    int executeDelete(String qry){
        int rowsDeleted = 0;
        try {
            rowsDeleted = stmt.executeUpdate(qry);
            conn.close();
        } catch (Exception e) {
            //throw e;
            System.out.println(e.getMessage());
        }
        return rowsDeleted;
    }

}
