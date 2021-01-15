import axios from 'axios';
import dispatcher from '../dispatcher/Dispatcher';
import * as actionConstants from '../dispatcher/CampingMapConstants'



export const fetchReservedSlots = (from, to) =>{

    axios.get('/camping-slot/'+from+'&'+to).then((resp)=>{
        dispatcher.dispatch({
            action : actionConstants.refresh,
            payload: resp.data
        });
    })
}
