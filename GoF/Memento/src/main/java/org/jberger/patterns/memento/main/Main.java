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

package org.jberger.patterns.memento.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jberger.patterns.memento.memento.Person;
import org.jberger.patterns.memento.memento.PersonMemento;

public class Main {
 
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        Person person = new Person("Jacques", "Berger", df.parse("1964-12-01"));
        person.setBirthDate(df.parse("1980-12-01"));
        PersonMemento backup = person.createMemento();
        
        person.setFirstName("Steven");
        person.setLastName("Stevenson");
        person.setBirthDate(df.parse("1999-12-17"));
        
        System.out.println("Avant : " + person);
        person.setMemento(backup);
        System.out.println("Après : " + person);
        
        Person anotherPerson = new Person("", "", new Date());
        anotherPerson.setMemento(backup);
        System.out.println("Nouvelle instance : " + anotherPerson);
    }
}