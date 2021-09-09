package tutorial;

public class tutorial5 {
    public static void main(String[] args){
        Student student1 = new Student("홍길동", 20, 175, 70, "20170101", 1, 4.5);
        Student student2 = new Student("홍길서", 28, 185, 75, "20170103", 4, 4.1);
        Student student3 = new Student("홍길남", 24, 179, 78, "20170105", 3, 4.2);
        student1.show();
        student2.show();
        student3.show();
        Teacher teacher1 = new Teacher("홍길북", 28, 185, 75, "20170103", 4, 7);
        Teacher teacher2 = new Teacher("홍길", 24, 179, 78, "20170105", 3, 8);
        teacher1.show();
        teacher2.show();
    }
}
