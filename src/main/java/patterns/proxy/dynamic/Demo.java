package patterns.proxy.dynamic;

import java.lang.reflect.Proxy;

class Demo {

    @SuppressWarnings("unchecked")
    public static <T> T withLogging(T target, Class<T> itf) {
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[]{itf},
                new LoggingHandler(target)
        );
    }

    public static void main(String[] args) {
        Person person = new Person();
        Human loggedHuman = withLogging(person, Human.class);
        loggedHuman.talk();
        loggedHuman.walk();
        loggedHuman.walk();

        System.out.println(loggedHuman);
    }
}
