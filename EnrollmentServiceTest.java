package w4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;


public class EnrollmentServiceTest {

    @Test
    public void testEnrollStudentSuccessfully() {
        EnrollmentService service = new EnrollmentService();

        boolean result = service.enrollStudent("john_doe", "Mathematics");
        assertTrue(result, "Student should be enrolled successfully in Mathematics.");
    }

    @Test
    public void testEnrollStudentAlreadyEnrolled() {
        EnrollmentService service = new EnrollmentService();
        service.enrollStudent("john_doe", "Mathematics");

        boolean result = service.enrollStudent("john_doe", "Mathematics");
        assertFalse(result, "Student should not be enrolled again in the same course.");
    }

    @Test
    public void testEnrollMultipleCourses() {
        EnrollmentService service = new EnrollmentService();

        boolean result1 = service.enrollStudent("john_doe", "Mathematics");
        boolean result2 = service.enrollStudent("john_doe", "Physics");

        assertAll(
            () -> assertTrue(result1, "Student should be enrolled successfully in Mathematics."),
            () -> assertTrue(result2, "Student should be enrolled successfully in Physics.")
        );
    }

    @Test
    public void testEnrollDifferentStudents() {
        EnrollmentService service = new EnrollmentService();

        boolean result1 = service.enrollStudent("john_doe", "Mathematics");
        boolean result2 = service.enrollStudent("jane_smith", "Mathematics");

        assertAll(
            () -> assertTrue(result1, "John should be enrolled successfully in Mathematics."),
            () -> assertTrue(result2, "Jane should be enrolled successfully in Mathematics.")
        );
    }

    @Test
    public void testGetEnrolledCourses() {
        EnrollmentService service = new EnrollmentService();

        service.enrollStudent("john_doe", "Mathematics");
        service.enrollStudent("john_doe", "Physics");

        Set<String> courses = service.getEnrolledCourses("john_doe");

        assertEquals(2, courses.size(), "John should be enrolled in exactly 2 courses.");
        assertTrue(courses.contains("Mathematics"), "Mathematics should be in the enrolled courses.");
        assertTrue(courses.contains("Physics"), "Physics should be in the enrolled courses.");
    }
}

