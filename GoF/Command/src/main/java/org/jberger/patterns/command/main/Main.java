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

package org.jberger.patterns.command.main;

import org.jberger.patterns.command.command.ChangeFirstNameCommand;
import org.jberger.patterns.command.command.ChangeLastNameCommand;
import org.jberger.patterns.command.command.ChangeSexCommand;
import org.jberger.patterns.command.command.Command;
import org.jberger.patterns.command.command.MacroCommand;
import org.jberger.patterns.command.domain.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jacques", "Berger", 1, 66);
        MacroCommand commandList = new MacroCommand();
        
        commandList.add(new ChangeFirstNameCommand(person, "Julia"));
        Command lastName = new ChangeLastNameCommand(person, "Stevenson");
        commandList.add(lastName);
        commandList.add(new ChangeSexCommand(person, 2));
        
        System.out.println(person);
        
        commandList.execute();
        System.out.println(person);
        
        lastName.unexecute();
        System.out.println(person);
    }
}