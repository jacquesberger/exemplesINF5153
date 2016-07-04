/* Copyright 2016 Jacques Berger

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
package org.jberger.patterns.iterator.main;

import org.jberger.patterns.iterator.iterator.Person;
import org.jberger.patterns.iterator.iterator.StringIterator;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Jacques", "Robert", "Berger");
        StringIterator iterator = p.createIterator();
        
        System.out.println(iterator.first());
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
        
        System.out.println(iterator.first());
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}