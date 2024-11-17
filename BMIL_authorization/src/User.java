public class User {
    private String login;
    private String passwd;
    public User(String login, String passwd){
        this.login = login;
        this.passwd = passwd;
    }

    public String getLogin() {
        return login;
    }

    public String getPasswd() {
        return passwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }

}
