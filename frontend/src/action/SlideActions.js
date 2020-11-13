import axios from 'axios';
import dispatcher from '../dispatcher/Dispatcher';
import * as actionConstants from '../dispatcher/SlideActionConstants'

export const recordSlide = ({slideId,name,price}) =>{
    axios.post('/slide/record',
        {
            slideId : slideId,
            name : name,
            price : price
        })
        .then(() => {
            fetchSlides();
            dispatcher.dispatch({action : actionConstants.clearError});
        })
        .catch((err) => {
            dispatcher.dispatch({
                action : actionConstants.showError,
                payload: `${err.response.status}-${err.response.statusText}: ${err.response.data.message}`
            });
            fetchSlides();
        });
}

export const fetchSlides = () =>{

    axios.get('/slide/').then((resp)=>{
        dispatcher.dispatch({
            action : actionConstants.refresh,
            payload: resp.data
        });
    })
}
