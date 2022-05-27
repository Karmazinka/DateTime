package org.itstep;

public class Person {
    private String firstName;
    private String lastName;
    private TypeSex sex;
    private Date dateBirth;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, TypeSex sex, Date dateBirth) {
        this(firstName, lastName);
        this.lastName = lastName;
        this.sex = sex;
        this.date
        Birth = dateBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public TypeSex getSex() {
        return sex;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
}
