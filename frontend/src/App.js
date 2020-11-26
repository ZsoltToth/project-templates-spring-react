import React from 'react';
import './App.scss';

import SlotQueryForm from "./component/SlotQueryForm";
import CampingMap from "./component/CampingMap";
import BookingForm from "./component/BookingForm";

function App() {
  return (
    <div className={["App","container"]}>

        <div className={["myframe", "col-md-offset-1"]}>
            <div className={"row"}>

                <div className={"col col-left"}>
                        <SlotQueryForm/>
                </div>
                <div className={"col col-center"}>
                        <CampingMap/>
                </div>
                <div className={"col col-right"}>
                        <BookingForm/>
                </div>

            </div>

        </div>
    </div>
  );
}

export default App;
