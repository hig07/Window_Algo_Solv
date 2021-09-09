package tutorial;

public class Teacher extends Person{
    private String teacherID;
    private int monthSalary;
    private int woekedYear;
    
    public String getTeacherID() {
        return teacherID;
    }
    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }
    public int getMonthSalary() {
        return monthSalary;
    }
    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }
    public int getWoekedYear() {
        return woekedYear;
    }
    public void setWoekedYear(int woekedYear) {
        this.woekedYear = woekedYear;
    }

    public Teacher(String name, int age, int height, int weight, String teacherID, int monthSalary, int woekedYear) {
        super(name, age, height, weight);
        this.teacherID = teacherID;
        this.monthSalary = monthSalary;
        this.woekedYear = woekedYear;
    }    

    public void show(){
        System.out.println("------------------------------------------------");
        System.out.println("교사 이름 : " + getName());
        System.out.println("교사 나이 : " + getAge());
        System.out.println("교사 키 : " + getHeight());
        System.out.println("교사 몸무게 : " + getWeight());
        System.out.println("교직원 번호 : " + getTeacherID());
        System.out.println("월급 : " + getMonthSalary());
        System.out.println("연차 : " + getWoekedYear());
    }
}
