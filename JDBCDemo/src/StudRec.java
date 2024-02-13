public class StudRec {

    String name;
    int age;
    double marks;

    int id;
    public StudRec()
    {

    }
    public StudRec(int id, String name, int age, double marks)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void setId(int i)
    {
        id = i;
    }
    int getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }

    void setName(String str)
    {
        name = str;
    }

    void setAge(int a)
    {
        age = a;
    }
    int getAge()
    {
        return age;
    }
    double getMarks()
    {
        return marks;
    }
    void setMarks(double m)
    {
        marks = m;
    }

}
