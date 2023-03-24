package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testIfTwoPlusTwoShouldReturnFour() {
        //Arrange
        int expectedResult = 4;

        //Act
        Main obj = new Main();
        int actualResult = obj.addition(2,2);

        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void testIfThreePlusSevenShouldReturnTen(){
        //Arrange
        int expectedResult = 10;

        //Act
        Main obj = new Main();
        int actualResult = obj.addition(3,7);

        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void testIfResultZeroReturnsGradeF(){
        //Arrange
        char expectedGrade = 'F';

        //Act
        Main obj = new Main();
        char actualGrade = obj.getGrade(0);

        //Assert
        assertEquals(expectedGrade,actualGrade);
    }

    @Test
    void testIfResultSixtyFiveReturnsGradeD(){
        //Arrange
        char expectedGrade = 'D';

        //Act
        Main obj = new Main();
        char actualGrade = obj.getGrade(65);

        //Assert
        assertEquals(expectedGrade,actualGrade);
    }

    @Test
    void testIfResultSeventyFiveReturnsGradeC(){
        //Arrange
        char expectedGrade = 'C';

        //Act
        Main obj = new Main();
        char actualGrade = obj.getGrade(75);

        //Assert
        assertEquals(expectedGrade,actualGrade);
    }

    @Test
    void testIfResultEightyFiveReturnsGradeB(){
        //Arrange
        char expectedGrade = 'B';

        //Act
        Main obj = new Main();
        char actualGrade = obj.getGrade(85);

        //Assert
        assertEquals(expectedGrade,actualGrade);
    }

    @Test
    void testIfResultNinetyFiveReturnsGradeA(){
        //Arrange
        char expectedGrade = 'A';

        //Act
        Main obj = new Main();
        char actualGrade = obj.getGrade(95);

        //Assert
        assertEquals(expectedGrade,actualGrade);
    }

    @Test
    void testIfResultEqualsMinusTwoThrowsIllegalArgumentException(){
        Main obj = new Main();
        assertThrows(IllegalArgumentException.class, ()-> obj.getGrade(-2));
    }

    @Test
    void testIfResultEqualsOneHundredAndOneThrowsIllegalArgumentException(){
        Main obj = new Main();
        assertThrows(IllegalArgumentException.class, ()-> obj.getGrade(101));
    }

    @Test
    void testIfResultNinetyReturnsGradeA(){
        //Arrange
        char expectedGrade = 'A';

        //Act
        Main obj = new Main();
        char actualGrade = obj.getGrade(90);

        //Assert
        assertEquals(expectedGrade,actualGrade);
    }
}