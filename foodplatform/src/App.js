
import './App.css';
import { Routes, Route } from 'react-router-dom';
import { Restaurants } from './Pages/Restaurants';
import {Login} from './Pages/Login'

function App() {
  return (
    <Routes>
      <Route path="/" element={<Restaurants/>}></Route>
      <Route path="/login" element={<Login/>}></Route>
    </Routes>

  );
}

export default App;
