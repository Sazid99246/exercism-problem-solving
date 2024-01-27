export const convert = n => {
    let result = "";
    if (n % 3 == 0) {
        result += "Pling";
    }
    if (n % 5 == 0) {
        result += "Plang";
    }
    if (n % 7 == 0) {
        result += "Plong";
    }
    if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0) {
        result += n;
    }
    return result;
};