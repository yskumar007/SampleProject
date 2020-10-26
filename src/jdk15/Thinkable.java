package jdk15;
//www.TestingDocs.com
public sealed interface Thinkable permits Dreamable, Person  {
    public void think();
}
