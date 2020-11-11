package D_JavaAdvancedOOP.Lecture4_InterfaceAndAbstraction.LabProblem3;
public class Chinese implements Person {

    private String name;

    public Chinese(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return String.format("Ni hao!");
    }


}
