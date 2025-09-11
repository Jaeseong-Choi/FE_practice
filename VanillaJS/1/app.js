const title = document.querySelector('#title');

function handleTitleClick() {
    title.innerText = 'You clicked!';
    title.style.color = 'purple';
}

function handleMouseEnter() {
    title.style.color = 'red';
    title.innerText = 'Mouse is here';
}

function handleMouseLeave() {
    title.style.color = 'blue';
    title.innerText = 'Mouse just left';
}

function handleWindowResize() {
    document.body.style.backgroundColor = 'tomato';
}

title.addEventListener('click', handleTitleClick);
title.addEventListener('mouseenter', handleMouseEnter);
title.addEventListener('mouseleave', handleMouseLeave);

window.addEventListener('resize', handleWindowResize);
