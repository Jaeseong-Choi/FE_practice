import './styles.css';
const colors = ['#1abc9c', '#3498db', '#9b59b6', '#f39c12', '#e74c3c'];

const title = document.querySelector('h2');

const superEventHandler = {
    handleMouseEnter: () => {
        title.style.color = colors[0];
        title.innerText = 'Great job! You did it!\nHow about moving the mouse away?';
    },

    handleMouseLeave: () => {
        title.style.color = colors[1];
        title.innerText = 'Nice move!\nNow try right-clicking with your mouse.';
    },

    handleScreenResize: () => {
        title.style.color = colors[2];
        title.innerText = 'Nice move!\nNow try right-clicking with your mouse.';
    },

    handleRightClick: () => {
        title.style.color = colors[3];
        title.innerText = 'Well done! \nYou made it to the end.';
    },
};

title.addEventListener('mouseenter', superEventHandler.handleMouseEnter);
title.addEventListener('mouseleave', superEventHandler.handleMouseLeave);

window.addEventListener('resize', superEventHandler.handleScreenResize);
window.addEventListener('contextmenu', superEventHandler.handleRightClick);
