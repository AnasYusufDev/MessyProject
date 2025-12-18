
public class Main {
    public     static void main(String[] args) {
        User u1 = new User("Bob", 10);
        User u2 = new User("Alice", 20);
        User u3 = new User("Carl", 30);

        UserList list = new UserList();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(list.getu(new User("Bob", 11)));

        try {
            Persister.s(list);
            System.out.println("Users written to users.txt");
        } catch (java.io.IOException e) {
            System.err.println("Kunne ikke skrive til fil: " + e.getMessage());
            e.printStackTrace(); // valgfrit, hjælper ved fejlsøgning
        }
    }}

