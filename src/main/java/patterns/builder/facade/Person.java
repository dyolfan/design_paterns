package patterns.builder.facade;

class Person {
    public String streetAddress, postcode, city, companyName, position;
    public int annualIncome;

    @Override
    public String toString() {
        return "Person{"
                + "streetAddress='" + streetAddress + "', "
                + "postcode='" + postcode + "', "
                + "city='" + city + "', "
                + "companyName='" + companyName + "', "
                + "position='" + position + "', "
                + "annualIncome='" + annualIncome + "'"
                + "}";
    }
}
