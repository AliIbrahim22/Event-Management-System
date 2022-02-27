const timeControl = document.querySelector('input[type="datetime-local"]');
const timeControlHidden = document.querySelector('.hid');

timeControl.addEventListener('change', (event) => {
    console.log(timeControl);
    console.log(timeControl.value);
    let date = new Date(timeControl.value);
    console.log(date.toISOString().slice(0, 19).replace('T', ' '));
    timeControlHidden.value = date.toISOString().slice(0, 19).replace('T', ' ');
    console.log(timeControlHidden.value);
});