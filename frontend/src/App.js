import React from 'react';
import './App.scss';

import SlotQueryForm from "./component/SlotQueryForm";
import CampingMap from "./component/CampingMap";
import BookingForm from "./component/BookingForm";

function App() {
  return (
    <div className={["App","container"]}>
        <div className={"row"}>
            <div className={"col-md-3"}> </div>
            <div className={"col-md-6"}>
                <SlotQueryForm/>
                <br/><hr/><br/>
                <CampingMap/>
                <br/><hr/><br/>
                <BookingForm/>
            </div>
            <div className={"col-md-3"}> </div>
        </div>
    </div>
  );
}

export default App;
