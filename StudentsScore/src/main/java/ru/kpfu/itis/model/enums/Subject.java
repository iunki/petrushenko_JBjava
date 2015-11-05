package ru.kpfu.itis.model.enums;

public enum Subject {

    PROGRAMMING,
    ENGLISH,
    PROBABILITY_THEORY,
    NETWORKS,
    DATABASES;

    public static Subject getSubject(Integer n) {
        for (Subject subject : values()) {
            if (subject.ordinal() == n) {
                return subject;
            }
        }
        return null;
    }
}
