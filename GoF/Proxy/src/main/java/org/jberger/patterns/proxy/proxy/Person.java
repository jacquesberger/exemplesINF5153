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

class Person implements PersonInterface {
    private String firstname;
    private String lastname;
    private int sex;
    
    public Person(String firstname, String lastname, int sex) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.sex = sex;
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
    public int getSex() {
        return sex;
    }

    @Override
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public void setSex(int sex) {
        this.sex = sex;
    }
}