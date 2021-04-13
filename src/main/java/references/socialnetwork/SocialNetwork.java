package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    private List<Member> members = new ArrayList<>();

    public void addMember(String name) {
        members.add(new Member(name));
    }

    public List<Member> getMembers() {
        return members;
    }

    public void connect(String name, String otherName) {
        findByName(name).connectMember(findByName(otherName));
    }

    public Member findByName(String name) {
        for (Member m: members) {
            if (m.getName().equals(name)) {
                return m;
            }
        }
        throw new IllegalArgumentException("No such name");
    }

    public List<String> bidirectionalConnections() {
        List<String> result = new ArrayList<>();
        for (Member m: members) {
            for (Member m2: m.getConnections()) {
                if (m2.getConnections().contains(m)) {
                    result.add(m.getName() + " - " + m2.getName());
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return getMembers().toString();
    }
}
