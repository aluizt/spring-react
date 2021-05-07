import BarChart from 'components/BarChart/barchart'
import DonutChart from 'components/DonutChart/donutchart'
import Footer from 'components/Footer/footer'
import DataTable from 'components/TadaTable/tadatable'
import React from 'react'
import NavBar from '../src/components/NavBar/navbar'

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py3">Dashboard de Vendas</h1>
        <div className="row px-3">
          <div className="colsm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso (%)</h5>
            <BarChart/>
          </div>
          <div className="colsm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso</h5>
            <DonutChart/>
          </div>
        </div>
        <div className="py-3">
          <h2 className="text-primary">Totas vendas</h2>
        </div>
        <DataTable/>
      </div>
      <Footer/>
    </>
  );
}

export default App;
