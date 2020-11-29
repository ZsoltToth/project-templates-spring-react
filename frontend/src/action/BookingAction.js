import axios from 'axios';
import dispatcher from '../dispatcher/Dispatcher';
import * as actionConstants from "../dispatcher/BookingActionConstants"

export const recordBooking = ({slotID, start, end, electricity, caravan, email}) => {
    axios.post('/reservation/record',
        {
            slotId: slotID,
            start: start,
            end: end,
            electricity: electricity,
            caravan: caravan,
            customerEmail: email
        })
        .then(() => {

            dispatcher.dispatch({action: actionConstants.clearError});
        })
        .catch((err) => {
            alert("Reservation failed!");
            dispatcher.dispatch({
                action: actionConstants.showError,
                payload: `${err.response.status}-${err.response.statusText}: ${err.response.data.message}`

            });

        });

}
export const fetchBooking = () => {

    axios.get('/reservation/').then((resp) => {
        dispatcher.dispatch({
            action: actionConstants.refresh,
            payload: resp.data
        });
    })
}
