public class Grades {
    private int[] grades;
    private int tabElement;

    public Grades() {
        this.grades = new int[10];
        this.tabElement = 0;
    }

    public void add(int value) {
        if (this.tabElement == 10) {
            return;
        }
        this.grades[this.tabElement] = value;
        this.tabElement++;
    }

    public int[] lastGrade() {
        if (this.tabElement > 0) {
            return grades;
        }
        return new int[0];
    }

    public double averange() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades.length;
        }
        return sum / grades.length;
    }
}