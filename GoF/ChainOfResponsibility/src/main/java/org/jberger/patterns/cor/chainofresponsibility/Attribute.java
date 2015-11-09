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

package org.jberger.patterns.cor.chainofresponsibility;

public class Attribute implements DocumentationProvider {
    private final Field field;
    private final String name;
    private String doc;

    public Attribute(Field field, String name, String doc) {
        this.field = field;
        this.name = name;
        this.doc = doc;
    }

    public Attribute(Field field, String name) {
        this.field = field;
        this.name = name;
    }

    public Field getField() {
        return field;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getHelp() {
        if (doc != null) {
            return doc;
        } else {
            return field.getHelp();
        }
    }
}