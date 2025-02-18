import { useContext } from "react";
import { RiDeleteBin6Line } from "react-icons/ri";
import { TodoItemsContext } from "../store/todo-items-store";

export default function TodoItem({ todoName, todoDate }) {
  const { deleteItem } = useContext(TodoItemsContext);
  return (
    <>
      <div className="container">
        <div className="row todo-row">
          <div className="col-6">{todoName}</div>
          <div className="col-4"> {todoDate} </div>
          <div className="col-2">
            <button
              type="button"
              className="btn btn-danger todo-btn"
              onClick={() => deleteItem(todoName)}
            >
              <RiDeleteBin6Line />
            </button>
          </div>
        </div>
      </div>
    </>
  );
}
