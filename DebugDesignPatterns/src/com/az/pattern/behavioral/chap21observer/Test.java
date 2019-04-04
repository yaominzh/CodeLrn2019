package com.az.pattern.behavioral.chap21observer;

public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java Debug Design Patterns");
        Teacher teacher = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Beta");
        course.addObserver(teacher);
        course.addObserver(teacher2);

        Question question = new Question();
        question.setUserName("User Tester");
        question.setQuestionContent("how to write Java main");
        course.produceQuestion(course, question);
        System.out.println("############end");
    }
}
