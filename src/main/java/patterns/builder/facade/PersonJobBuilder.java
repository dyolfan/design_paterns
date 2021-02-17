package patterns.builder.facade;

class PersonJobBuilder extends PersonBuilder {
    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder worksAt(String companyName) {
        person.companyName = companyName;
        return this;
    }

    public PersonJobBuilder inPosition(String position) {
        person.position = position;
        return this;
    }

    public PersonJobBuilder receives(int annualIncome) {
        person.annualIncome = annualIncome;
        return this;
    }
}
