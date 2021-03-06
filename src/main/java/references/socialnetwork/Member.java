package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;
    private List<Member> connections = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Member> getConnections() {
        return connections;
    }

    public void connectMember(Member member) {
        connections.add(member);
    }

    @Override
    public String toString() {
        return name + " " + connectedNames();
    }

    public List<String> connectedNames() {
        List<String> result = new ArrayList<>();
        for (Member m: connections) {
            result.add(m.getName());
        }
        return result;
    }
}
