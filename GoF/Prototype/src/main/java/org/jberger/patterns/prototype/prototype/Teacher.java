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

package org.jberger.patterns.prototype.prototype;

public class Teacher implements PersonPrototype {
    private String firstname;
    private String lastname;
    private int yearOfRecruiting;
    private int salary;

    public Teacher(String firstname, String lastname, int yearOfRecruiting, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearOfRecruiting = yearOfRecruiting;
        this.salary = salary;
    }
    
    @Override
    public PersonPrototype clone() {
        return new Teacher(firstname, lastname, yearOfRecruiting, salary);
    }

    @Override
    public String getFirstName() {
        return firstname;
    }

    @Override
    public String getLastName() {
        return lastname;
    }

    @Override
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public int getYearOfRecruiting() {
        return yearOfRecruiting;
    }

    public void setYearOfRecruiting(int yearOfRecruiting) {
        this.yearOfRecruiting = yearOfRecruiting;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + "firstname=" + firstname + ", lastname=" + lastname + ", yearOfRecruiting=" + yearOfRecruiting + ", salary=" + salary + '}';
    }
}