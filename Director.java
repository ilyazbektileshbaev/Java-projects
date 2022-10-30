public class Director {
    private String login;
    private String password;

    public Director(String login, String password){
        this.login = login;
        this.password = password;
    }

    public Director(Director source){
        this.login = source.login;
        this.password = source.password;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setLogin(String login){
        this.login=login;
    }

    public void setPassword(String password){
        this.password=password;
    }
}
