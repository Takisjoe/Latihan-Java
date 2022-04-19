package Step_5.Studi_Kasus_OOP.repository;

import Step_5.Studi_Kasus_OOP.entity.TodoList;

public interface TodoListRepository {

    TodoList[] getAll();

    void add(TodoList todoList);

    boolean remove(Integer number);

}
