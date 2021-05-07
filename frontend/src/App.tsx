import Footer from 'components/Footer/footer'
import DataTable from 'components/TadaTable/tadatable'
import NavBar from '../src/components/NavBar/navbar'

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">Hellou World</h1>
        <DataTable/>
      </div>
      <Footer/>
    </>
  );
}

export default App;
