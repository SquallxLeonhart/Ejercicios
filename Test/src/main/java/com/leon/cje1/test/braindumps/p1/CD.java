package com.leon.cje1.test.braindumps.p1;

public class CD {
    int r;
    CD(int r) {
      this.r = r;  
    }
}

class DVD extends CD {
    int c;
    
    DVD(int r, int c) {
        super(r);
        this.c = c;
    }
}