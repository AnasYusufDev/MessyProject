public class User {
    private int id;
    private String name;
    private String address;

    public User(String name, int id) {
        setName(name);
        this.id = id;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getAddress() { return address; }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.length() > 100) {
            throw new IllegalArgumentException("Name must be 1..100 chars");
        }
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User other)) return false;
        return id == other.id && name.equalsIgnoreCase(other.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, name == null ? null : name.toLowerCase());
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }
}


