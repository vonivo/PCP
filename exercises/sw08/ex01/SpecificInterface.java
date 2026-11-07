package sw08.ex01;

public interface SpecificInterface extends GeneralInterface {
    @Override
    default public void doIt() {
        System.out.println("Do it the SPECIFIC way.");
    }
}
