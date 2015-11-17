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

public class Student implements PersonPrototype {
    private String firstname;
    private String lastname;
    private int admissionYear;
    private int fees;

    public Student(String firstname, String lastname, int admissionYear, int fees) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.admissionYear = admissionYear;
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" + "firstname=" + firstname + ", lastname=" + lastname + ", admissionYear=" + admissionYear + ", fees=" + fees + '}';
    }
    
    @Override
    public PersonPrototype clone() {
        return new Student(firstname, lastname, admissionYear, fees);
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
    
    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}