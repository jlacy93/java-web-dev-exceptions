package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        System.out.println(Divide(3,1));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for(Map.Entry<String, String> entry : studentFiles.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            int points = CheckFileExtension(value);
            System.out.println(key + " has " + points + " points for submitting " + value);
        }
    }

    public static int Divide(int x, int y)
    {
        // Write code here!
        if(y == 0){
            try{
                throw new ArithmeticException("You cannot divide by 0!");
            } catch(ArithmeticException e){
                e.printStackTrace();
            }
        }
        return x / y;
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        int points;
        if(fileName.contains(".java")){
            points = 1;
        } else if (fileName.isBlank()){
            points = -1;
            try{
                throw new Exception("You cannot submit a blank assignment");
            } catch(Exception e){
                e.printStackTrace();
            }
        } else {
            points = 0;
        }
        return points;
    }

}
