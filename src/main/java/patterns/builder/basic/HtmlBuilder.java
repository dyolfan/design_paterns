package patterns.builder.basic;

class HtmlBuilder {
    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.name = rootName;
    }

    public HtmlBuilder addChild(String childName, String childText) {
        HtmlElement e = new HtmlElement(childName, childText);
        root.elements.add(e);
        return this;
    }

    public HtmlBuilder clear() {
        root = new HtmlElement();
        root.name = rootName;
        return this;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
