const form = document.getElementById('add-task-form');
const input = document.getElementById('new-task-input');
const list = document.getElementById('task-list');

form.addEventListener('submit', (e) => {
  e.preventDefault();
  if (input.value.trim() === '') {
    return;
  }
  const task = document.createElement('li');
  task.innerHTML = `<span>${input.value}</span> <button>Remove</button>`;
  list.appendChild(task);
  input.value = '';
  task.querySelector('button').addEventListener('click', () => {
    list.removeChild(task);
  });
});