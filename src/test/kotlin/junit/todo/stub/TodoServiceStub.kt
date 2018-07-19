package junit.todo.stub

import junit.todo.api.TodoService
import junit.todo.model.Todo


/**
 * Created by Dilip Maharjan on 07/19/2018
 */
class TodoServiceStub : TodoService {
    override fun retriveTodos(user: String): List<Todo> {
        return listOf(
            Todo(1, "basics", "kotlin"),
            Todo(2, "intermediate", "kotlin"),
            Todo(3, "advance", "kotlin"),
            Todo(4, "basics", "java"),
            Todo(5, "intermediate", "java"),
            Todo(6, "advance", "java")
        )
    }
}