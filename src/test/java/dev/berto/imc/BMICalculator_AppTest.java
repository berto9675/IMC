package dev.berto.imc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalculator_AppTest {
     private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("Should display correct BMI and category")
    void testBMICalculatorApp_ValidInput_ShouldDisplayCorrectBMI() {

        String simulatedInput = "70\n1.75\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        BMICalculator_App.main(new String[]{});

        String output = outputStream.toString();

        assertThat(output, containsString("Your BMI is:"));
        assertThat(output, containsString("Category:"));
    }

}
