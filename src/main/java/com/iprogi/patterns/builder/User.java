package com.iprogi.patterns.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Dmitriy E. Nosov <br>
 * @date: 25.09.14 13:36 <br>
 * @description: <br>
 */
public class User {
    private static final Logger logger = LoggerFactory.getLogger(User.class);

    private String firstname;
    private String surname;
    private String lastname;
    private int age;

    public User(String firstname, String surname, String lastname, int age) {
        this.firstname = firstname;
        this.surname = surname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("firstname='").append(firstname).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Builder class for constructing a {@link User} object
     */
    public static class Builder {

        private String firstname = "";
        private String surname = "";
        private String lastname = "";
        private int age = 0;

        /**
         * Overwrites user with the user provided in {@link User}
         *
         * @param user {@link User} to overwrite
         * @return {@link Builder}
         */
        public Builder withUser(final User user) {
            this.firstname = user.getFirstname();
            this.surname = user.getSurname();
            this.age = user.getAge();
            this.lastname = user.getLastname();
            return this;
        }

        /**
         * Sets the firstname
         *
         * @param firstname First Name
         * @return {@link Builder}
         */
        public Builder withFirstname(final String firstname) {
            this.firstname = firstname;
            return this;
        }

        /**
         * Sets the surname
         *
         * @param surname Surname
         * @return {@link Builder}
         */
        public Builder withSurname(final String surname) {
            this.surname = surname;
            return this;
        }

        /**
         * Sets the lastname value
         *
         * @param lastname Lastname
         * @return {@link Builder}
         */
        public Builder withLastname(final String lastname) {
            this.lastname = lastname;
            return this;
        }

        /**
         * Sets the age
         *
         * @param age Age
         * @return {@link Builder}
         */
        public Builder withAge(final int age) {
            this.age = age;
            return this;
        }


        /**
         * Builds a {@link User} object with the provided values
         *
         * @return {@link User}
         */
        public User build() {
            return new User(firstname, surname, lastname, age);
        }
    }

}
