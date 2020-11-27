
import axios from 'axios';
import dispatcher from '../dispatcher/Dispatcher';
import * as actionConstants from "../dispatcher/BookingActionConstants"

export const recordBooking = ({slotID,start,end,electricity,caravan,email}) =>{
    axios.post('/reservation/record',
        {
            id: slotID,
            start: start ,
            end:end,
          electricity:electricity,
            caravan:caravan,
            customerEmail:email
        });
}
export const fetchGuests = () =>{

    axios.get('/reservation/').then((resp)=>{
        dispatcher.dispatch({
            action : actionConstants.refresh,
            payload: resp.data
        });
    })
}
