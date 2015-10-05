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

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class TodoListTest {

    @Test
    public void testGetAllTasksWith1Task() {
        Task expected = new Task("Test", "2012-11-19", false);

        TodoList todo = new TodoList();
        todo.addTask(expected);

        List<Task> tasks = todo.getAllTasks();
        if (tasks.size() != 1) {
            fail("Wrong list size");
        }

        assertEquals(expected, tasks.get(0));
    }

    @Test
    public void testGetAllTasksWith3Tasks() {
        TodoList todo = new TodoList();
        todo.addTask(new Task("desc", "2012-11-19", false));
        todo.addTask(new Task("desc", "2012-11-19", false));
        todo.addTask(new Task("desc", "2012-11-19", false));

        List<Task> tasks = todo.getAllTasks();
        assertEquals(3, tasks.size());
    }

    @Test
    public void testGetAllTasksWithNoTask() {
        TodoList todo = new TodoList();
        List<Task> tasks = todo.getAllTasks();
        assertTrue(tasks.isEmpty());
    }

    @Test
    public void testGetAllUndoneTasksForToday() {
        String today = "2012-11-18";
        TodoList todo = new TodoList();
        todo.addTask(new Task("Done", today, true));
        Task expected = new Task("Undone", today, false);
        todo.addTask(expected);

        List<Task> list = todo.getUndoneTasks(today);
        assertEquals(expected, list.get(0));
    }

    @Test
    public void testGetAllUndoneTasksForTodayAndPastDays() {
        String today = "2012-11-18";
        TodoList todo = new TodoList();
        todo.addTask(new Task("Undone yesterday", "2012-11-17", false));
        todo.addTask(new Task("Undone", today, false));
        todo.addTask(new Task("Done", today, true));

        List<Task> list = todo.getUndoneTasks(today);
        assertEquals(2, list.size());
    }

    @Test
    public void testGetAllUndoneTasksForTodayNoResult() {
        TodoList todo = new TodoList();
        todo.addTask(new Task("Done", "2012-11-19", true));
        todo.addTask(new Task("Undone", "2012-11-19", false));

        List<Task> list = todo.getUndoneTasks("2012-11-18");
        assertTrue(list.isEmpty());
    }
}