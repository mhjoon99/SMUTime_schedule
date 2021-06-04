package com.cookandroid.registeration;

public class Course {

    int courseID; //강의 고유 번호
    int courseYear; //해당 년도
    String courseTerm; //해당 학기
    String courseArea; //강의 영역
    String courseMajor; //해당 학과
    String courseGrade; //해당 학년
    String courseTitle; //강의 제목
    int courseCredit; //강의 학점
    int courseDivide; //강의 분반
    String courseProfessor; //강의 교수
    String courseTime; //강의 시간대
    String courseRoom; //강의실

    public Course(int courseID, int courseYear, String courseTerm, String courseArea, String courseMajor, String courseGrade, String courseTitle, int courseCredit, int courseDivide, String courseProfessor, String courseTime, String courseRoom) {
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }

    public String getCourseTerm() {
        return courseTerm;
    }

    public void setCourseTerm(String courseTerm) {
        this.courseTerm = courseTerm;
    }

    public String getCourseArea() {
        return courseArea;
    }

    public void setCourseArea(String courseArea) {
        this.courseArea = courseArea;
    }

    public String getCourseMajor() {
        return courseMajor;
    }

    public void setCourseMajor(String courseMajor) {
        this.courseMajor = courseMajor;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public int getCourseDivide() {
        return courseDivide;
    }

    public void setCourseDivide(int courseDivide) {
        this.courseDivide = courseDivide;
    }

    public String getCourseProfessor() {
        return courseProfessor;
    }

    public void setCourseProfessor(String courseProfessor) {
        this.courseProfessor = courseProfessor;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public String getCourseRoom() {
        return courseRoom;
    }

    public void setCourseRoom(String courseRoom) {
        this.courseRoom = courseRoom;
    }

    public Course(int courseID, String term, String area, int courseCredit, int courseDivide) {
        this.courseID = this.courseID;
        this.courseTitle = courseTitle;
        this.courseDivide = courseDivide;
        this.courseGrade = courseGrade;
    }
    public Course(int courseID, String courseTitle, int courseDivide, String courseGrade, int courseCredit) {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.courseDivide = courseDivide;
        this.courseGrade = courseGrade;
        this.courseCredit = courseCredit;
    }
     
    // courseTime과 courseProfesser 위치 바꿔줌
    public Course(int courseID, String courseGrade, String courseTitle, int courseCredit, int courseDivide, String courseProfessor, String courseTime) {
        this.courseID = courseID;
        this.courseGrade = courseGrade;
        this.courseTitle = courseTitle;
        this.courseCredit = courseCredit;
        this.courseDivide = courseDivide;
        this.courseProfessor = courseProfessor;
        this.courseTime = courseTime;
    }

    public Course(int courseID, int courseYear, String courseTerm, String courseArea, String courseMajor, String courseGrade, String courseTitle, int courseCredit, int courseDivide, int coursePersonnel, String courseProfessor, String courseTime, String courseRoom) {
        this.courseID = courseID;
        this.courseYear = courseYear;
        this.courseTerm = courseTerm;
        this.courseArea = courseArea;
        this.courseMajor = courseMajor;
        this.courseGrade = courseGrade;
        this.courseTitle = courseTitle;
        this.courseCredit = courseCredit;
        this.courseDivide = courseDivide;
        this.courseProfessor = courseProfessor;
        this.courseTime = courseTime;
        this.courseRoom = courseRoom;

    }
}
