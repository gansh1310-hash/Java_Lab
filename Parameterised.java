class Parameterised {
    int rollNo;
    String name;

    
    Parameterised(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        
        Parameterised s1 = new Parameterised(101, "Ansh");
        
        s1.display();
    }
}