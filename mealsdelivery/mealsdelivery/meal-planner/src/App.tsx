import './App.css';
import Header from './components/Header';
import SearchBar from './components/SearchBar';
import Footer from './components/Footer';

function App() {
  return (
    <div className="app-container">
      <Header />
      <main className="main-content">
        <h1 className="headline">Wellness begins with every bite.</h1>
        <SearchBar />
        <div className="category-buttons">
          <button>Vegetarian</button>
          <button>Vegan</button>
          <button>Pescatarian</button>
        </div>
        <div className="auth-buttons">
          <button className="login">Log In</button>
          <button className="signup">Sign Up</button>
        </div>
      </main>
      <Footer />
    </div>
  );
}

export default App;
