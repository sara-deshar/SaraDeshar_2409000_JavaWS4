package w4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EnrollmentService {
    private Map<String, Set<String>> studentEnrollments;

    public EnrollmentService() {
        this.studentEnrollments = new HashMap<>();
    }

    public boolean enrollStudent(String studentUsername, String courseName) {
        Set<String> courses = studentEnrollments.computeIfAbsent(studentUsername, k -> new HashSet<>());

        return courses.add(courseName);
    }

    // Optional: Get enrolled courses for a student
    public Set<String> getEnrolledCourses(String studentUsername) {
        return studentEnrollments.getOrDefault(studentUsername, new HashSet<>());
    }
}

