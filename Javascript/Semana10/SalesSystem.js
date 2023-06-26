class Product {

    static productCounter = 0;

    constructor(name, price) {
        this._idProduct = ++Product.productCounter;
        this._name = name;
        this._price = price;
    }

    getIdProduct() {
        return this._idProduct;
    }

    getName() {
        return this._name;
    }

    setName(name) {
        this._name = name;
    }

    getPrice() {
        return this._price;
    }

    setPrice(price) {
        this._price = price;
    }

    toString() {
        return `idProduct: ${this._idProduct}, name: ${this._name}, price: $${this._price}`;
    }
} // End of product class.

class Order{

    static orderCounter = 0;

    static getMAX_PRODUCTS() {
        return 5;
    }

    constructor(){
        this._idOrder = ++Order.orderCounter;
        this._products = [];
        this._counterOfAddedProducts = 0;
    }

    get idOrder() {
        return this._idOrder;
    }

    addProduct(product) {
        if(this._products.length < Order.getMAX_PRODUCTS()) {
            this._products.push(product);
            this._
        } else {
            console.log("It is not possible to add any more products.");
        }
    } // End of addProduct method

    calculateTotal() {
        let saleTotal = 0;
        
        for(let product of this._products) {
            saleTotal += product.getPrice();
        }
        return saleTotal;
    } // End of calculateTotal method

    displayOrder() {
        let order = '';

        for(let product of this._products) {
            order += '\n{ ' +product.toString() + ' }';
        }
        console.log(`Order: ${this._idOrder}, Total: $${this.calculateTotal()}, Products: ${order}`);
    } //End of the showOrder method

} //End of Order class

let product01 = new Product('Iphone 12', 2500);
let product02 = new Product('Iphone 13', 3000);
let product03 = new Product('Iphone 14', 3500);
let order01 = new Order();
order01.addProduct(product01);
order01.addProduct(product02);
order01.displayOrder();
let order02 = new Order();
order02.addProduct(product03);
order02.displayOrder();