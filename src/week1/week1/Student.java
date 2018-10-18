package week1;

public class Student {

     String Name, Id, Email, Group;

    public String getName()
    {
        return Name;
    }
    public void  setName(String s)
    {
        this.Name = s;
    }
    public String getEmail()
    {
        return Email;
    }
    public void setEmail(String s)
    {
        this.Email = s;
    }
    public String getGroup()
    {
        return Group;
    }
    public void setGroup(String s)
    {
        this.Group = s;
    }
    public String getId()
    {
        return Id;
    }
    public void setId(String id)
    {
        this.Id = id;
    }
//    /**
//     * Constructor 1
//     */
//
    public Student() {
        // TODO:
        this.Name = "student";
        this.Id ="000";
        this.Group = "INT22041";
        this.Email = "uet@vnu.edu.vn";
    }
//
//    /**
//     * Constructor 2
//     * @param n
//     * @param sid
//     * @param em
//     */
    public Student(String n, String i, String em) {
        // TODO:
        this.Name = n;
        this.Id = i;
        this.Group = "INT22041";
        this.Email = em;
    }

    public Student(Student s) {
        // TODO:
        this.Name = s.Name;
        this.Id = s.Id;
        this.Email = s.Email;
        this.Group = s.Group;
    }

    public void getInfo()
    {
    	System.out.println("--------------------------------");
        System.out.println("Name: "+this.Name);
        System.out.println("MSSV: "+this.Id);
        System.out.println("Email: "+this.Email);
        System.out.println("Group: "+this.Group);
    	System.out.println("--------------------------------");
    }
}
