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

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Person {
    private PersonState state;
    
    public Person(String firstName, String lastName, Date birth) {
        state = new PersonState();
        state.setFirstName(firstName);
        state.setLastName(lastName);
        state.setBirth(birth);
        state.setCreation(new Date());
        state.setAge(calculateAge(birth));
    }

    private long calculateAge(Date birth) {
        LocalDate start = birth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate end = LocalDate.now();
        long years = ChronoUnit.YEARS.between(start, end);
        return years;
    }

    @Override
    public String toString() {
        return state.toString();
    }
    
    public String getFirstName() {
        return state.getFirstName();
    }
    
    public void setFirstName(String firstName) {
        state.setFirstName(firstName);
    }
    
    public String getLastName() {
        return state.getLastName();
    }
    
    public void setLastName(String lastName) {
        state.setLastName(lastName);
    }
    
    public long getAge() {
        return state.getAge();
    }
    
    public void setBirthDate(Date birth) {
        state.setBirth(birth);
        state.setAge(calculateAge(birth));
    }
    
    public PersonMemento createMemento() {
        return new PersonMemento(state);
    }
    
    public void setMemento(PersonMemento memento) {
        state = memento.getState().clone();
    }
}