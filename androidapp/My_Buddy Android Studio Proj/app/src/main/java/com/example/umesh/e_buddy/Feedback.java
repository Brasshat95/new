package com.example.umesh.e_buddy;

public class Feedback {

    String a_id;
    String b_name;
    String c_course;
    String d_feedback;

    public Feedback(){


    }

    public Feedback(String a_id, String b_name, String d_feedback, String c_course) {
        this.a_id = a_id;
        this.b_name = b_name;
        this.c_course=c_course;
        this.d_feedback = d_feedback;
    }

    public String getA_id() {
        return a_id;
    }

    public String getB_name() {
        return b_name;
    }

    public String getC_course() {
        return c_course;
    }

    public String getD_feedback() {
        return d_feedback;
    }
}
