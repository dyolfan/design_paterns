package patterns.decorator.basic;

class Demo {

    public static void main(String[] args) {
        MagicString s = new MagicString("Hello");
        System.out.println(s + " has " + s.getNumberOfVowels() + " vowels");
    }
}
