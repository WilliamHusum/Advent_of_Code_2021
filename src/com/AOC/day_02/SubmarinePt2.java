package com.AOC.day_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class SubmarinePt2 {
    static int depth = 0;
    static int horizontalPosition = 0;
    static int aim = 0;
    static String[] movements;


    public static void CalcPositionAdvanced() {
        try {
            File myObj = new File("src/com/AOC/dayTwo/input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                movements = data.trim().split("\\s+");

                if (movements[0].equals("forward")) {
                    horizontalPosition += parseInt(movements[1]);
                    depth += (parseInt(movements[1]) * aim);
                } else if (movements[0].equals("down")) {
//                    depth += parseInt(movements[1]);
                    aim += parseInt(movements[1]);
                } else {
                    aim -= parseInt(movements[1]);
//                    depth -= parseInt(movements[1]);

                }

            }
            System.out.println("horizontalPos: "+ horizontalPosition);
            System.out.println("depth: " + depth);
            System.out.println("aim: " + aim);
            System.out.println(horizontalPosition*depth);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
