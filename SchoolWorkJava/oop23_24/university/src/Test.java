public class Test {
    public static void main(String[] args) {
        Course myCourse = new Course("OOP");
        Teacher firstTeacher = new Teacher("Petko Danov","**********",myCourse);

        System.out.println(firstTeacher.getCourse().getCourseName());
    }
}
