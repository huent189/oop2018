package week1;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public Student(){
        name = "Student";
        id ="000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        group = "INT22041";
    }
    public Student(Student s){
        name = s.name;
        email = s.email;
        group = s.group;
        id = s.id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getInfo(){
        String info = "Ten: " + name + "\nMSSV: " + id + "\nLop: " + group + "\nEmail: " + email;
        System.out.println(info);
    }
}
