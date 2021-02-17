package patterns.builder.facade;

public class Demo {
    public static void main(String... args) {
        Person person = new PersonBuilder()
                .lives().in("Riga").at("Jump Street 21").withPostCode("1234")
                .works().worksAt("Home").inPosition("Developer").receives(30000).build();
        System.out.println(person.toString());
    }
}
