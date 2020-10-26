package jdk15;
//www.TestingDocs.com
public sealed class Person implements Thinkable, Dreamable permits Employee {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void think() {
        System.out.println( getName() + " is thinking...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void dream() {
        System.out.println( getName() + " is in REM Sleep...");
    }
}
