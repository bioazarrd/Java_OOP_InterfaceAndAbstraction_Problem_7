package D_JavaAdvancedOOP.Lecture4_InterfaceAndAbstraction.LabProblem3;
public class Bulgarian implements Person {

    private String name;

    public Bulgarian(String name) {
        this.name = name;
    }



    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Zdravei!";
    }
}
