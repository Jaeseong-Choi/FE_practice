const h1 = document.querySelector('h1');
const body = document.querySelector('body');

function handleScreenResize() {
    const screenWidth = window.innerWidth;

    if (screenWidth < 700) {
        body.classList.add('bg-first');
        body.classList.remove('bg-second', 'bg-third');
        h1.innerText = 'Resize the window to begin filling your power!';
    } else if (screenWidth >= 700 && screenWidth <= 1400) {
        body.classList.add('bg-second');
        body.classList.remove('bg-first', 'bg-third');
        h1.innerText = 'Almost there! Just a little more to go 💪';
    } else {
        body.classList.add('bg-third');
        body.classList.remove('bg-first', 'bg-second');
        h1.innerText = 'Well done! You made it — have an amazing day ✨';
    }
}

handleScreenResize();

window.addEventListener('resize', handleScreenResize);
