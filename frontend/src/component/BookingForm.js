import React from "react";
import ErrorMessageWell from "./ErrorMessageWell";

class BookingForm extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            slot: 0,
            electricity: false,
            name: "",
            address: "",
            id_card: "",
            phone:""

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
                        <h2>Foglalás</h2><hr/>
                        <div className={"form-group"}>
                            <div className={"row"}>
                                <div className={"col"}>
                                    <h4>Férőhely száma:</h4>
                                    <input type="id_card" className={"form-control"} name={"slot"} id={"slot"} onChange={this.formOnChange}/>
                                </div>
                                <div className="col">
                                </div>
                            </div>
                        </div>
                        <br/>
                        <div>
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
                            <div className="form-group">
                                <div className="row">
                                    <div className="col">
                                        <h4>Szükséges elektromosság?</h4>
                                        <div className="form-check">
                                            <input className="form-check-input" type="radio" name={"elektricity"} id={"elektr-i"} value={"option1"} checked onChange={this.formOnChange}/>
                                                <label className="form-check-label">
                                                    Igen
                                                </label>
                                        </div>
                                        <div className="form-check">
                                            <input className="form-check-input" type="radio" name={"elektricity"} id={"elektr-n"} value={"option2"} onChange={this.formOnChange}/>
                                                <label className="form-check-label">
                                                    Nem
                                                </label>
                                        </div>
                                        <br/>
                                    </div>
                                </div>
                            </div>



                            <div className="form-group">
                                <h4>Vendég e-mail címe:</h4>
                                <div className="row">

                                    <div className="col col-min">
                                        <input type="name" className="form-control" name={"email"} id={"email"} onChange={this.formOnChange}/>
                                    </div>
                                </div>
                            </div>

                            <br/>
                                <button type="submit" className="btn btn-primary" onClick={() =>{
                                    // TODO
                                }}>Foglal</button><br/><br/><br/>
                    </form>
            </div>
        );
    }
}

export default BookingForm;