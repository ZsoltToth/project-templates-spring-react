import React from "react";
import * as actions from '../action/GuestAction';
import ErrorMessageWell from "./ErrorMessageWell";
class GuestAddForm extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            GuestName: 'Béla',
            GuestEmail: 'example@example.com',
            GuestPhone: '123456789',
            GuestAddress: 'Jokai ut 2'
        };
        this.formOnChange = this.formOnChange.bind(this);
    }
    formOnChange(event) {
        const {name, value} = event.target;
        this.setState({[name]: value});
    }

 render() {
    return(
        <div className="insertForm mx-auto mt-5">
            <h3 className="text-center">Vendég létrehozása</h3>
            <div className="table-responsive">
                <ErrorMessageWell/>
                <table className="table borderless">
                    <tbody>
                    <tr>
                        <td>Név</td>
                        <td><input
                            type={"text"}
                            value={this.state.GuestName}
                            onChange={(e)=>{
                                let st = this.state;
                                st.GuestName = e.target.value;
                                this.setState(st);}}
                        /></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type={"text"}
                                   value={this.state.GuestEmail}
                                   onChange={(e)=>{
                                       let st = this.state;
                                       st.GuestEmail = e.target.value;
                                       this.setState(st);
                                   }}
                        /></td>
                    </tr>
                    <tr>
                        <td>Telefonszám</td>
                        <td><input type={"string"}
                                   value={this.state.GuestPhone}
                                   onChange={(e)=>{
                                       let st = this.state;
                                       st.GuestPhone = e.target.value;
                                       this.setState(st);
                                   }}
                        /></td>
                    </tr>
                    <tr>
                        <td>Lakcím</td>
                        <td><input type={"string"}
                                   value={this.state.GuestAddress}
                                   onChange={(e)=>{
                                       let st = this.state;
                                       st.GuestAddress = e.target.value;
                                       this.setState(st);
                                   }}
                        /></td>
                    </tr>

                    <tr>
                        <td
                            colSpan={2}>
                            <button
                                className="btn btn-info"
                                onClick={()=>{actions.recordGuest(this.state)}}
                            >Létrehoz
                            </button>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
         )
    }
}
export default GuestAddForm