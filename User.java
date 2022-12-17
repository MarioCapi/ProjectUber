package Java;

class User extends Account {
    public User(String name, String document, String email, String password) {
        super(name, document);
    }

    void pritnDataUser() {
        System.out.println(
                "Documet User: " + document + "name user" + name + " E-mail: " + email + " Password: " + password);

    }
}
