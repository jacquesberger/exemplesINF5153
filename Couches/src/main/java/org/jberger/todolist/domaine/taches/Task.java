/*
 * Copyright 2012 Jacques Berger.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jberger.todolist.domaine.taches;

public class Task {

    private String description;
    private String date;
    private boolean isDone;
    
    public Task(String description, String date, boolean done) {
        this.description = description;
        this.date = date;
        isDone = done;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getDate() {
        return date;
    }
    
    public boolean isDone() {
        return isDone;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Task other = (Task) obj;
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        if ((this.date == null) ? (other.date != null) : !this.date.equals(other.date)) {
            return false;
        }
        if (this.isDone != other.isDone) {
            return false;
        }
        return true;
    }
}