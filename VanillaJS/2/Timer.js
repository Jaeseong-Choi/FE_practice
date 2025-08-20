const clockTitle = document.querySelector('.js-clock');

const targetDate = new Date('2025-12-25T00:00:00');

function getClock() {
    const now = new Date();
    const diff = targetDate - now;

    const days = String(Math.floor(diff / (1000 * 60 * 60 * 24))).padStart(2, '0');
    const hours = String(Math.floor((diff / (1000 * 60 * 60)) % 24)).padStart(2, '0');
    const minutes = String(Math.floor((diff / (1000 * 60)) % 60)).padStart(2, '0');
    const seconds = String(Math.floor((diff / 1000) % 60)).padStart(2, '0');

    clockTitle.innerText = `${days}d ${hours}h ${minutes}m ${seconds}s`;
}
getClock();
setInterval(getClock, 1000);
