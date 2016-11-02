package com.leon.cje1.test.braindumps.programmer;

public class DBConfiguration {
    String user;
    String password;
}

class DBHandler {
    
    DBConfiguration configureDB(String user, String pass) {
//        DBConfiguration f;
        return new DBConfiguration();
    }
    
    public static void main(String[] args) {
        DBHandler r = new DBHandler();
        DBConfiguration dbConf = r.configureDB("", "");
    }
    
}
