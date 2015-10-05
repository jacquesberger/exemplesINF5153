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
package org.jberger.todolist.techniques.data;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import org.jberger.todolist.domaine.taches.Task;
import org.jberger.todolist.domaine.taches.TodoList;

public class JsonDocumentMapper {
    
    JSONObject root;
    
    public JsonDocumentMapper(String jsonDocument) {
        try {
            root = (JSONObject) JSONSerializer.toJSON(jsonDocument);
        } catch (JSONException e) {
            throw new InvalidJsonException();
        }
    }
    
    public TodoList getTodoList() {
        TodoList todo = new TodoList();
        
        JSONArray todos = root.getJSONArray("todo");
        int count = todos.size();
        for (int i = 0; i < count; i++) {
            JSONObject jsonTask = todos.getJSONObject(i);
            Task task = new Task(jsonTask.getString("description"),
                    jsonTask.getString("date"), jsonTask.getBoolean("done"));
            todo.addTask(task);
        }
        
        return todo;
    }
}
