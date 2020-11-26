import React from "react";
//import * as actions from "../action/SlotActions"; //TODO
import ErrorMessageWell from "./ErrorMessageWell";
import CampingMap from "./CampingMap"; //campingmap mert ebben a mappában van

class SlotQueryForm extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            tent_caravan: "option1",
            startDate: "2021-05-01",
            endDate: "2021-05-07"
        };
        this.formOnChange = this.formOnChange.bind(this);
    }

    formOnChange(event) {
        const {name, value} = event.target;
        this.setState({[name]: value}, () => {
            if (this.state.startDate !== 0 && this.state.endDate !== 0) {
               // actions.fetchFreeSlots(this.state) //TODO - ez az action nekünk még nincs

            }
        });
    }

    render() {
        return (
            <div>
                <ErrorMessageWell/>
            <h2>Férőhelyek lekérdezése</h2><hr/>
                <form className="myform">
                    <div className="form-group">
                        <div className="row">
                            <div className="col">

                            </div>
                        </div>
                    </div>
                    <h4>Kempingezés ideje:</h4><br/>
                    <div className="form-group">
                        <div className="row">
                            <div className="col">

                                <h4>Kezdés dátuma:</h4><br/>
                                <input type="date" id={"from1"} name={"from"}
                                       value={this.state.startDate}
                                       min="2020-01-01"
                                       onChange={this.formOnChange}/>
                                <br/><br/><br/>

                                <h4>Befejezés dátuma:</h4><br/>
                                <input type="date" id={"to1"} name={"to"}
                                       value={this.state.endDate}
                                       min="2020-01-01"
                                       onChange={this.formOnChange}/>
                                <br/>
                            </div>
                        </div>
                    </div>

                    <br/><br/><br/><br/>

                    <button type="submit" className="btn btn-primary" onClick={() => {
                        CampingMap.getIds();

                    }}>Elküld
                    </button>
                </form>
            </div>

            );
    }
}

export default SlotQueryForm;