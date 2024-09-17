import jdk.dynalink.beans.StaticClass;
//package exercises.classespart1.src.main.java;

public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String n, int id, int numb, double g){
                this.name = n;
                this.studentId = id;
                this.numberOfCredits = numb;
                this.gpa = g;
        }
        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        public void setName(String name) {
                this.name = name;
        }

        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }

        public void setGpa(double gpa) {
                this.gpa = gpa;
        }

        private void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }

        public String getName() {
                return name;
        }

        public int getStudentId() {
                return studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }

        public static String getGradeLevel(int credits){
                if(credits>=0&&credits<30)
                        return "Freshman";
                else if(credits>=30&&credits<60)
                        return "Sophomore";
                else if(credits>=60&&credits<90)
                        return "Junior";
                else
                        return "Senior";
        }

        public void addGrade(int courseCredits, double grade){
                double totalQualityScore = this.gpa * this.numberOfCredits;
                totalQualityScore += courseCredits * grade;
                this.numberOfCredits += courseCredits;
                this.gpa = totalQualityScore/this.numberOfCredits;
        }

        public String toString() {

                String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
                return studentReport;
        }

        public boolean equals(Object toBeCompared) {
                if (toBeCompared == this) {
                        return true;
                }

                if (toBeCompared == null) {
                        return false;
                }

                if (toBeCompared.getClass() != getClass()) {
                        return false;
                }

                Student theStudent = (Student) toBeCompared;
                return theStudent.getStudentId() == getStudentId();
        }

}
