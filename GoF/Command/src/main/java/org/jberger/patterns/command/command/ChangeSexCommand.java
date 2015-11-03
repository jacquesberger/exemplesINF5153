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

package org.jberger.patterns.command.command;

import org.jberger.patterns.command.domain.Person;

public class ChangeSexCommand implements Command {
    private final Person person;
    private final int newSex;
    private int oldSex;
    private boolean executed = false;
    
    public ChangeSexCommand(Person person, int newSex) {
        this.person = person;
        this.newSex = newSex;
    }
    
    @Override
    public void execute() {
        oldSex = person.getSex();
        person.setSex(newSex);
        executed = true;
    }

    @Override
    public void unexecute() {
        if (executed) {
            person.setSex(oldSex);
        }
    }
}