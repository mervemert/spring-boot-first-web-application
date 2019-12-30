package com.in28minutes.springboot.web.service;

import com.in28minutes.springboot.web.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todoList = new ArrayList<>();
    private static int todoCount = 3;

    static {
        todoList.add(new Todo(1, "in28minutes", "Learn Spring MVC", new Date(), true));
        todoList.add(new Todo(2, "in28minutes", "Learn Struts", new Date(), false));
        todoList.add(new Todo(3, "in28minutes", "Learn Hibernate", new Date(), true));
    }

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<>();

        for (Todo todo : todoList) {
            if (todo.getUser().equalsIgnoreCase(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

    public Todo retrieveTodo(int id) {
        for (Todo todo : todoList) {
            if (todo.getId() == id)
                return todo;
        }
        return null;
    }

    public void addTodo(String name, String description, Date targetDate, boolean isDone) {
        todoList.add(new Todo(++todoCount, name, description, targetDate, isDone));
    }

    public void deleteTodo(int i) {
        Iterator<Todo> iterator = todoList.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId() == i)
                iterator.remove();

        }
    }

    public void updateTodo(Todo todo) {
        todoList.remove(todo);
        todoList.add(todo);
    }
}
