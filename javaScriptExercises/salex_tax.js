let $ = (id) => {
    return document.getElementById(id);
} 
let validationSubTotal = (number) =>{
    if (isNaN(number) || number < 0 || number > 10000){
        return console.error('The subtotal must be a positive number less then 10000');
    }
}
function salesTaxCalculator(){

    let subtotal = $('subtotal').value;
    let tax_rate = $('tax_rate').value;
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

    if (isValid === true){
    let salesTaxCalculated = parseFloat(subtotal) * (parseFloat(tax_rate)/100);
    let total = salesTaxCalculated + parseFloat(subtotal);
    
    // display results
    $('sales_tax').value = salesTaxCalculated;
    $('total').value = total.toFixed(2);
    
    // restore starting messages
    $("subtotal_message").firstChild.nodeValue = "Enter order subtotal";
    $("tax_rate_message").firstChild.nodeValue = "Enter sales tax rate (99.9)";

    }
}





