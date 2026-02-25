class Student {
    int rollNo;
    String name;
    double marks;

    
    Student() {
        rollNo = 0;
        name = "Not Assigned";
        marks = 0.0;
    }

    
    Student(int r, String n) {
        rollNo = r;
        name = n;
        marks = 0.0;
    }

    
    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Ansh");
        Student s3 = new Student(102, "Rahul", 88.5);

        s1.display();
        s2.display();
        s3.display();
    }
}