package com.az.designprinciple.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaDiscountCourse(96, "java", 340d);
        System.out.println("id:" + javaCourse.getId() +
                "course:" + javaCourse.getName() +
                "price" + javaCourse.getPrice());
    }
}
