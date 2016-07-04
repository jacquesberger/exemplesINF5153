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
package org.jberger.patterns.composite.composite;

public class Line implements Node {

    public Line() {
    }
    
    @Override
    public String print() {
        return "<hr>";
    }

    @Override
    public void add(Node child) {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void remove(Node child) {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public Node getChild(int index) {
        throw new UnsupportedOperationException("Not supported.");
    }
}