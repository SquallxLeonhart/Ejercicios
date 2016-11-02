package com.leon.cje1.test.braindumps.programmer;

public interface Doable {
    public void doSomething(String s);
}

abstract class Task implements Doable {
    public void doSomethingElse(String s) {
    }
}

class Do implements Doable {
    public void doSomething(Integer i) {
    }

    public void doSomething(String s) {
    }

    public void doThat(String s) {
    }
}

abstract class Work implements Doable {
    public abstract void doSomething(String s) { }
    public void doYourThing(Boolean b) { }
}

class Job implements Doable {
    public void doSomething(Integer i) { }
}

class Action implements Doable {
    public void doSomething(Integer i) { }
    public String doThis(Integer j) { }
}
