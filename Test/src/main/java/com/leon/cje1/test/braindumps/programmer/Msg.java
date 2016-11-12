package com.leon.cje1.test.braindumps.programmer;

public class Msg {
    public static String doMsg(char x) {
        return "Good day!";
    }
    
    public static String doMsg(int y) {
        return "Good Luck!";
    }
    
    public static void main(String[] args) {
        char x = 8;
        int z = '8';
        
        System.out.println(doMsg(x));
        System.out.println(doMsg(z));
    }
}
