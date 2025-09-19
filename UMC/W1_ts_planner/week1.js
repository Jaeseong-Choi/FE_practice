var inputForm = document.querySelector('.input-form');
var input = document.querySelector('.input');
var todo = document.querySelector('.todo');
var done = document.querySelector('.done');
function handleInputInfo(event) {
    event.preventDefault();
    var value = input.value.trim();
    if (!value) return;
    var newItem = document.createElement('p');
    newItem.classList.add('todo-item');
    newItem.textContent = value + ' ';
    var completeBtn = document.createElement('button');
    completeBtn.type = 'button';
    completeBtn.classList.add('complete-btn');
    completeBtn.textContent = '완료';
    completeBtn.addEventListener('click', handleCompleteClick);
    newItem.appendChild(completeBtn);
    todo.appendChild(newItem);
    input.value = '';
    input.focus();
}
function handleCompleteClick(e) {
    var btn = e.currentTarget;
    var parentP = btn.parentElement;
    if (parentP.parentElement === todo) {
        done.appendChild(parentP);
        btn.textContent = '삭제';
        btn.classList.remove('complete-btn');
        btn.classList.add('delete-btn');
        btn.removeEventListener('click', handleCompleteClick);
        btn.addEventListener('click', handleDeleteBtn);
    }
}
function handleDeleteBtn(e) {
    var btn = e.currentTarget;
    var parentP = btn.parentElement;
    parentP.remove();
}
inputForm.addEventListener('submit', handleInputInfo);
