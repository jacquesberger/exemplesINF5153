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

import java.util.List;
import org.jberger.todolist.domaine.taches.Task;
import org.jberger.todolist.domaine.taches.TodoList;
import org.junit.Test;
import static org.junit.Assert.*;

public class JsonDocumentMapperTest {

    @Test
    public void testGetAllTasksWith1Task() {
        String jsonDocument = "{\"todo\":[{\"description\":\"Test\",\"date\":\"2012-11-19\",\"done\":false}]}";
        JsonDocumentMapper mapper = new JsonDocumentMapper(jsonDocument);
        TodoList todo = mapper.getTodoList();

        List<Task> tasks = todo.getAllTasks();
        if (tasks.size() != 1) {
            fail("Wrong list size");
        }

        Task expected = new Task("Test", "2012-11-19", false);
        assertEquals(expected, tasks.get(0));
    }

    @Test
    public void testGetAllTasksWith3Tasks() {
        String jsonDocument = "{\"todo\":[{\"description\":\"Test\",\"date\":\"2012-11-19\",\"done\":false},{\"description\":\"Test\",\"date\":\"2012-11-19\",\"done\":false},{\"description\":\"Test\",\"date\":\"2012-11-19\",\"done\":false}]}";
        JsonDocumentMapper mapper = new JsonDocumentMapper(jsonDocument);
        TodoList todo = mapper.getTodoList();

        List<Task> tasks = todo.getAllTasks();
        assertEquals(3, tasks.size());
    }
    
    @Test
    public void testGetAllTasksWithNoTask() {
        String jsonDocument = "{\"todo\":[]}";
        JsonDocumentMapper mapper = new JsonDocumentMapper(jsonDocument);
        TodoList todo = mapper.getTodoList();

        List<Task> tasks = todo.getAllTasks();
        assertTrue(tasks.isEmpty());
    }
    
    @Test(expected=InvalidJsonException.class)
    public void testInvalidJson() {
        JsonDocumentMapper mapper = new JsonDocumentMapper("{\"todo\":[}");
    }
}
