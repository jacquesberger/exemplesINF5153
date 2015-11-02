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

package org.jberger.patterns.observer.foundation;

import java.io.PrintStream;
import org.jberger.patterns.observer.observer.Observer;
import org.jberger.patterns.observer.observer.Subject;

public class PersonLogger implements Observer, Comparable {
    private final PrintStream out;
    
    public PersonLogger(PrintStream out) {
        this.out = out;
    }

    @Override
    public void update(Subject subject) {
        out.println("Changement d'une personne : " + subject);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        } else {
            return -1;
        }
    }
}