package com.leon.cje1.test.braindumps.programmer;

import java.io.IOException;

public final class Folder implements AutoCloseable {// line n1
    // line n2
    @Override
    void close() throws IOException{
        System.out.print("Close");
        
    }
    
    public void open() {
        System.out.print("Open");
    }

    public static void main(String[] args) throws Exception {
        try (Folder f = new Folder()) {
            f.open();
        }
    }

}

class Test10 {
    public static void main(String[] args) throws Exception {
        try (Folder f = new Folder()) {
            f.open();
        }
    }
}