import {EventEmitter} from 'events'
import dispatcher from "../dispatcher/Dispatcher";
import {refresh} from '../dispatcher/GuestActionConstants';

class GuestStore extends EventEmitter{

    Guests = [];

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

const store = new GuestStore();
export default store;

dispatcher.register(({action,payload})=>{
    if(action !== refresh ) return;
    store.Guests = payload;
    store.emitChange();
})
