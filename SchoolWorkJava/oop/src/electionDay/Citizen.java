package electionDay;

public class Citizen {
    private String name;
    private int egn;


    public Citizen(String name,int egn) {
        this.name = name;
        setEgn(egn);
    }


    public boolean checkEgn(int egn) {
        return 0 == (int) (egn / Math.pow(10, 10));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEgn() {
        return egn;
    }

    public void setEgn(int egn) {
        try {
            if (checkEgn(egn)) {
                this.egn = egn;
            } else {
                throw new InvalidInfoException("Invalid egn length");
            }
        } catch (InvalidInfoException e) {
            throw new RuntimeException(e);
        }
    }

}