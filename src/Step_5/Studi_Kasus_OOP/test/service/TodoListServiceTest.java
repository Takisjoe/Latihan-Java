package Step_5.Studi_Kasus_OOP.test.service;

import Step_5.Studi_Kasus_OOP.entity.TodoList;
import Step_5.Studi_Kasus_OOP.repository.TodoListRepository;
import Step_5.Studi_Kasus_OOP.repository.TodoListRepositoryImpl;
import Step_5.Studi_Kasus_OOP.service.TodoListService;
import Step_5.Studi_Kasus_OOP.service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {

        testDeleteList();

    }

    public static void testShowTodoList(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
//        todoListRepository.data[0] = new TodoList("Belajar Java");
//        todoListRepository.data[1] = new TodoList("Belajar Python");
//        todoListRepository.data[2] = new TodoList("Belajar PHP");
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }
     public static void testAddTodolist(){
         TodoListRepository todoListRepository = new TodoListRepositoryImpl();
         TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

         todoListService.addTodoList("New Belajar Ngaji");
         todoListService.addTodoList("New Belajar Inggris");

         todoListService.showTodoList();

     }

    public static void testDeleteList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar PHP");
        todoListService.addTodoList("Belajar Java");
        todoListService.addTodoList("Belajar Python");

        todoListService.removeTodoList(4);
        todoListService.removeTodoList(1);
        todoListService.showTodoList();
    }
}
