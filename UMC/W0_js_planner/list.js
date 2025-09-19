const inputBoxForm = document.querySelector('.input-box-form');
const input = document.querySelector('.input-box');
const todo = document.querySelector('.todo');
const todoDone = document.querySelector('.todo-done');

function handleSubmitInfo(event) {
    event.preventDefault();

    const value = input.value.trim();
    if (!value) return;

    const newItem = document.createElement('p');
    newItem.classList.add('todo-item');
    newItem.textContent = value + ' ';

    const completeBtn = document.createElement('button');
    completeBtn.classList.add('pill-btn', 'newButton');
    completeBtn.textContent = '완료';

    completeBtn.addEventListener('click', handleCompleteBtn);

    newItem.appendChild(completeBtn);
    todo.appendChild(newItem);

    input.value = '';
}

function handleCompleteBtn(e) {
    const parentP = e.target.parentNode;

    if (parentP.parentNode === todo) {
        todoDone.appendChild(parentP);
        e.target.textContent = '삭제';

        e.target.removeEventListener('click', handleCompleteBtn);
        e.target.addEventListener('click', handleDeleteBtn);
    }
}

function handleDeleteBtn(e) {
    const parentP = e.target.parentNode;
    parentP.remove();
}
inputBoxForm.addEventListener('submit', handleSubmitInfo);
