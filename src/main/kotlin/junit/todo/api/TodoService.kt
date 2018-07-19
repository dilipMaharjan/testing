package junit.todo.api

import junit.todo.model.Todo


/**
 * Created by Dilip Maharjan on 07/19/2018
 */
interface TodoService {
    fun retriveTodos(user: String): List<Todo>
}