package org.example;

import java.awt.*;

public class ExceptionExample extends Exception{
    public void run()
    {
        try {int x = 0/0;}
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
    // throws exceptions:
    // exception chain
    public void run1() throws Exception
    {
        try{
            int x = 0 / 0;
        }catch (Exception exception){
            throw new Exception("wrong");
        }
    }
}

