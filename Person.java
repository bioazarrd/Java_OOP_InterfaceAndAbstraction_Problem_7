package D_JavaAdvancedOOP.Lecture4_InterfaceAndAbstraction.LabProblem3;
public interface Person {

    String getName();
    default String sayHello() {
        return "Hello!";
    }



}
