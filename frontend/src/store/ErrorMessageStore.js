import {EventEmitter} from 'events';
import {default as dispatcher} from '../dispatcher/Dispatcher';
import * as complexNumberActionConstants from '../dispatcher/ComplexNumberActionConstants'
import * as watchActionConstants from '../dispatcher/WatchActionConstants'

class ErrorMessageStore extends EventEmitter{

    _errorMsg = "";

    emitChage(){
        this.emit('Change');
    }

    addOnChangeListener(callback){
        this.addListener('Change', callback);
    }

    removeOnChangeListener(callback){
        this.removeListener('Change',callback);
    }
}
const store = new ErrorMessageStore();
export default store;

dispatcher.register(({action,payload})=>{
    console.log({action : action, payload : payload});
    if(action !== complexNumberActionConstants.showError) return;
    store._errorMsg = payload;
    store.emitChage();
});

dispatcher.register(({action})=>{
   if(action !== complexNumberActionConstants.clearError) return;
   store._errorMsg = "";
   store.emitChage();
});

dispatcher.register(({action,payload})=>{
    console.log({action : action, payload : payload});
    if(action !== watchActionConstants.showError) return;
    store._errorMsg = payload;
    store.emitChage();
});

dispatcher.register(({action})=>{
    if(action !== watchActionConstants.clearError) return;
    store._errorMsg = "";
    store.emitChage();
});