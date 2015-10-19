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

package org.jberger.patterns.abstfactory.abstractfactory;

class ChromeLink implements Link {

    private String classProperty = "";
    private String id = "";
    private String destination = "";
    private String caption = "";
    
    public ChromeLink(String destination, String caption) {
        this.caption = caption;
        this.destination = destination;
    }
    
    @Override
    public void setClass(String value) {
        classProperty = value;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public String getAsHTML() {
        return "<chrome:a href='" + destination + "'" + printId() + printClass() + ">" + caption + "</a>";
    }
    
    private String printId() {
        if (id.length() > 0) {
            return " id='" + id + "'";
        } else {
            return "";
        }
    }
    
    private String printClass() {
        if (classProperty.length() > 0) {
            return " class='" + classProperty + "'";
        } else {
            return "";
        }
    }
}