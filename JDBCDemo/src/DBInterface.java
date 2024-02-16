import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBInterface extends DBConnect {

    private final String TABLE = "student";
    public DBInterface() {
        super();
    }

    ArrayList<StudRec> getQryRes() {
//        String query = "select * from student";
        String query = "select * from " + TABLE;
        ResultSet resSet = null;
        ArrayList<StudRec> st = new ArrayList<StudRec>();
        try {
            resSet = stmt.executeQuery(query);
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

    int executeInsert2(String name, int age, double marks) {
        int rowsInserted = 0;
        String query = String.format("Insert into student(name, age, marks) values(?, ?, ?)");

        try {
            // basically facilitates use of format specifiers and
            // instead use ? place holders and bind the data values
            // rowsInserted = stmt.executeUpdate(qry);
            //PreparedStatement pStmt = conn.prepareStatement(query);
            pStmt = conn.prepareStatement(query);
            pStmt.setString(1, name);
            pStmt.setInt(2, age);
            pStmt.setDouble(3, marks);
            rowsInserted = pStmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rowsInserted;
    }

    int executeUpdate(int id, double marks) {
        int rowsUpdated = 0;
        String query = String.format("Update student Set marks = ? where id = ?");
        try {
           // rowsUpdated = stmt.executeUpdate(query);
            pStmt = conn.prepareStatement(query);
            pStmt.setInt(2, id);
            pStmt.setDouble(1, marks);
            rowsUpdated = pStmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rowsUpdated;
    }

    int[] executeDelete(int[] stId) {
        int[] rowsDeleted = {0};
         try {
            int i = 0;
            while(i < stId.length)
            {
                String query = String.format("Delete from student where id = %d", stId[i]);
                stmt.addBatch(query);
                i++;
            }
            rowsDeleted = stmt.executeBatch();
            conn.close();
        } catch (Exception e) {
            //throw e;
            System.out.println(e.getMessage());
        }
        return rowsDeleted;
    }

}
