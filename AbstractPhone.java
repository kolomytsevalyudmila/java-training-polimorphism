package polymorphism;

/**
 *
 * @author ludmila
 */
class AbstractPhone {
    
    int year;

    public AbstractPhone(int year) {
        this.year = year;
    }

    void call(int outputNumber) {}
    
    void ring(int inputNumber){}
}
