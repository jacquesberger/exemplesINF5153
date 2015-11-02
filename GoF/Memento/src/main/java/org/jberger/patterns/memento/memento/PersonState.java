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

package org.jberger.patterns.memento.memento;

import java.util.Date;

class PersonState implements Cloneable {
    private String firstName;
    private String lastName;
    private Date birth;
    private long age;
    private Date creation;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }
    
    @Override
    public PersonState clone() {
        PersonState result = new PersonState();
        result.age = this.age;
        result.birth = (Date) this.birth.clone();
        result.creation = (Date) this.creation.clone();
        result.firstName = this.firstName;
        result.lastName = this.lastName;
        return result;
    }

    @Override
    public String toString() {
        return "(" + "firstName=" + firstName + ", lastName=" + lastName + ", birth=" + birth + ", age=" + age + ", creation=" + creation + ')';
    }
}