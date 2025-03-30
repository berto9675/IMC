package dev.berto.imc;

public class BMIService {
    public double calculatorBMI(double weight, double height) {

        if (height <= 0 && weight <= 0) {
            throw new IllegalArgumentException("Weight and Height must be positive");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        if (weight < 0 ) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        return weight / Math.pow(height, 2);
    }

    public String classifyBMI(double bmi) {
        if (bmi < 16) return "Severe thinness";
        else if (bmi < 17) return "Moderate thinness";
        else if (bmi < 18.5) return "Mild thinness";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else if (bmi < 35) return "Mild obesity";
        else if (bmi < 40) return "Moderate obesity";
        else return "Morbid obesity";
    }

}
