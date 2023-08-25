package System;

import java.sql.*;

public class Connector {

    Connection c;
    Statement s;
    public Connector(){
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankingsystem", "root", "QSDiVtn0gvQdUPR");
            s = c.createStatement();

            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
