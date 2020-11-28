import React from 'react';
import './App.scss';

import SlotQueryForm from "./component/SlotQueryForm";
import BookingForm from "./component/BookingForm";
import CampingMap from "./component/CampingMap";
import GuestAddForm from "./component/GuestAddForm";

function App() {
  return (
    <div className={["App","container"]}>

        <div className={["myframe", "col-md-offset-1"]}>
            <div className={"row"}>

                <div className={"col col-left"}>
                        <SlotQueryForm/>
                </div>
                <div className={"col col-center"}>
                        <GuestAddForm/>
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
