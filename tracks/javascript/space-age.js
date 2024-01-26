export const age = (planet, ageInSeconds) => {
    
    switch (planet) {
        case "mercury":
            return Number((ageInSeconds / (31557600  * 0.2408467)).toFixed(2));
        case "venus":
            return Number((ageInSeconds / (31557600  * 0.61519726)).toFixed(2));
        case "earth":
            return Number((ageInSeconds / 31557600).toFixed(2));
        case "mars":
            return Number((ageInSeconds / (31557600  * 1.8808158)).toFixed(2));
        case "jupiter":
            return Number((ageInSeconds / (31557600  * 11.862615)).toFixed(2));
        case "saturn":
            return Number((ageInSeconds / (31557600  * 29.447498)).toFixed(2));
        case "uranus":
            return Number((ageInSeconds / (31557600  * 84.016846)).toFixed(2));
        case "neptune":
            return Number((ageInSeconds / (31557600  * 164.79132)).toFixed(2));
    }
};