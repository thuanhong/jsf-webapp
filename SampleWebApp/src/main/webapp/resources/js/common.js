// Get the modal
let modal = document.getElementById("myModal");

// Get the button that opens the modal
let btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
let closeModal = document.getElementsByClassName("close")[0];

let orderTemporary = {};

const templateOrder = `
  <div class="toast" style="opacity: 1" data-autohide="false">
    <div class="toast-header">
      <strong class="mr-auto text-primary">TITLE</strong>
      <div class="input-group mb-3" style="width: 7vw">
        <div class="btn btn-success" onclick="decrementAmount(this, 'TITLE')" type="submit">-</div>
        <input type="text" class="form-control" style="border-radius: 5px" value=1>
        <div class="btn btn-primary" onclick="incrementAmount(this, 'TITLE')" type="button">+</div>  
      </div>
      <button type="button" class="ml-2 mb-1 close" onclick="removeItem(this, 'TITLE')" data-dismiss="toast">&times;</button>
    </div>
  </div>
`;

function addItem(name) {
  console.log(name);
  if (!orderTemporary[name]) {
    orderTemporary[name] = 1;
    let tempOrderComponent = document.getElementById("tempOrder");
    let spawnTemplate = templateOrder.replace(/TITLE/g, name);
    tempOrderComponent.innerHTML += spawnTemplate;
  }
}

function removeItem(component, name) {
  console.log(component, name);
  delete orderTemporary[name];
  document
    .getElementById("tempOrder")
    .removeChild(component.parentElement.parentElement);
}

function incrementAmount(component, name) {
  let currentValue = parseInt(component.previousElementSibling.value) + 1;
  orderTemporary[name] = currentValue;
  component.previousElementSibling.value = currentValue;
}

function decrementAmount(component, name) {
  let currentValue = parseInt(component.nextElementSibling.value);
  if (currentValue > 1) {
    orderTemporary[name] = --currentValue;
    component.nextElementSibling.value = currentValue;
  }
}

function showModal(id) {
  let header = document.getElementById("tableId");
  header.innerHTML = id;
  modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
closeModal.onclick = function () {
  for (const prop of Object.getOwnPropertyNames(orderTemporary)) {
    delete orderTemporary[prop];
  }
  modal.style.display = "none";
  document.getElementById("tempOrder").innerHTML = "";
};

function sendParams() {
  if (JSON.stringify(orderTemporary) !== {}) {
    let newOrderTemp = {
      "tableId": document.getElementById("tableId").textContent,
      "listFood": orderTemporary, 
    }
    console.log(JSON.stringify(newOrderTemp));
    document.getElementById("mainForm:txtOrder").value = JSON.stringify(newOrderTemp);
    document.getElementById("mainForm:print").click();
  }
}
