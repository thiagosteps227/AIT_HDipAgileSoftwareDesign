let $ = (id) => {
    return document.getElementById(id);
} 
let validationSubTotal = (number) =>{
    if (isNaN(number) || number < 0 || number > 10000){
        return console.error('The subtotal must be a positive number less then 10000');
    }
}
let calculateClick = () => {

    let subtotal = parseFloat($('subtotal').value);
    let tax_rate = parseFloat($('tax_rate').value);
    let isValid = true;
    
    if (isNaN(subtotal) || subtotal < 0 || subtotal > 10000){
        $("subtotal_message").firstChild.nodeValue = "Must be positive and less than 10000";
        isValid = false;
    } else {
        $("subtotal_message").firstChild.nodeValue = "";
        
    }

    if (isNaN(tax_rate) || tax_rate < 0 || tax_rate > 12){
        $('tax_rate_message').firstChild.nodeValue = "Must be positive and less than 12";
        isValid = false;
    } else {
        $('tax_rate_message').firstChild.nodeValue = "";
    }

    if (isValid){
    let salesTaxCalculated = subtotal * (tax_rate/100);
    let total = salesTaxCalculated + subtotal;
    
    // display results
    $('sales_tax').value = salesTaxCalculated;
    $('total').value = total.toFixed(2);
    
    // restore starting messages
    $("subtotal_message").firstChild.nodeValue = "Enter order subtotal";
    $("tax_rate_message").firstChild.nodeValue = "Enter sales tax rate (99.9)";

    }
    $('subtotal').focus();
}

let clearClick = () => {
    $('subtotal').value = "";
    $('tax_rate').value = "";
    $('sales_tax').value = "";
    $('total').value = "";
    $('subtotal').focus();

    // restore starting messages
    $("subtotal_message").firstChild.nodeValue = "Enter order subtotal";
    $("tax_rate_message").firstChild.nodeValue = "Enter sales tax rate (99.9)";

}

let subtotalClick = () => {
    $('subtotal').value = "";
}

let taxRateClick = () => {
    $('tax_rate').value = "";
}

window.onload = () => {
    $('calculate').onclick = calculateClick;
    $('clear').onclick = clearClick;
    $('subtotal').onclick = subtotalClick;
    $('tax_rate').onclick = taxRateClick;
    $('subtotal').focus();
}




