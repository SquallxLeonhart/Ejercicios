package com.leon.cje1.test.braindumps;

import com.leon.cje1.test.braindumps.p1.Acc;

public class Test9 {
    public int amount;
    
    public Test9(int amount) {
        this.amount = amount;
    }
    
    public int getAmount() {
        return amount;
    }
    
    public void changeAmount(int x) {
        amount += x;
    }
    
    public static void main(String[] args) {
        Test9 test9 = new Test9((int) Math.random() * 1000);
//        test9.amount = 0;
        test9.changeAmount(-test9.getAmount());
//        test9.changeAmount(-test9.amount);
        System.out.println(test9.getAmount());
        
        
        /////////////////////
        System.out.println(maskCC("1234-5678-9101-1121"));
        
        ////////////////////
        
        Acc obj = new Acc();
        int x = obj.s;
        
    }
    
    public static String maskCC(String creditCard) {
        String x = "XXXX-XXXX-XXXX-";
        StringBuilder sb = new StringBuilder(x);
//        StringBuilder sb = new StringBuilder(creditCard);
//        sb.substring(15, 19);
//        return x + creditCard.substring(15,19);
//        sb.insert(0, x);
        sb.append(creditCard, 15, 19);
        
        return sb.toString();
    }
}


