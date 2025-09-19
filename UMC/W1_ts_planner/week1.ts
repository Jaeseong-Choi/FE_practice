// week1.ts
const inputForm = document.querySelector<HTMLFormElement>('.input-form')!;
const input = document.querySelector<HTMLInputElement>('.input')!;
const todo = document.querySelector<HTMLElement>('.todo')!;
const done = document.querySelector<HTMLElement>('.done')!;

function handleInputInfo(event: SubmitEvent) {
    event.preventDefault();

    const value = input.value.trim();
    if (!value) return;

    const newItem = document.createElement('p');
    newItem.classList.add('todo-item');
    newItem.textContent = value + ' ';

    const completeBtn = document.createElement('button');
    completeBtn.type = 'button';
    completeBtn.classList.add('complete-btn');
    completeBtn.textContent = '완료';

    completeBtn.addEventListener('click', handleCompleteClick);

    newItem.appendChild(completeBtn);
    todo.appendChild(newItem);

    input.value = '';
    input.focus();
}

function handleCompleteClick(e: MouseEvent) {
    const btn = e.currentTarget as HTMLButtonElement;
    const parentP = btn.parentElement as HTMLElement;

    if (parentP.parentElement === todo) {
        done.appendChild(parentP);
        btn.textContent = '삭제';
        btn.classList.remove('complete-btn');
        btn.classList.add('delete-btn');

        btn.removeEventListener('click', handleCompleteClick);
        btn.addEventListener('click', handleDeleteBtn);
    }
}

function handleDeleteBtn(e: MouseEvent) {
    const btn = e.currentTarget as HTMLButtonElement;
    const parentP = btn.parentElement as HTMLElement;
    parentP.remove();
}

inputForm.addEventListener('submit', handleInputInfo);
