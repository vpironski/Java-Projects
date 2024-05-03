package electionDay;

import java.util.List;

public class Party {
    private String name;
    private String politicalOrientation;
    private List<PartyMember> members;


    public Party(String name, String politicalOrientation, List<PartyMember> members) {
        this.name = name;
        this.politicalOrientation = politicalOrientation;
        this.members = members;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoliticalOrientation() {
        return politicalOrientation;
    }

    public void setPoliticalOrientation(String politicalOrientation) {
        this.politicalOrientation = politicalOrientation;
    }

    public List<PartyMember> getMembers() {
        return members;
    }

    public void setMembers(List<PartyMember> members) {
        this.members = members;
    }
}
