package Step_5.Studi_Kasus_OOP.view;

import Step_5.Studi_Kasus_OOP.service.TodoListService;
import Step_5.Studi_Kasus_OOP.util.InputUtil;

import java.io.IOException;

public class TodoListView {
    TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }


    public void showTodoList(){
        while (true){
            todoListService.showTodoList();
            System.out.println("Menu");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = InputUtil.input("Pilih");

            if (input.equals("1")) {
                var dataInput = InputUtil.input("tambah");
                addTodoList(dataInput);
            } else if (input.equals("2")) {
                removeTodoList();
            }else if(input.equals("x")){
                break;
            }else {
                System.out.println("Pilihan salah");
            }
        }
    }

    public void addTodoList(String tambah) {
        todoListService.addTodoList(tambah);
    }

    public void removeTodoList() {
        var num = InputUtil.input("Hapus Nomor");
        todoListService.removeTodoList(Integer.valueOf(num));

    }
}
