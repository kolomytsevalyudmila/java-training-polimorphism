package polymorphism;

/**
 *
 * @author ludmila
 */
public class User {
    private String Name;

    public User(String Name) {
        this.Name = Name;
    }
    
    public void callAnotherUser(int number, AbstractPhone phone) {
        phone.call(number);
    }
}
