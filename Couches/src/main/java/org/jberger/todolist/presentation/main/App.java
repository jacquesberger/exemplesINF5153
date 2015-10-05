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
package org.jberger.todolist.presentation.main;

import org.jberger.todolist.fondation.fichiers.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jberger.todolist.techniques.data.JsonDocumentMapper;
import org.jberger.todolist.domaine.taches.Task;
import org.jberger.todolist.domaine.taches.TodoList;

public class App {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String json = FileReader.loadFileIntoString("testfile.json", "UTF-8");
        JsonDocumentMapper mapper = new JsonDocumentMapper(json);
        TodoList todolist = mapper.getTodoList();
        for (Task task : todolist.getUndoneTasks("2012-11-19")) {
            System.out.println("À faire aujourd'hui : " + task.getDescription() + " (" + task.getDate() + ")");
        }
    }
}