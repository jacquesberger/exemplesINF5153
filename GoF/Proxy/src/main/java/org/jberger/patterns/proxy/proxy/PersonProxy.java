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

package org.jberger.patterns.proxy.proxy;

import org.jberger.patterns.proxy.domain.Users;

public class PersonProxy implements PersonInterface {
    private final Person person;
    
    public PersonProxy(String firstname, String lastname, int sex) {
        person = new Person(firstname, lastname, sex);
    }

    @Override
    public String getFirstName() {
        return person.getFirstName();
    }

    @Override
    public String getLastName() {
        return person.getLastName();
    }

    @Override
    public int getSex() {
        return person.getSex();
    }

    @Override
    public void setFirstName(String firstname) {
        if (Users.getInstance().getCurrentUser().equals("root")) {
            person.setFirstName(firstname);
        } else {
            throw new PermissionDeniedException();
        }
    }

    @Override
    public void setLastName(String lastname) {
        if (Users.getInstance().getCurrentUser().equals("root")) {
            person.setLastName(lastname);
        } else {
            throw new PermissionDeniedException();
        }
    }

    @Override
    public void setSex(int sex) {
        if (Users.getInstance().getCurrentUser().equals("root")) {
            person.setSex(sex);
        } else {
            throw new PermissionDeniedException();
        }
    }
}