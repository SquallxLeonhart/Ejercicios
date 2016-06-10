package com.leon.cje1.test.braindumps;

public class Test8 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";
        
        if (sb.equals(s)) {
            System.out.println("Match 1");
        } else if (sb.toString().equals(s.toString())) {
            System.out.println("Match 2");
        } else {
            System.out.println("No Match");
        }
        
        // *****************
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);
        
        // *****************
        int [] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i+=2) {
            System.out.println(a[i]);
        }
        
        // ***************** DUDA
        String shirts [][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";
        
        for (int index = 0; index < 2; ++index) {
            for (int idx = 0; idx < 2; ++idx) {
                System.out.print(shirts[index][idx] + " : ");
//                j++;  
            }
//            i++;
        }
        System.out.println("");
        for (int index = 0; index < 2;) {
            for (int idx = 0; idx < 2;) {
                System.out.print(shirts[index][idx] + " : ");
                idx++;  
            }
            index++;
        }
        
    }
}

interface Readable {
    public void readBook();
    public void setBookMark();
}

abstract class Book implements Readable {
    public void readBook() {}
}

class EBook extends Book {
    public void readBook() {}
    
    public void setBookMark(){}
}