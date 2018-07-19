package junit.todo

import junit.todo.api.TodoService
import junit.todo.model.Todo


/**
 * Created by Dilip Maharjan on 07/19/2018
 */


class TodoRepository(private val todoService: TodoService) {

    fun retrieveRelatedToKotlin(user: String): List<Todo> {
        val todos = todoService.retriveTodos(user)
        val kotlintTodos = todos.filter {
            it.related == "kotlin"
        }
        return kotlintTodos
    }
}