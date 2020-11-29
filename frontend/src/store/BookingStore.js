import {EventEmitter} from 'events'
import dispatcher from "../dispatcher/Dispatcher";
import {refresh} from '../dispatcher/BookingActionConstants';

class BookingStore extends EventEmitter{

    _bookings = [];

    emitChange(){
        this.emit('Change');
    }

    addChangeListener(callback){
        this.addListener('Change',callback);
    }

    removeChangeListener(callback){
        this.removeListener('Change',callback);
    }
}

const store = new BookingStore();
export default store;

dispatcher.register(({action,payload})=>{
    if(action !== refresh ) return;
    store._bookings = payload;
    store.emitChange();
})
