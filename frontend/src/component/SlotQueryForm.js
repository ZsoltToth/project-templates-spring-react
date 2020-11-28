import React from "react";
import * as actions from "../action/CampingMapActions";
import ErrorMessageWell from "./ErrorMessageWell";


class SlotQueryForm extends React.Component {
    constructor(props) {
        super(props);
        this.state = {

            from: 0,
            to: 0
        };
        this.formOnChange = this.formOnChange.bind(this);
    }

    formOnChange(event) {
        const {name, value} = event.target;
        this.setState({[name]: value}, () => {
            if (this.state.from !== 0 && this.state.to !== 0) {
               actions.fetchReservedSlots(this.state.from, this.state.to)

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
                                       value={this.state.from}
                                       min="2020-01-01"
                                       onChange={this.formOnChange}/>
                                <br/><br/><br/>

                                <h4>Befejezés dátuma:</h4><br/>
                                <input type="date" id={"to1"} name={"to"}
                                       value={this.state.to}
                                       min="2020-01-01"
                                       onChange={this.formOnChange}/>
                                <br/>
                            </div>
                        </div>
                    </div>

                    <br/><br/><br/><br/>

                </form>
            </div>

            );
    }
}

export default SlotQueryForm;