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
package org.jberger.patterns.iterator.iterator;

public class PersonNameIterator implements StringIterator {
    private Person person;
    private int index = 1;
    
    public PersonNameIterator(Person person) {
        this.person = person;
    }

    @Override
    public String first() {
        index = 1;
        return currentItem();
    }

    @Override
    public String next() {
        if (isDone()) {
            return null;
        } else {
            index++;
            return currentItem();
        }
    }

    @Override
    public boolean isDone() {
        return index == 3;
    }

    @Override
    public String currentItem() {
        switch (index) {
            case 1:
                return person.getFirstName();
            case 2:
                return person.getMiddleName();
            case 3:
                return person.getLastName();
            default:
                return null;
        }
    }
}