import React from "react";
import ErrorMessageWell from "./ErrorMessageWell";
import * as slideActions from "../action/SlideActions";
class SlideRecordingForm extends React.Component{

    constructor(props) {
        super(props);
        this.state = {
            slideId : 0,
            name :"",
            price : 0
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
                <label htmlFor={"slideId"} >Csúszda ID</label>
                <input type={"number"} id={"slideId"} name={"slideId"} value={this.state.slideId} onChange={this.formOnChange}/>
                <br/>
                <label htmlFor={"name"}>Név</label>
                <input type={"text"} id={"name"} name={"name"} value={this.state.name} onChange={this.formOnChange}/>
                <br/>
                <label htmlFor={"price"}>Ár</label>
                <input type={"text"} id={"price"} name={"price"} value={this.state.price} onChange={this.formOnChange}/>
                <br/>
                <button onClick={()=> slideActions.recordSlide(this.state)}>Felvétel</button>
                <button onClick={()=> slideActions.fetchSlides()}>Kilistázás</button>
                <button onClick={()=> slideActions.deleteSlide(this.state.slideId)}>Törlés</button>
            </div>
        );
    }
}

export default SlideRecordingForm
