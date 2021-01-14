
import axios from 'axios';
import dispatcher from '../dispatcher/Dispatcher';
import * as actionConstants from '../dispatcher/GuestActionConstants'

export const recordGuest = ({GuestName,GuestPhone,GuestEmail,GuestAddress}) =>{
    axios.post('/customer/record',
        {
            name : GuestName,
            email: GuestEmail,
            phone : GuestPhone,
            address : GuestAddress
        })

        .then(() => {

            dispatcher.dispatch({action: actionConstants.clearError});
        })
        .catch((err) => {
            alert("Saving guest information failed!");
            dispatcher.dispatch({
                action: actionConstants.showError,
                payload: `${err.response.status}-${err.response.statusText}: ${err.response.data.message}`

            });

        });
}
export const fetchGuests = () =>{

    axios.get('/customer/').then((resp)=>{
        dispatcher.dispatch({
            action : actionConstants.refresh,
            payload: resp.data
        });
    })
}
