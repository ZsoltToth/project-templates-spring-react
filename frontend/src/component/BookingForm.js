import React from "react";
import ErrorMessageWell from "./ErrorMessageWell";

import * as actions from "../action/BookingAction";

class BookingForm extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            slotID: 0,
            caravan: false,
            electricity: false,
            start: 0,
            end: 0,
            email: "g@g.hu"

        };
        this.formOnChange = this.formOnChange.bind(this);
    }

    formOnChange(event) {
        const {name, value} = event.target;
        if (name === "electricity") {
            this.setState({[name]: !this.state.electricity})
        } else {
            this.setState({[name]: value});
        }
    }

    render() {
        return (
            <div>
                <ErrorMessageWell/>

                <form className={"myform"}>
                    <h2>Foglalás</h2>
                    <hr/>
                    <div className={"form-group"}>
                        <div className="d-flex justify-content-md-start">
                            <div className="p-2">
                                <h4>Férőhely száma:</h4>
                                <input
                                    type="id_card"
                                    className={"form-control myinput"}
                                    name={"slotID"}
                                    id={"slotID"}
                                    value={this.state.slotID}

                                    onChange={(e) => {
                                        let st = this.state;
                                        st.slotID = e.target.value;
                                        this.setState(st);
                                    }}
                                />
                            </div>

                        </div>
                    </div>
                    <br/>
                    <div>
                        <h4>Sátor / karaván?</h4>

                        <div className="form-check">
                            <input className="form-check-input myinput" type="radio" name={"tent_caravan"} id={"tent"}
                                   value={this.state.caravan = "false"} onChange={(e) => {
                                let st = this.state;
                                st.caravan = e.target.value;
                                this.setState(st);
                            }}/>
                            <label className="form-check-label" htmlFor="tent">
                                Sátor
                            </label>
                        </div>
                        <div className="form-check">
                            <input className="form-check-input myinput" type="radio" name={"tent_caravan"} id={"caravan"}
                                   value={this.state.caravan = "true"}
                                   onChange={(e) => {
                                       let st = this.state;
                                       st.caravan = e.target.value;
                                       this.setState(st);
                                   }}/>
                            <label className="form-check-label" htmlFor="caravan">
                                Karaván
                            </label>
                        </div>

                    </div><br/>
                    <div className="form-group">
                        <div className="d-flex justify-content-md-start">
                            <div className="p-2">
                                <h4>Szükséges elektromosság?</h4>
                                <div className="form-check">
                                    <input className="form-check-input myinput" type="radio" name={"electricity"}
                                           id={"elektr-i"}
                                           value={this.state.electricity = "true"}
                                           onChange={(e) => {
                                               let st = this.state;
                                               st.electricity = e.target.value;
                                               this.setState(st);
                                           }}/>
                                    <label className="form-check-label">
                                        Igen
                                    </label>
                                </div>
                                <div className="form-check">
                                    <input className="form-check-input myinput" type="radio" name={"electricity"}
                                           id={"elektr-n"}
                                           value={this.state.electricity = "false"}
                                           onChange={(e) => {
                                               let st = this.state;
                                               st.electricity = e.target.value;
                                               this.setState(st);
                                           }}/>
                                    <label className="form-check-label">
                                        Nem
                                    </label>
                                </div>
                                <br/>
                            </div>
                        </div>
                    </div>

                    <div className="form-group">
                        <div className="d-flex justify-content-md-start">
                            <div className="p-2">

                                <h4>Kezdés dátuma:</h4>
                                <input className={"form-control myinput"} type="date" id={"start"} name={"start"}
                                       value={this.state.start}
                                       min="2020-01-01"
                                       onChange={(e) => {
                                           let st = this.state;
                                           st.start = e.target.value;
                                           this.setState(st);
                                       }}/>
                            </div>
                            <div className="p-2">
                                <h4>Befejezés dátuma:</h4>
                                <input className={"form-control myinput"} type="date" id={"end"} name={"end"}
                                       value={this.state.end}
                                       min="2020-01-01"
                                       onChange={(e) => {
                                           let st = this.state;
                                           st.end = e.target.value;
                                           this.setState(st);
                                       }}/>
                                <br/>
                            </div>
                        </div>
                    </div>

                    <div className="form-group">

                        <h4>Vendég e-mail címe:</h4>

                                <input className={"myinput"} type="name" className="form-control" name={"email"} id={"email"}
                                       value={this.state.email}
                                       onChange={(e) => {
                                           let st = this.state;
                                           st.email = e.target.value;
                                           this.setState(st);
                                       }}/>
                            </div>


                    <br/>
                    <button type="submit" className="btn btn-info"
                            onClick={() => {
                                actions.recordBooking(this.state);

                            }}>Foglal
                    </button>
                    <br/><br/><br/>
                </form>
            </div>
        );
    }
}

export default BookingForm;