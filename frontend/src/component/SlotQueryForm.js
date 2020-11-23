import React from "react";
//import * as actions from "../action/SlotActions"; //TODO
import ErrorMessageWell from "./ErrorMessageWell";

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
            <h3>Férőhelyek lekérdezése</h3><br/>
                <form className="myform">
                    <div className="form-group">
                        <div className="row">
                            <div className="col">
                                <h4>Sátor / karaván?</h4>
                                <div className="form-check">
                                    <input className="form-check-input" type="radio" name={"tent_caravan"} id={"tent"}
                                           value={"option1"} checked onChange={this.formOnChange}/>
                                    <label className="form-check-label" htmlFor="tent">
                                        Sátor
                                    </label>
                                </div>
                                <div className="form-check">
                                    <input className="form-check-input" type="radio" name={"tent_caravan"} id={"caravan"}
                                           value={"option2"} onChange={this.formOnChange}/>
                                    <label className="form-check-label" htmlFor="caravan">
                                        Karaván
                                    </label>
                                </div>
                                <br/>
                            </div>
                        </div>
                    </div>
                    <h4>Kempingezés ideje:</h4>
                    <div className="form-group">
                        <div className="row">
                            <div className="col">

                                <label htmlFor="start">Kezdés dátuma:</label><br/>
                                <input type="date" id={"from1"} name={"from"}
                                       value={this.state.startDate}
                                       min="2020-01-01"
                                       onChange={this.formOnChange}/>
                                <br/>
                            </div>

                            <div className="col">
                                <label htmlFor="start">Befejezés dátuma:</label><br/>
                                <input type="date" id={"to1"} name={"to"}
                                       value={this.state.endDate}
                                       min="2020-01-01"
                                       onChange={this.formOnChange}/>
                                <br/>
                            </div>
                        </div>
                    </div>

                    <br/>

                    <button type="submit" className="btn btn-primary" onClick={() => {
                        // TODO
                    }}>Elküld
                    </button>
                </form>
            </div>

            );
    }
}

export default SlotQueryForm;