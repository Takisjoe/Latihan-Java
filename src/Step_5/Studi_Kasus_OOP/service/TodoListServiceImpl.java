package Step_5.Studi_Kasus_OOP.service;

import Step_5.Studi_Kasus_OOP.entity.TodoList;
import Step_5.Studi_Kasus_OOP.repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {

    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        TodoList[] model = todoListRepository.getAll();
        System.out.println("TODOLIST");
        for (int i = 0; i < model.length; i++) {
            var todoList = model[i];
            var no = i + 1;
            if (todoList != null) {
                System.out.println(no + ". " + todoList.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {
        TodoList todoList = new TodoList(todo);
        todoListRepository.add(todoList);
        System.out.println("Berhasil menambahkan : " + todo);
    }

    @Override
    public void removeTodoList(Integer number) {
        if (todoListRepository.remove(number)) {
            System.out.println("Berhasil menghapus todo : "+number);
        }else {
            System.out.println("Gagal menghapus todo : "+number);
        }
    }
}
