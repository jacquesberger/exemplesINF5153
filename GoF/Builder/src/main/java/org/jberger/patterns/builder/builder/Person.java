/* Copyright 2015 Jacques Berger

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package org.jberger.patterns.builder.builder;

public class Person {
    private final String firstname;
    private final String lastname;
    private final int sex;
    private final int yearOfBirth;
    private final String degreeName;
    private final String streetName;

    public static class Builder {
        private String firstname = "";
        private String lastname = "";
        private int sex = 0;
        private int yearOfBirth = 1990;
        private String degreeName = "";
        private String streetName = "";

        public Builder() {
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public int getYearOfBirth() {
            return yearOfBirth;
        }

        public void setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
        }

        public String getDegreeName() {
            return degreeName;
        }

        public void setDegreeName(String degreeName) {
            this.degreeName = degreeName;
        }

        public String getStreetName() {
            return streetName;
        }

        public void setStreetName(String streetName) {
            this.streetName = streetName;
        }
        
        public Person getResult() {
            return new Person(this);
        }
    }
    
    private Person(Builder builder) {
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.sex = builder.sex;
        this.yearOfBirth = builder.yearOfBirth;
        this.degreeName = builder.degreeName;
        this.streetName = builder.streetName;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getSex() {
        return sex;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public String getStreetName() {
        return streetName;
    }

    @Override
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + ", sex=" + sex + ", yearOfBirth=" + yearOfBirth + ", degreeName=" + degreeName + ", streetName=" + streetName + '}';
    }
}