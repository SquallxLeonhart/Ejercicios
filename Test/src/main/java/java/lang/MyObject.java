package java.lang;


public class MyObject extends java.lang.Object {
    public enum B{A, B, C}
    String name = "DEFAULT VALUE";
    
    protected void finalize() {
        name = null;
    }

    public static void main(String[] args) {
        Object obj = new MyObject();
//        obj.finalize();
    }
}
