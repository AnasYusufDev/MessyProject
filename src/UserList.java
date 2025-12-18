
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserList {
    private final List<User> users = new ArrayList<>();

    public void add(User u) {
        if (u == null) return;
        users.add(u);
    }

    // Returnér en read-only visning af listen
    public List<User> getAll() {
        return Collections.unmodifiableList(users);
    }

    // Find bruger ved navn (case-insensitive)
    public User getByName(String name) {
        if (name == null) return null;
        for (User u : users) {
            if (u.getName().equalsIgnoreCase(name)) {
                return u;
            }
        }
        return null;
    }

    // Beholder "getu(User probe)" så din Main stadig virker
    public User getu(User probe) {
        if (probe == null) return null;
        return getByName(probe.getName());
    }
}



