package StreamSourceChallenge;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainFinalChallenge {
    public static void main(String[] args) {
        Course pymc = new Course("PYMC", "Python Masterclass");
        Course jmc = new Course("JMC", "Java Masterclass");
        Course jgGames = new Course("JGAME", "Creating games in java");

        int currentYear = LocalDate.now().getYear();
        List<Student> students = Stream
                .generate(() -> Student.getRandomStudent(jmc, pymc, jgGames))
                .filter(s -> s.getYearEnrolled() >= (currentYear - 4))
                .limit(10000)
                .toList();

        System.out.println(students
                .stream()
                .mapToInt(Student::getYearEnrolled)
                .summaryStatistics()
        );

        var mappedActivity = students
                .stream()
                .flatMap(s -> s.getEngagementMap()
                        .values()
                        .stream())
                .collect(
                        Collectors.groupingBy(CourseEngagement::getCourseCode,
                        Collectors.counting()));

        mappedActivity.forEach((k, v) -> System.out.println(k + " " + v));

        var classCounts = students
                .stream()
                .collect(
                        Collectors.groupingBy(s -> s.getEngagementMap().size(),
                                Collectors.counting()));

        classCounts.forEach((k, v) -> System.out.println(k + " " + v));

        var persentages = students
                .stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(Collectors.groupingBy(CourseEngagement::getCourseCode,
                                Collectors.averagingDouble(CourseEngagement::getPercentComplete)));

        persentages.forEach((k, v) -> System.out.println(k + " " + v));

        var yearMap = students
                .stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(Collectors.groupingBy(CourseEngagement::getCourseCode,
                        Collectors.groupingBy(CourseEngagement::getLastActivityYear,
                                Collectors.counting())));

        yearMap.forEach((k, v) -> System.out.println(k + " " + v));

        students.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(Collectors.groupingBy(CourseEngagement::getEnrollmentYear,
                        Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
