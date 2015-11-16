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

package org.jberger.patterns.proxy.main;

import org.jberger.patterns.proxy.proxy.PermissionDeniedException;
import org.jberger.patterns.proxy.proxy.PersonInterface;
import org.jberger.patterns.proxy.proxy.PersonProxy;

public class Main {
    public static void main(String[] args) {
        PersonInterface person = new PersonProxy("Jacques", "Berger", 1);
        try {
            person.setFirstName("Steve");
        } catch (PermissionDeniedException e) {
            System.out.println("L'exception a été levée, comme prévu.");
        }
    }
}