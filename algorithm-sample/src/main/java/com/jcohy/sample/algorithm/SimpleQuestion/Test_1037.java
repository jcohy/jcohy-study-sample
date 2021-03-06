package com.jcohy.sample.algorithm.SimpleQuestion;

import java.text.DecimalFormat;
import java.util.Scanner;

// tag::code[]
/**
 * 三角形面积
 */
public class Test_1037 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        final double S = (a + b + c) / 2;
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println(df.format(Math.sqrt((S * (S - a) * (S - b) * (S - c)))));
    }
}
// end::code[]