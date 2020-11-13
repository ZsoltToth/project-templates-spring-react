import {EventEmitter} from 'events'
import dispatcher from "../dispatcher/Dispatcher";
import {refresh} from '../dispatcher/WatchActionConstants'

class WatchStore extends EventEmitter{

    _watches = [];

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

const store = new WatchStore();
export default store;

dispatcher.register(({action,payload})=>{
    if(action !== refresh ) return;
    store._watches = payload;
    store.emitChange();
})
