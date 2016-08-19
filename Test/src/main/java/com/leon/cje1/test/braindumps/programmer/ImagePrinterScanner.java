package com.leon.cje1.test.braindumps.programmer;

public class ImagePrinterScanner {
    public static void main(String[] args) {
        try (ImageScanner ir = new ImageScanner(); 
             Imageprintlner iw = new Imageprintlner()) {
            ir.scanImage();
            iw.printlnImage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class ImageScanner implements AutoCloseable {
    public void close() throws Exception {
        System.out.println("Scanner closed.");
    }

    public void scanImage() throws Exception {
        System.out.println("Scan.");
        throw new Exception("Unable to scan.");
    }
}

class Imageprintlner implements AutoCloseable {
    public void close() throws Exception {
        System.out.println("printlner closed.");
    }

    public void printlnImage() {
        System.out.println("println.");
    }
}
