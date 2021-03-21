fun main(){
    val allPurchases = 20000
    var purchase = 10000
    val isRegularCustomer = true

    if(allPurchases < 1001){
        purchase -= 0
    }
    else if(allPurchases >= 1001 && allPurchases < 10001){
        purchase -= 100
    }
    else {
        purchase -= purchase*5/100
    }
    purchase -= if(!isRegularCustomer) 0 else purchase/100
    println(purchase)
}