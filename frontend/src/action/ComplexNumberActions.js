import axios from 'axios';
import dispatcher from '../dispatcher/Dispatcher';
import * as actionConstants from '../dispatcher/ComplexNumberActionConstants'

export const recordComplexNumber = ({real,imag}) =>{
    axios.get('/complex-number/record',
        {
            params : {
                real : real,
                imag : imag
            }
        })
        .then(() => {
            fetchComplexNumbers();
        })
        .catch((err) => {
            dispatcher.dispatch({
                action : actionConstants.showError,
                payload: err.response.data.message
            });
            fetchComplexNumbers();
        });
}

export const fetchComplexNumbers = () =>{

    axios.get('/complex-number/').then((resp)=>{
        dispatcher.dispatch({
            action : actionConstants.refresh,
            payload: resp.data
        });
    })
}

