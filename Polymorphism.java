package polymorphism;

/**
 *
 * @author ludmila
 */
public class Polymorphism {

    
    public static void main(String[] args) {
        AbstractPhone firstPhone = new AbstractPhone(1901);
        AbstractPhone phone = new AbstractPhone(1961);
        AbstractPhone videoPhone = new AbstractPhone(2022);
        
        User user = new User("Ludmila");
        
        user.callAnotherUser(8985430, phone);
        user.callAnotherUser(445599, firstPhone);
        user.callAnotherUser(9988345, videoPhone);
        
    }
    
}
