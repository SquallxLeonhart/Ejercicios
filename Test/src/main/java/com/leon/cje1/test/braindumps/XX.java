package com.leon.cje1.test.braindumps;

import java.io.IOException;

public class XX {
    public void printFileContent() throws IOException {
        throw new IOException();
    }
    
    public static void main(String[] args) {
        XX xx = new XX();
        try {
            xx.printFileContent();
        } catch (Exception e) {
            // TODO: handle exception
        } catch (IOException e) {
            // TODO: handle exception
        }
    }
}
