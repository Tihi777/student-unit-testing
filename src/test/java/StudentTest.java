import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @Test
    void testEmptyString() {
        this.student.setFirstName("");

        assertEquals("", this.student.getFirstName());
    }

    @Test
    void testNotCapitalizedFirstLetter() {
        String name = "ivan";

        this.student.setFirstName(name);

        assertEquals("Ivan", this.student.getFirstName());
    }

    @Test
    void testAllCapitalizedLetters() {
        String name = "IVAN";

        this.student.setFirstName(name);

        assertEquals("Ivan", this.student.getFirstName());
    }


    @ParameterizedTest
    @ValueSource(strings = {"Petr", "Ivan", "Ilya"})
    void testDifferentNames(String name) {
        this.student.setFirstName(name);

        assertEquals(name, this.student.getFirstName());
    }
}