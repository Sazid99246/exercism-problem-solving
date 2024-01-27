const PIZZAS = {
    'Margherita': 7,
    'Caprese': 9,
    'Formaggio': 10
}

/**
 * Determine the prize of the pizza given the pizza and optional extras
 *
 * @param {Pizza} pizza name of the pizza to be made
 * @param {Extra[]} extras list of extras
 *
 * @returns {number} the price of the pizza
 */
export function pizzaPrice(pizza, ...extras) {
    let cost = PIZZAS[pizza];

    for (var e of extras) {
        if (e == 'ExtraSauce') {
            cost += 1;
        } else if (e == 'ExtraToppings') {
            cost += 2;
        }
    }

    return cost;
}

/**
 * Calculate the prize of the total order, given individual orders
 *
 * @param {PizzaOrder[]} pizzaOrders a list of pizza orders
 * @returns {number} the price of the total order
 */
export function orderPrice(pizzaOrders) {
    let cost = 0;

    for (var o of pizzaOrders) {
        cost += pizzaPrice(o.pizza, ...o.extras);
    }

    return cost;
}