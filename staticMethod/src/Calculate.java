public class Calculate {


    public static void calculateAverage(Course[] courses) { //int[] grades
        double total = 0;
        for(Course course : courses) {
            total += course.grade;
        }
        double average = total / courses.length;
        System.out.println("Average : " + average);
    }

}
