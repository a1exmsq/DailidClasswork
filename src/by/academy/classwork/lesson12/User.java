package by.academy.classwork.lesson12;

public class User {
    private String login;

    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void createQuery(){

            Query query = new Query();
            query.printToLog();
    }


    class Query{
        void printToLog(){
            System.out.println("Пользователь c логином " + getLogin() + " и паролем " + getPassword() +  " отправил запрос");

        }
    }

    public static void main(String[] args) {
        User user = new User("user1","111");
        user.createQuery();
        user.new Query().printToLog();
        new User("user2", "222").new Query().printToLog();
    }
}
