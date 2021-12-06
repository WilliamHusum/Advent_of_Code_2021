package com.AOC.dayTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class SubmarinePt2 {
    static int depth = 0;
    static int horizontalPosition = 0;
    static int aim = 0;
    static String[] movements;


    public static void CalcPosition() {
        try {
            File myObj = new File("src/com/AOC/input.txt");
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
