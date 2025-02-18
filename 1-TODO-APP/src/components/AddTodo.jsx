import { useContext, useRef } from "react";
import styles from "./AddTodo.module.css";
import { BiMessageAdd } from "react-icons/bi";
import { TodoItemsContext } from "../store/todo-items-store";

export default function AddTodo() {
  const { addNewItem } = useContext(TodoItemsContext);
  const todoNameElement = useRef();
  const dueDateElement = useRef();

  const handleAddButtonClicked = (event) => {
    event.preventDefault();
    const todoName = todoNameElement.current.value;
    const dueDate = dueDateElement.current.value;
    todoNameElement.current.value = "";
    dueDateElement.current.value = "";
    addNewItem(todoName, dueDate);
  };

  return (
    <>
      <div className="container text-center">
        <form className="row todo-row" onSubmit={handleAddButtonClicked}>
          <div className="col-5">
            <input
              className={styles.todoInput}
              type="text"
              ref={todoNameElement}
              placeholder="Enter Todo here"
            />
          </div>
          <div className="col-3">
            <input type="date" ref={dueDateElement} />
          </div>
          <div className="col-4">
            <button className="btn btn-success todo-btn" type="submit">
              <BiMessageAdd />
            </button>
          </div>
        </form>
      </div>
    </>
  );
}
