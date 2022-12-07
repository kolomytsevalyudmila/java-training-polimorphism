
package polymorphism;


public class ThomasEdisonPhone extends AbstractPhone {

    public ThomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    void ring(int inputNumber) {
        System.out.println("Вам звонит кто-то");
    }

    @Override
    void call(int outputNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер");
    }
    
    
    
}
