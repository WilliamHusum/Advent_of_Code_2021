package com.AOC.day_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


import static java.lang.Integer.parseInt;

public class DepthMeasurement {
    static int depth = 0;
    private static int increases;

    public static int CalcDepth() {
        try {
            File myObj = new File("src/com/AOC/dayOne/input.txt");
            Scanner myReader = new Scanner(myObj);
            int oldDepth = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                depth = parseInt(data);
                if (depth > oldDepth) {
                    increases++;
                }
                oldDepth = depth;

            }
            myReader.close();
//            System.out.println(increases);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // -1, because of the first comparison to oldDepth shouldn't count.
        return increases -1;
    }

    public static int CalcDepthAdvanced () {
        return -1;
    }
}

