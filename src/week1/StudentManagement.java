package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    private static final int MAX_STUDENT = 100;
    private Student[] students = new Student[MAX_STUDENT];
    private int numberStudent = 0;

    public void add(Student s){
        students[numberStudent] = s;
        numberStudent++;
    }

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return (s1.getGroup().equals(s2.getGroup()));
    }

    public void listAllStudents(){
        for (int i = 0; i < numberStudent; i++){
            students[i].getInfo();
        }
    }

    void studentsByGroup() {
        // TODO:
        for (int i = numberStudent - 1; i >0; i-- ){
            for (int j = 0; j < i; j++){
                if(students[j].getGroup().compareTo(students[j + 1].getGroup()) > 0){
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < numberStudent; i++){
            if(i == 0 || students[i].getGroup().compareTo(students[i - 1].getGroup()) != 0){
                System.out.println("---" + students[i].getGroup() + "---");
            }
            System.out.println(students[i].getId() + "\t" + students[i].getName());
        }
    }

    void removeStudent(String id) {
        // TODO:
        for (int i = 0; i < numberStudent; i++){
            if(students[i].getId().equals(id)){
                students[i] = students[numberStudent - 1];
                numberStudent--;
                i--;
            }
        }
    }

    public static void main(String[] args) {
        // TODO:
        StudentManagement studentManager = new StudentManagement();
        //Test b6
        Student myStudent = new Student();
        myStudent.setName("Nguyen Thi Hue");
        myStudent.setId("17021156");
        myStudent.setEmail("hueahgase189@gmail.com");
        myStudent.setGroup("K62-J");
        System.out.println(myStudent.getName());
        myStudent.getInfo();
        //b8 - test constructor
        System.out.println("***check bai 8***");
        Student studentNoParam = new Student();
        studentNoParam.getInfo();

        Student studentDefaultGroup = new Student("Hue", "1702", "hue@uet.edu");
        studentDefaultGroup.getInfo();

        Student studentClone = new Student(myStudent);
        studentClone.getInfo();
        //b9 - test same group
        System.out.println("***check bai 9***");
        System.out.println(studentManager.sameGroup(studentNoParam, studentDefaultGroup));
        System.out.println(studentManager.sameGroup(myStudent, studentNoParam));

        studentManager.add(myStudent);
        studentManager.add(studentNoParam);
        studentManager.add(studentNoParam);
        studentManager.add(studentDefaultGroup);
        studentManager.add(studentClone);
        studentManager.add(studentClone);
        //check b12
        System.out.println("***check bai 12***");
        studentManager.studentsByGroup();
        //check b13
        System.out.println("***check bai 13***");
        studentManager.removeStudent(myStudent.getId());
        studentManager.listAllStudents();
    }
}