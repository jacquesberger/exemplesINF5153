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

package org.jberger.patterns.prototype.main;

import org.jberger.patterns.prototype.prototype.PersonPrototype;
import org.jberger.patterns.prototype.prototype.Student;
import org.jberger.patterns.prototype.prototype.Teacher;

public class Main {
    public static void main(String[] args) {
        Student protoStudent = new Student("", "", 2016, 5000);
        Teacher protoTeacher = new Teacher("", "", 1989, 120000);
        
        PersonPrototype newPerson = protoStudent.clone();
        newPerson.setFirstName("Jacques");
        newPerson.setLastName("Berger");
        System.out.println(newPerson);
        
        PersonPrototype newPerson2 = protoTeacher.clone();
        newPerson2.setFirstName("Steven");
        newPerson2.setLastName("Stevenson");
        System.out.println(newPerson2);
    }
}