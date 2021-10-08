import React from 'react';
import './App.scss';

import SlotQueryForm from "./component/SlotQueryForm";
import BookingForm from "./component/BookingForm";
import CampingMap from "./component/CampingMap";
import GuestAddForm from "./component/GuestAddForm";

function App() {
  return (
    <div className={"App"}>
        <div className={"container"}>
            <div className={"bg"}></div>

            <div className={"row"}>

                <div className={"col col-3 col-left full-height"}>
                    <SlotQueryForm/>
                    <GuestAddForm/>
                </div>
                <div className={"col  col-center full-height"}>

                    <CampingMap/>
                </div>
                <div className={"col col-3 col-right full-height"}>
                        <BookingForm/>
                </div>


            </div>
        </div>

    </div>
  );
}

export default App;
