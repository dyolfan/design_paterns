package patterns.builder.inheritance;

class Demo {
    public static void main(String... args) {
        Person person = new EmployeeBuilder()
                .withName("Kirils")
                .worksAt("Home")
                .build();

        System.out.println(person.toString());
    }
}
