import ClockText from "./components/ClockText";
import ClockTime from "./components/ClockTime";
import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";

export default function App() {
  return (
    <>
      <div className="container">
        <h1 className="fw-bolder">Bharat Clock</h1>
        <ClockText />
        <ClockTime />
      </div>
    </>
  );
}
