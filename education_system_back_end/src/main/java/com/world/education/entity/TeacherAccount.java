package com.world.education.entity;

import java.io.Serializable;

public class TeacherAccount implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_account.teacher_Id
     *
     * @mbggenerated
     */
    private Integer teacherId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_account.teacher_Password
     *
     * @mbggenerated
     */
    private String teacherPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_account.teacher_Email
     *
     * @mbggenerated
     */
    private String teacherEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_account.account_State
     *
     * @mbggenerated
     */
    private Integer accountState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_account.teacher_Id
     *
     * @return the value of teacher_account.teacher_Id
     *
     * @mbggenerated
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_account.teacher_Id
     *
     * @param teacherId the value for teacher_account.teacher_Id
     *
     * @mbggenerated
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_account.teacher_Password
     *
     * @return the value of teacher_account.teacher_Password
     *
     * @mbggenerated
     */
    public String getTeacherPassword() {
        return teacherPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_account.teacher_Password
     *
     * @param teacherPassword the value for teacher_account.teacher_Password
     *
     * @mbggenerated
     */
    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword == null ? null : teacherPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_account.teacher_Email
     *
     * @return the value of teacher_account.teacher_Email
     *
     * @mbggenerated
     */
    public String getTeacherEmail() {
        return teacherEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_account.teacher_Email
     *
     * @param teacherEmail the value for teacher_account.teacher_Email
     *
     * @mbggenerated
     */
    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail == null ? null : teacherEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_account.account_State
     *
     * @return the value of teacher_account.account_State
     *
     * @mbggenerated
     */
    public Integer getAccountState() {
        return accountState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_account.account_State
     *
     * @param accountState the value for teacher_account.account_State
     *
     * @mbggenerated
     */
    public void setAccountState(Integer accountState) {
        this.accountState = accountState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teacherId=").append(teacherId);
        sb.append(", teacherPassword=").append(teacherPassword);
        sb.append(", teacherEmail=").append(teacherEmail);
        sb.append(", accountState=").append(accountState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}