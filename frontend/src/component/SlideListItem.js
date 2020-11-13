import React from 'react';

function SlideListItem({slideId,name,price}){
    return (
        <span>({slideId},{name},{price})</span>
    );
}

export default SlideListItem;
