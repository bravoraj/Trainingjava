package com.training.exec;

public class Student {
        int studId;
        private String studName;
        private String studGrade;

        public Student(int studId, String studName, String studGrade) {
                this.studId = studId;
                this.studName = studName;
                this.studGrade = studGrade;
        }

        public Student(String studName, int studId, char studGrade) {
        }

    public Student(int i, String kapil, int i1, String nit) {
    }

    public void setStudId(int studId) {
                this.studId = studId;
        }

        public void setStudName(String studName) {
                this.studName = studName;
        }

        public void setStudGrade(String studGrade) {
                this.studGrade = studGrade;
        }


}
