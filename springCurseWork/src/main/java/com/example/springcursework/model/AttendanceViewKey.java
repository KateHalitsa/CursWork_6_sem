package com.example.springcursework.model;

import java.io.Serializable;
import java.util.Objects;

public class AttendanceViewKey implements Serializable {
    private Integer studentId;
    private Integer groupScheduleId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getGroupScheduleId() {
        return groupScheduleId;
    }

    public void setGroupScheduleId(Integer groupScheduleId) {
        this.groupScheduleId = groupScheduleId;
    }

    public AttendanceViewKey(Integer studentId, Integer groupScheduleId) {
        this.studentId = studentId;
        this.groupScheduleId = groupScheduleId;
    }

    public AttendanceViewKey() {
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        AttendanceViewKey pk = (AttendanceViewKey) o;
        return Objects.equals(studentId, pk.studentId) &&
                Objects.equals( groupScheduleId, pk.groupScheduleId );
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, groupScheduleId );
    }

}
