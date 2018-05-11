package by.it.shumilov.jd01_09;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line;
        Parser parser = new Parser();
        Printer printer = new Printer();
        while (!(line = sc.nextLine()).equals("end")){
            Var var = parser.calc(line);
            printer.print(var);
        }
    }
}
