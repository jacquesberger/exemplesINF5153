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

package org.jberger.patterns.observer.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.jberger.patterns.observer.domain.Person;
import org.jberger.patterns.observer.foundation.PersonLogger;

public class Main {
    public static void main(String[] args) throws ParseException {
        PersonLogger logger = new PersonLogger(System.out);
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        Person a = new Person("Jacques", "Berger", df.parse("1957-12-01"));
        a.attach(logger);
        
        a.setFirstName("Roberto");
        a.setFirstName("Julia");
        
        Person b = new Person("Elvis", "Presley", df.parse("1932-04-28"));
        b.attach(logger);
        
        a.setFirstName("Michael");
        b.setLastName("Costello");
        
        b.detach(logger);
        b.setFirstName("Steven");
    }
}