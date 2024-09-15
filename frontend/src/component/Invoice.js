import React from "react";
//import * as actions from "../action/CampingMapActions";
import ErrorMessageWell from "./ErrorMessageWell";


class SlotQueryForm extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            name: "Béla",
            email: "example",
            //telefonszám: 123456789,
            //lakcím: "Jókai út 2"
            slotID: 1,
            start: 0,
            end: 0,
            caravan: false,
            electricity: false,
            price: 20000

        };
        //this.formOnChange = this.formOnChange.bind(this);
    }

    /*https://www.iamtimsmith.com/blog/this-state-how-to-use-state-in-react/*/

    render() {
        return (
            <div className={"invoice"}>
                <ErrorMessageWell/>
                <h2>Számla</h2>
                <hr/>
                <h4>Név:</h4>
                <p>{ this.state.name }</p>

                <h4>E-mail:</h4>
                <p>{ this.state.email }</p>

                <h4>Férőhely száma:</h4>
                <p>{ this.state.slotID }</p>

                <h4>Kezdés dátuma:</h4>
                <p>{ this.state.start }</p>

                <h4>Befejezés dátuma:</h4>
                <p>{ this.state.end }</p>

                <h4>Karaván számára?</h4>
                <p>{ this.state.caravan}</p>

                <h4>Szükséges elektromosság?</h4>
                <p>{ this.state.electricity }</p>

                <h4>Kempingezés díja:</h4>
                <p>{ this.state.price }</p>


            </div>

        );
    }
}

export default SlotQueryForm;