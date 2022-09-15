package mate.academy;

public class User {
    private final String login;
    private final int password;
    private final int age;

    public User(String login, int password, int age) {
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Login: "
                + getLogin()
                + System.lineSeparator()
                + "Password: "
                + getPassword()
                + System.lineSeparator()
                + "Age: "
                + getAge() + "!";
    }

}
