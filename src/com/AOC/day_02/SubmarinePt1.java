package com.AOC.day_02;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

import static java.lang.Integer.parseInt;

public class SubmarinePt1 {
    static int depth = 0;
    static int horizontalPosition = 0;
    static String[] movements;


    public static void CalcPosition() {
        try {
            File myObj = new File("src/com/AOC/dayTwo/input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                movements = data.trim().split("\\s+");

                if (movements[0].equals("forward")) {
                    horizontalPosition += parseInt(movements[1]);
                } else if (movements[0].equals("down")) {
                    depth += parseInt(movements[1]);
                } else {
                    depth -= parseInt(movements[1]);
                }

            }
            System.out.println("horizontalPos: "+ horizontalPosition);
            System.out.println("depth: " + depth);
            System.out.println(horizontalPosition*depth);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
