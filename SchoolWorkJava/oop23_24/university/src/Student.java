public class Student extends Person{
    private String facNum;

    public Student(String name, String egn, String facNum) {
        super(name, egn);
        this.facNum = facNum;
    }

    public String getFacNum() {
        return facNum;
    }

    public void setFacNum(String facNum) {
        this.facNum = facNum;
    }
}
