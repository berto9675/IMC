package dev.berto.imc;

import java.util.Scanner;


public final class BMICalculator_App {
  private BMICalculator_App() {}

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter your weight (kg): ");
      double weight = scanner.nextDouble();

      System.out.println("Enter your height (m): ");
      double height = scanner.nextDouble();

      BMIService bmiService = new BMIService();
      double bmi = bmiService.calculatorBMI(weight, height);
      String category = bmiService.classifyBMI(bmi);

      System.out.println("Your BMI is: " + bmi);
      System.out.println("Category: " + category);

      scanner.close();
  }
}
