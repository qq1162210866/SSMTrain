package com.psq.ssmtrain.bean;

public class Stu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stu.id
     *
     * @mbg.generated Thu Jul 19 00:14:33 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stu.name
     *
     * @mbg.generated Thu Jul 19 00:14:33 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stu.age
     *
     * @mbg.generated Thu Jul 19 00:14:33 CST 2018
     */
    private String age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stu.sex
     *
     * @mbg.generated Thu Jul 19 00:14:33 CST 2018
     */
    private String sex;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stu.id
     *
     * @return the value of stu.id
     *
     * @mbg.generated Thu Jul 19 00:14:33 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stu.id
     *
     * @param id the value for stu.id
     *
     * @mbg.generated Thu Jul 19 00:14:33 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stu.name
     *
     * @return the value of stu.name
     *
     * @mbg.generated Thu Jul 19 00:14:33 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stu.name
     *
     * @param name the value for stu.name
     *
     * @mbg.generated Thu Jul 19 00:14:33 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stu.age
     *
     * @return the value of stu.age
     *
     * @mbg.generated Thu Jul 19 00:14:33 CST 2018
     */
    public String getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stu.age
     *
     * @param age the value for stu.age
     *
     * @mbg.generated Thu Jul 19 00:14:33 CST 2018
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stu.sex
     *
     * @return the value of stu.sex
     *
     * @mbg.generated Thu Jul 19 00:14:33 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stu.sex
     *
     * @param sex the value for stu.sex
     *
     * @mbg.generated Thu Jul 19 00:14:33 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}