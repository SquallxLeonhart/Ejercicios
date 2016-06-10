package com.leon.cje1.test.braindumps;

public class Alpha {
    int ns;
    static int s;
    
    Alpha(int ns){
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }
    
    void doPrint() {
        System.out.println("ns: " + ns + "   s: " + s);
    }
    
    public static void main(String[] args) {
        Alpha ref1 = new Alpha(50); //s 50 ns 50
        Alpha ref2 = new Alpha(125); // s 125 ns 125
        Alpha ref3 = new Alpha(100); // s 125 ns 0
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}
