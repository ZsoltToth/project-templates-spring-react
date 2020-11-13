import axios from 'axios';
import dispatcher from '../dispatcher/Dispatcher';
import * as watchActionConstants from '../dispatcher/WatchActionConstants'

export const recordWatch = ({watchId}) =>{
    axios.post('/watch/create',
        {
            watchId : watchId,
        })
        .then(() => {
            fetchWatches();
            dispatcher.dispatch({action : watchActionConstants.clearError});
        })
        .catch((err) => {
            dispatcher.dispatch({
                action : watchActionConstants.showError,
                payload: `${err.response.status}-${err.response.statusText}: ${err.response.data.message}`
            });
            fetchWatches();
        });
}

export const deleteWatch = (watchId) =>{
    axios.delete(`/watch/${watchId}`)
        .then(() => {
            fetchWatches();
            dispatcher.dispatch({action : watchActionConstants.clearError});
        })
        .catch((err) => {
            dispatcher.dispatch({
                action : watchActionConstants.showError,
                payload: `${err.response.status}-${err.response.statusText}: ${err.response.data.message}`
            });
            fetchWatches();
        });
}

export const fetchWatches = () =>{

    axios.get('/watch/').then((resp)=>{
        dispatcher.dispatch({
            action : watchActionConstants.refresh,
            payload: resp.data
        });
    })
}

