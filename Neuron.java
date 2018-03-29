package assignment1;

import java.util.Scanner;

public class Neuron {

    public static void main(String[] args) {

        new Neuron().calOutput();
        

    }

    void calOutput() {
        
    int x1[] = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1};
    int x2[] = {0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1};
    int x3[] = {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1};
    int x4[] = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        
                
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Weights w1:");
        double w1 = reader.nextDouble();

        System.out.print("Enter Weights w2:");
        double w2 = reader.nextDouble();

        System.out.print("Enter Weights w3:");
        double w3 = reader.nextDouble();

        System.out.print("Enter Weights w4:");
        double w4 = reader.nextDouble();

        System.out.print("Enter Threshold Value:");
        double th = reader.nextDouble();

        reader.close();
        
        for (int i = 0; i < 16; i++) {
            double output = x1[i] * w1 + x2[i] * w2 + x3[i] * w3 + x4[i] * w4;
            if (output < th) {
                System.out.println(x1[i]+""+x2[i]+""+x3[i]+""+x4[i]+"   "+   output  + " ===> 0");
            } else if (output >= th) {
                System.out.println(x1[i]+""+x2[i]+""+x3[i]+""+x4[i]+"   "+   output  + " ===> 1");
            }

        }
    }

}
