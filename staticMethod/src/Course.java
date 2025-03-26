public class Course {
    public String name;
    public String code;
    public int grade;

    public Course(String name, String code, int grade) {
        this.name = name;
        this.code = code;
        this.grade = grade;
    }

    /* public void calculateAverage(int[] grades) {
        double total = 0;
        for(int grade : grades) {
            total += grade;
        }
        double average = total / grades.length;
        System.out.println("Average : " + average);
    } */

}