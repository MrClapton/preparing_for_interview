package ru.geekbrains.lesson1.task1.classbook;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private String gender;
    private String country;
    private String address;
    private String phone;

    public static class Builder {
        private final Person person = new Person();

        public Builder firstName(String firstName) {
            person.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            person.lastName = lastName;
            return this;
        }

        public Builder middleName(String middleName) {
            person.middleName = middleName;
            return this;
        }

        public Builder age(int age) {
            person.age = age;
            return this;
        }

        public Builder gender(String gender) {
            person.gender = gender;
            return this;
        }

        public Builder country(String country) {
            person.country = country;
            return this;
        }

        public Builder address(String address) {
            person.address = address;
            return this;
        }

        public Builder phone(String phone) {
            person.phone = phone;
            return this;
        }


        public Person build() {
            return person;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}