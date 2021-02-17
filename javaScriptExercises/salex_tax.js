let $ = (id) => {
    return document.getElementById(id);
} 


function salesTaxCalculator(){

    let subtotal = document.getElementById('subtotal').value;
    let tax_rate = document.getElementById('tax_rate').value;
    let salesTaxCalculated = parseFloat(subtotal) * (parseFloat(tax_rate)/100);
    let total = salesTaxCalculated + parseFloat(subtotal);

    $('total').value = total;
    $('sales_tax').value = salesTaxCalculated;
}
