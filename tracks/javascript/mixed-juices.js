/**
 * Determines how long it takes to prepare a certain juice.
 *
 * @param {string} name
 * @returns {number} time in minutes
 */
export function timeToMixJuice(name) {
    let time;
    switch (name) {
        case 'Pure Strawberry Joy':
            time = 0.5;
            break;
        case 'Energizer':
        case 'Green Garden':
            time = 1.5;
            break;
        case 'Tropical Island':
            time = 3;
            break;
        case 'All or Nothing':
            time = 5;
            break;
        default:
            time = 2.5;
            break;
    }
    return time;
}

/**
 * Calculates the number of limes that need to be cut
 * to reach a certain supply.
 *
 * @param {number} wedgesNeeded
 * @param {string[]} limes
 * @returns {number} number of limes cut
 */
export function limesToCut(wedgesNeeded, limes) {
    let totalWedges = 0;
  let limesCut = 0;
  let wedges = 0;  
  
  while ((limesCut < limes.length) && (totalWedges <= wedgesNeeded)) {
    switch (limes[limesCut]) {
      case "small":
        wedges = 6;
        break;
      case "medium":
        wedges = 8;
        break;
      case "large":
        wedges = 10;
        break;
    }    
    totalWedges += wedges;
    if (wedgesNeeded > 0) {
      limesCut++;
    }
  }
  return limesCut;
}

/**
 * Determines which juices still need to be prepared after the end of the shift.
 *
 * @param {number} timeLeft
 * @param {string[]} orders
 * @returns {string[]} remaining orders after the time is up
 */
export function remainingOrders(timeLeft, orders) {
    while (timeLeft > 0) {
        timeLeft = timeLeft - timeToMixJuice(orders[0]);
        orders.shift();
    }
    return orders;
}