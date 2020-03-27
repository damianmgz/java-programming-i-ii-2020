
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
    }

    public void add(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);
        }
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public int getSize() {
        return this.getSizeAboveGrade(0);
    }

    public int sum() {
        return this.sumAboveGrade(0);
    }

    public double average() {
        return this.averageGradesAboveGrade(0);
    }

    public int sumAboveGrade(int grade) {
        int sum = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            if (this.grades.get(i) >= grade) {
                sum += this.grades.get(i);
            }
        }
        return sum;
    }

    public int getSizeAboveGrade(int grade) {
        int count = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            if (this.grades.get(i) >= grade) {
                count++;
            }
        }
        return count;
    }

    public double averageGradesAboveGrade(int grade) {
        if (this.getSizeAboveGrade(grade) > 0) {
            return (double) this.sumAboveGrade(grade) / this.getSizeAboveGrade(grade);
        }
        return -1;
    }

    public double percentageAboveGrade(int grade) {
        return 100.0 * this.getSizeAboveGrade(grade) / this.getSize();
    }

    public int[] convertGradeScaleToPointScale() {
        int[] register = {0, 0, 0, 0, 0, 0};

        for (int grade : this.grades) {
            if (grade < 50) {
                register[0]++;
            } else if (grade < 60) {
                register[1]++;
            } else if (grade < 70) {
                register[2]++;
            } else if (grade < 80) {
                register[3]++;
            } else if (grade < 90) {
                register[4]++;
            } else {
                register[5]++;
            }
        }
        return register;
    }
}
