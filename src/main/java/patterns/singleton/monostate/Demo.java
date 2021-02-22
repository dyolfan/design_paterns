package patterns.singleton.monostate;

class Demo {
    public static void main(String[] args) {
        ChiefExecutiveOfficer chiefExecutiveOfficer = new ChiefExecutiveOfficer();
        chiefExecutiveOfficer.setName("John Lennon");
        chiefExecutiveOfficer.setAge(16);

        // Confusing!!!
        final ChiefExecutiveOfficer chiefExecutiveOfficer2 = new ChiefExecutiveOfficer();
        System.out.println(chiefExecutiveOfficer2);
        chiefExecutiveOfficer2.setName("Will Smith");
        System.out.println(chiefExecutiveOfficer);
    }
}
