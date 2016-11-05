package p2;

import p1.DoInterface;
import p3.DoClass;

public class TestDo {
    public static void main(String[] args) {
        DoInterface doi = new DoClass();
        doi.m1(100);
        doi.m2(200);
    }
}
