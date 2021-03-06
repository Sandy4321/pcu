/**
 * ${PCU_USER}
 * ${PCU_SOURCE_FILE}
 * ${PCU_DATETIME}
 */

// BEGIN AUTOGENERATED

import java.io.*;
import java.util.*;

public class ${PCU_PROBLEM_NAME} {
    static BufferedReader in;
    static StringTokenizer tk;


    public static String token() throws IOException {
        try {
            while (!tk.hasMoreTokens())
                tk = new StringTokenizer(in.readLine());
            return tk.nextToken();
        }
        catch (Exception e) {
        }
        return null;
    }


    public static int gInt() throws IOException {
        return Integer.parseInt(token());
    }


    public static long gLong() throws IOException {
        return Long.parseLong(token());
    }


    public static double gDouble() throws IOException {
        return Double.parseDouble(token());
    }


    public static void init() throws IOException {
        System.setIn(new FileInputStream("${PCU_INPUT_FILE}$"));
        System.setOut(new PrintStream(new BufferedOutputStream(
            new FileOutputStream("${PCU_OUTPUT_FILE}"))));
        in = new BufferedReader(new InputStreamReader(System.in));
        tk = new StringTokenizer("");
    }


    public static void quit() throws IOException {
        System.err.close();
        System.out.close();
        System.exit(0);
    }


    public static void main(String[] args) throws IOException {
        init();
        body(args);
        quit();
    }

    // END AUTOGENERATED


    public static void body(String[] args) throws IOException {
    }
}
