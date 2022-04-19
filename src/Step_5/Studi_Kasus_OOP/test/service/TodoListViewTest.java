package Step_5.Studi_Kasus_OOP.test.service;

import Step_5.Studi_Kasus_OOP.repository.TodoListRepository;
import Step_5.Studi_Kasus_OOP.repository.TodoListRepositoryImpl;
import Step_5.Studi_Kasus_OOP.service.TodoListService;
import Step_5.Studi_Kasus_OOP.service.TodoListServiceImpl;
import Step_5.Studi_Kasus_OOP.view.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
        testShowTodolist();
    }
    public static void testShowTodolist(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);
        todoListView.showTodoList();
    }
}
