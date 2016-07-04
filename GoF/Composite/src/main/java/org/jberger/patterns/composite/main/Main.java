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
package org.jberger.patterns.composite.main;

import org.jberger.patterns.composite.composite.Division;
import org.jberger.patterns.composite.composite.Image;
import org.jberger.patterns.composite.composite.Line;
import org.jberger.patterns.composite.composite.Link;
import org.jberger.patterns.composite.composite.Node;
import org.jberger.patterns.composite.composite.Text;

public class Main {
    public static void main(String[] args) {
        Node root = buildRoot();
        
        System.out.println(root.print());
    }

    private static Node buildRoot() {
        Node root = new Division();
        root.add(new Text("Bonjour"));
        root.add(new Line());
        root.add(new Image("test.png", "Image inutile"));
        root.add(new Line());
        Node link = new Link("/test");
        root.add(link);
        link.add(new Text("Cliquez ici "));
        link.add(new Image("small.png", "icône"));
        return root;
    }
}