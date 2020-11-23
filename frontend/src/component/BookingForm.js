import React from "react";
import ErrorMessageWell from "./ErrorMessageWell";
//import * as actions from "../action/ReservationAction";
//import {withRouter} from "react-router-dom";

class ReservationRecordingForm extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            slot: 0,
            electricity: false,
            name: "",
            address: "",
            id_card: "",
            phone:"",

            end: this.props.location.state.end,
            paymentStatus: "NOT_PAID",
            slotId: this.props.location.state.id,
            start: this.props.location.state.start,
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

                    <form class="myform">
                        <h3>Foglalás</h3><br/>
                        <div class="form-group">
                            <div class="row">
                                <div class="col">
                                    <h4>Férőhely száma:</h4>
                                    <input type="id_card" class="form-control" name={"slot"} id={"slot"} onChange={this.formOnChange}/>
                                </div>
                                <div class="col">
                                </div>
                            </div>
                        </div>
                        <br/>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col">
                                        <h4>Szükséges elektromosság?</h4>
                                        <div class="form-check">
                                            <input class="form-check-input" type="radio" name={"elektricity"} id={"elektr-i"} value={"option1"} checked onChange={this.formOnChange}/>
                                                <label class="form-check-label" for="elektr-i">
                                                    Igen
                                                </label>
                                        </div>
                                        <div class="form-check">
                                            <input class="form-check-input" type="radio" name={"elektricity"} id={"elektr-n"} value={"option2"} onChange={this.formOnChange}/>
                                                <label class="form-check-label" for="elektr-n">
                                                    Nem
                                                </label>
                                        </div>
                                        <br/>
                                    </div>
                                </div>
                            </div>


                            <h4>Vendég adatai:</h4>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col">
                                        <label for="exampleInputName">Név</label>
                                        <input type="name" class="form-control" name={"name"} id={"name"} onChange={this.formOnChange}/>
                                    </div>
                                    <div class="col">
                                        <label for="exampleInputName">Lakcím</label>
                                        <input type="address" class="form-control" name={"address"} id={"address"} onChange={this.formOnChange}/>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col">
                                        <label for="exampleInputName">Személyi szám</label>
                                        <input type="id_card" class="form-control" name={"id_card"} id={"id_card"} onChange={this.formOnChange}/>
                                    </div>
                                    <div class="col">
                                        <label for="exampleInputName">Telefonszám</label>
                                        <input type="phone" class="form-control" name={"phone"} id={"phone"} onChange={this.formOnChange}/>
                                    </div>
                                </div>
                            </div>

                            <br/>
                                <button type="submit" class="btn btn-primary" onClick={() =>{
                                    // TODO
                                }}>Foglal</button>
                    </form>
            </div>
        );
    }
}

export default BookingForm;