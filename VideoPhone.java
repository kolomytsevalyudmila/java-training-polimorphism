
package polymorphism;


public class VideoPhone extends AbstractPhone {

    public VideoPhone(int year) {
        super(year);
    }

    @Override
    void ring(int inputNumber) {
        System.out.println("Входящий видеовызов от абонента " + inputNumber); 
    }

    @Override
    void call(int outputNumber) {
        System.out.println("Подключаю видеоканал с абонентом " + outputNumber);
    }
    
    
    
}
