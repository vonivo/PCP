package sw08.ex01;

public interface GeneralInterface {
    default public void doIt() {
        System.out.println("Do it the GENERAL way.");
    }
}
