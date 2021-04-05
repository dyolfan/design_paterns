package patterns.flyweight.texts;

class Demo {
    public static void main(String[] args) {
        FormattedText ft = new FormattedText("This is a brave new world");
        ft.capitalize(10, 15);
        System.out.println(ft);

        BetterFormattedText betterFormattedText = new BetterFormattedText("Make America great again");
        betterFormattedText.getRange(13, 18).capitalize = true;

        System.out.println(betterFormattedText);
    }
}

