const h1 = document.querySelector('h1');

function handleMouseClick() {
    const currentColor = h1.style.color;
    let newColor;

    if (currentColor === 'blue') {
        newColor = 'tomato';
    } else if (currentColor === 'tomato') {
        newColor = 'black';
    } else {
        newColor = 'blue';
    }

    h1.style.color = newColor;
}

if (h1.className === 'active') {
    h1.className = '';
} else {
    h1.className = 'active';
}

h1.addEventListener('click', handleMouseClick);
