import React from "react";
import * as watchActions from '../action/WatchActions'
import ErrorMessageWell from "./ErrorMessageWell";

class WatchRecordingForm extends React.Component{

    constructor(props) {
        super(props);
        this.state = {
            watchId : "",
        };
        this.formOnChange = this.formOnChange.bind(this);
    }

    formOnChange(event){
        const {name,value} = event.target;
        this.setState({[name] : value});
    }

    render() {
        return(
            <div>
                <ErrorMessageWell/>
                <label htmlFor={"watchId"} >Karóra ID</label>
                <input type={"text"} id={"watchId"} name={"watchId"} placeholder={"ID"} value={this.state.watchId} onChange={this.formOnChange}/>
                <br/>
                <button onClick={()=> watchActions.fetchWatches()}>Kilistázás</button>
                <button onClick={()=> watchActions.recordWatch(this.state)}>Felvétel</button>
                <button onClick={()=> watchActions.deleteWatch(this.state.watchId)}>Törlés</button>
            </div>
        );
    }
}

export default WatchRecordingForm
