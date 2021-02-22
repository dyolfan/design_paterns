package patterns.prototype.serialization;

import org.apache.commons.lang3.SerializationUtils;

class Demo {
    public static void main(String[] args) {
        Foo foo = new Foo(42, "life");
        Foo foo2 = SerializationUtils.roundtrip(foo);

        foo2.whatever = "diwqhihqw";

        System.out.println(foo);
        System.out.println(foo2);
    }
}
